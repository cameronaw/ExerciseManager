import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Manager {
    final public static int MAX_CHAPTERS = 18;
    final public static int MAX_LESSONS = 51;
    static boolean boot = true;

    //TODO: completely revamp class search function via reflective api
    //TODO: add ability to find main class and its properties reflectively regardless of class name 

    //User input command list
    public enum Commands {
        HELP("help", "displays the help menu"),
        LIST("list", "lists available exercises"),
        RUN("run <ch>.<ls>", "runs an exercise"),
        CLEAR("clear", "clears the screen"),
        EXIT("exit", "exits the program");

        final private String use;
        final private String description;

        Commands(String use, String description) {
            this.use = use;
            this.description = description;
        }

        public static Commands findCommand(String input) {
            Commands output = null;
            for(Commands cmd : Commands.values()) {
                if(cmd.name().toLowerCase().equals(input)) {
                    output = cmd;
                }
            }
            return output;
        }
    }

    //Obtains all exercise classes and command references
    public static Class<?>[][] getExercises() {
        Class<?>[][] output = new Class<?>[MAX_CHAPTERS][MAX_LESSONS];
        for(int i = 0; i < MAX_CHAPTERS; i++) {
            for(int j = 0; j < MAX_LESSONS; j++) {
                try {
                    Class<?> exercise = Class.forName("Exercise" + String.format("%02d", (i + 1)) + "_" + String.format("%02d", (j + 1)));
                    output[i][j] = exercise;
                } catch(ClassNotFoundException e) {
                    output[i][j] = null;
                }
            }
        }
        //System.out.println(Arrays.deepToString(output));
        return output;
    }

    //Underlines a specific string depending on its length
    public static String underlineText(String input) {
        String output = "\n";
        String[] inputArray = input.split("\n");
        for(int i = 0; i < inputArray[inputArray.length - 1].length(); i++) {
            if(inputArray[inputArray.length - 1].charAt(i) == '\t') {
                output += "========";
                continue;
            }
            output += "=";
        }
        return output;
    }

    public static void main(String[] args) {
        Commands[] cmdList = Commands.values();
        Class<?>[][] exerciseArray = getExercises();
        Scanner in = new Scanner(System.in);
        String output = "Welcome to the Java Exercises Manager! Use the 'help' command to view possible arguments.";

        while(boot) {
            System.out.println(output);
            output = "";
            String input = in.nextLine();
            String[] inSplit = input.split(" ");
            try {
                switch(Commands.findCommand(inSplit[0])) {
                    //show help arguments
                    case HELP:
                        output = "- possible arguments:";
                        output += underlineText(output);
                        for(Commands cmd : cmdList) {
                            output += String.format("\n- %-16s%-16s", cmd.use, cmd.description);
                        }
                        break;
                    //show list of available exercises
                    case LIST:
                        output = "- available exercises:\n";
                        for(int i = 0; i < MAX_CHAPTERS; i++) {
                            if(exerciseArray[i][0] == null) continue;
                            output += "\n| Chapt. <" + String.format("%02d" , (i + 1)) + "> |";
                            output += underlineText(output);
                            for(int j = 0; j < MAX_LESSONS; j++) {
                                if(exerciseArray[i][j] == null) continue;
                                output += "\n- Lesson <" + String.format("%02d", (j + 1)) + "> -";
                            }
                            output += "\n";
                        }
                        break;
                    //run the desired exercise
                    case RUN:
                        try {
                            //see if run parameter exists
                            if(inSplit.length <= 1) {
                                output = "- please specify an exercise";
                                break;
                            }
                            //see if run parameters are set up correctly
                            String[] paramSplit = inSplit[1].split("\\.");
                            if(paramSplit.length <= 1) {
                                output = "- incorrect exercise format";
                                break;
                            }
                            //see if exercise exists
                            try {
                                int i = Integer.parseInt(paramSplit[0]);
                                int j = Integer.parseInt(paramSplit[1]);
                                Class<?> exercise = exerciseArray[i - 1][j - 1];
                                if(exercise == null) {
                                    output = "- exercise not found";
                                    break;
                                }
                                //print run statement
                                String runStr = "- Running Exercise <" + String.format("%02d.%02d", i, j) + "> ...";
                                System.out.println(runStr + underlineText(runStr));
                                output = underlineText(runStr) + "\n- exited with code 0";

                                //invoke main method of exercise
                                Method main = exercise.getMethod("main", String[].class);
                                main.invoke(null, (Object) args);
                                break;
                            } catch(ArrayIndexOutOfBoundsException ee) {
                                output = "- exercise not found";
                                break;
                            }
                            
                        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                            StringWriter sw = new StringWriter();
                            e.printStackTrace(new PrintWriter(sw));
                            String error = sw.toString();
                            output = "- exercise unable to load\n- please refer to the stack trace below:\n" + error + underlineText("\t" + error) + "\n- exited with code 1";
                            break;
                        }
                    //clears the screen with a ANSI escape code
                    case CLEAR:
                        output = "\033[H\033[2J";
                        System.out.flush();
                        break;
                    //exits the program
                    case EXIT:
                        boot = false;
                        in.close();
                        break;
                }
            } catch(NullPointerException e) {
                output = "Invalid command. Type 'help' for a list of commands.";
            }
        }
    }
}