import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Manager {
    //User input command list
    public enum Commands {
        HELP("help", "displays the help menu"),
        LIST("list", "lists available exercises"),
        RUN("run <name>", "runs an exercise"),
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
    //TODO: completely revamp class search function via reflective api
    //TODO: add ability to find main class and its properties reflectively regardless of class name 
    //TODO: add ability to run an exercise with runtime errors without crashing the manager
    public static LinkedHashMap<String, Class<?>> getExercises() {
        LinkedHashMap<String, Class<?>> output = new LinkedHashMap<>();
        //this is disgusting lol
        for(int i = 1; i <= 18; i++) {
            try {
                Class.forName("Exercise" + String.format("%02d", i) + "_01");
                for(int j = 1; j <= 51; j++) {
                    try {
                        output.put(String.format("%02d", i) + "." + String.format("%02d", j), Class.forName("Exercise" + String.format("%02d", i) + "_" + String.format("%02d", j)));
                    } catch (ClassNotFoundException ee) {
                        break;
                    }
                }
            } catch(ClassNotFoundException e) {
                break;
            }
        }
        return output;
    }

    //Underlines a specific string depending on its length
    public static String underlineText(String input) {
        String output = "\n";
        for(int i = 0; i < input.length(); i++) {
            output += "=";
        }
        return output;
    } 

    public static void main(String[] args) {
        boolean boot = true;
        Commands[] cmdList = Commands.values();
        LinkedHashMap<String, Class<?>> exerciseTable = getExercises();
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
                            output += "\n- " + cmd.use + ":\t" + cmd.description;
                        }
                        break;
                    //show list of available exercises
                    case LIST:
                        output = "- available exercises:";
                        output += underlineText(output);
                        for(String exercise : exerciseTable.keySet()) {
                            output += "\n- " + "Exercise <" + exercise + ">";
                        }
                        break;
                    //run the desired exercise
                    case RUN:
                        try {
                            if(inSplit.length > 1) {
                                //access exercise class
                                Class<?> exercise = exerciseTable.get(inSplit[1]);
                                if(exercise != null) {
                                    //running statement
                                    String runStr = "- Running " + inSplit[1] + " ...";
                                    System.out.println(runStr + underlineText(runStr));
                                    output = underlineText(runStr) + "\n- exited with code 0";
                                    
                                    //invoke main method of exercise
                                    Method main = exercise.getMethod("main", String[].class, Scanner.class);
                                    main.invoke(null, (String[]) args, (Scanner) in);
                                    in.nextLine();
                                } else {
                                    output = "- exercise not found";
                                }
                            } else {
                                output = "- please specify an exercise";
                            }
                        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                            output = "- exercise unable to load\n- (if you see this message, please contact the developer)";
                        }
                        break;
                    //clears the screen with a ANSI escape code
                    case CLEAR:
                        output = "\033[H\033[2J";
                        System.out.flush();
                        break;
                    //exits the program
                    case EXIT:
                        boot = false;
                        break;
                }
            } catch(NullPointerException e) {
                output += "Invalid command. Type 'help' for a list of commands.";
            }
        }
    }
}
