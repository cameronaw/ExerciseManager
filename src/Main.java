import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public enum Commands {
        //cmd enums
        HELP("help", "displays the help menu"),
        LIST("list", "lists available exercises"),
        RUN("run {exe}", "runs an exercise"),
        CLEAR("clear", "clears the screen"),
        EXIT("exit", "exits the program");

        //properties
        final private String use;
        final private String description;

        //setup
        Commands(String use, String description) {
            this.use = use;
            this.description = description;
        }

        //find cmd
        public static Commands searchCommand(String input) {
            Commands output = null;
            for(Commands cmd : Commands.values()) {
                if(cmd.name().toLowerCase().equals(input)) {
                    output = cmd;
                }
            }
            return output;
        }
    }

    public static void main(String[] args) {
        //setup
        Commands[] cmdList = Commands.values();
        final String[] classList = {"RobotTravel", "FizzBuzz", "Player", "HashMapThing"};
        boolean boot = true;
        Scanner in = new Scanner(System.in);

        //bootloader
        System.out.println("- Type '" + cmdList[0].use + "' to view possible arguments");
        while(boot) {
            String input = in.nextLine();
            String[] sInput = input.split(" ");
            String output = "\n";
            try {
                switch(Commands.searchCommand(sInput[0])) {
                    //show help list
                    case HELP:
                        output += "- possible arguments:\n- ";
                        for(Commands cmd : cmdList) {
                            output += "\n- " + cmd.use + ":   " + cmd.description;
                        }
                        break;
                    //show program list
                    case LIST:
                        output += "- " + Arrays.toString(classList);
                        break;
                    //run specific program
                    case RUN:
                        try {
                            String execIn = sInput[1];
                            Class<?> cls = Class.forName(execIn);
                            String run = "\n- Running exercise '" + sInput[1] + "' ...";
                            System.out.println(run + "\n" + underline(run.length()));

                            Method mth = cls.getMethod("main", String[].class, Scanner.class);
                            mth.invoke(null, (Object) args, (Scanner) in);

                            output = underline(run.length());
                        } catch (ArrayIndexOutOfBoundsException ee) {
                            output += "- No exercise given";
                        } catch (ClassNotFoundException ee) {
                            output += "- '" + input + "' is not a valid argument";
                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException ee) {
                            ee.printStackTrace();
                        }
                        break;
                    //clear all text
                    case CLEAR:
                        output = "\033[H\033[2J";
                        System.out.flush();
                        break;
                    //quit program
                    case EXIT:
                        boot = false;
                        break;
                    }
            } catch (NullPointerException e) {
                output += "- '" + input + "' is not a valid argument";
            }
            System.out.println(output);
        }
        in.close();
    }

    //divider
    public static String underline(int input) {
        String output = "";
        for(int i = 0; i < input; i++) {
            output += "=";
        }
        return output;
    }
}
