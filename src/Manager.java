import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Hashtable;
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
    //TODO: implement class search via framework/api like Spring
    public static Hashtable<String, Class<?>> getExercises() {
        Hashtable<String, Class<?>> output = new Hashtable<>();
        //this is disgusting lol
        for(int i = 1; i <= 18; i++) {
            try {
                Class.forName("Ch" + i + "Ex1");
                for(int j = 1; j <= 51; j++) {
                    try {
                        //TODO: implement ability to find description via reflection (maybe)
                        output.put(i + "." + j, Class.forName("Ch" + i + "Ex" + j));
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
        Hashtable<String, Class<?>> exerciseTable = getExercises();
        Scanner in = new Scanner(System.in);
        String output = "Welcome to the Java Exercises Manager! Use the 'help' command to view possible arguments.";

        while(boot) {
            System.out.println(output);
            output = "";
            String input = in.nextLine();
            String[] inSplit = input.split(" ");
            try {
                switch(Commands.findCommand(inSplit[0])) {
                    case HELP:
                    //show help arguments
                        output = "- possible arguments:";
                        output += underlineText(output);
                        for(Commands cmd : cmdList) {
                            output += "\n- " + cmd.use + ":\t" + cmd.description;
                        }
                        break;
                    case LIST:
                    //show list of available exercises
                        output = "- available exercises:";
                        output += underlineText(output);
                        for(String exercise : exerciseTable.keySet()) {
                            output += "\n- " + "Exercise <" + exercise + ">";
                        }
                        break;
                    case RUN:
                    //run the desired exercise
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
                                    //TODO: implement ability to find main method regardless of name
                                    //TODO: implement ability to exit exercise with runtime error without stopping program
                                    Method main = exercise.getMethod("main", String[].class, Scanner.class);
                                    main.invoke(null, (String[]) args, (Scanner) in);
                                } else {
                                    output = "- exercise not found";
                                }
                            } else {
                                output = "- please specify an exercise";
                            }
                        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                            output = "- exercise unable to load\n- (if you see this message, please contact the developer lolz)";
                        }
                        break;
                    case CLEAR:
                    //clears the screen with a ANSI escape code
                        output = "\033[H\033[2J";
                        System.out.flush();
                        break;
                    case EXIT:
                    //exits the program
                        boot = false;
                        break;
                }
            } catch(NullPointerException e) {
                output += "Invalid command. Type 'help' for a list of commands.";
            }
        }
    }
}
