import java.util.Scanner;
import java.lang.Math;


public class App {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        for (String s : args) {
            try {
                num = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.err.println("Arguments must be integers");
                System.exit(1);
            }
            sum += num;
        }

        // String commandLineArgs = String,join(" ", args);

        System.out.println("The sum of " + args + " is " + sum);

        

    }
}
