/*
 * Program that prompts user for two intagers and an opperation. Program then returns
 * the solution to the opperation.
 *
 * @author Stewart
 * @version JAVA 8, 7/10/2019
 */

import java.util.Scanner;

public class ComputerMathTest{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int val1 = 0;
        int val2 = 0;
        String opp = "";

        /* while loop to ensure the proper value is given by user */
        Boolean flag = true;
        while(flag){
            try {
                /* prompts user for the first value */
                System.out.println("Enter the first intager: ");
                /* 
                 * saves entry as a string to prevent an infinate loop should
                 * the catch get triggered with the .nextInt() opperator 
                 */
                String inVal1 = scan.next();
                /* takes string and converts it into an intager and saves it to 'val1' */
                val1 = Integer.parseInt(inVal1);
                /* if no errors are triggered, the 'flag' will get set to false */
                /* to exit while loop */
                flag = false;
                /* if there is an error, informs user of error and reprompts user for value again */
            } catch(Exception e){
                System.out.println("\n# -==-==- # -==-==- # -==-==- # -==-==- # -==-==- #");
                System.out.println("ERROR: Invalid Entry.");
                System.out.println("# -==-==- # -==-==- # -==-==- # -==-==- # -==-==- #\n");
            }
        }
        flag = true;
        while(flag){
            try {
                System.out.println("Enter the second intager: ");
                String inVal2 = scan.next();
                val2 = Integer.parseInt(inVal2);
                flag = false;
            } catch(Exception e){
                System.out.println("\n# -==-==- # -==-==- # -==-==- # -==-==- # -==-==- #");
                System.out.println("ERROR: Invalid Entry.");
                System.out.println("# -==-==- # -==-==- # -==-==- # -==-==- # -==-==- #\n");
            }
        }
        flag = true;
        while(flag){
            try {
                /*
                 * prompts user for an opperator, this will be used to tell program
                 * which opporation to exicute and sets the entered value to 'opp' 
                 */
                System.out.println("Enter The Opperation (+,-,*,/,%): ");
                opp = scan.next();
                flag = false;
            } catch(Exception e){
                System.out.println("\n# -==-==- # -==-==- # -==-==- # -==-==- # -==-==- #");
                System.out.println("ERROR: Invalid Entry.");
                System.out.println("# -==-==- # -==-==- # -==-==- # -==-==- # -==-==- #\n");
            }
        }

        ComputerMath math = new ComputerMath();
        math.calculate(val1, val2, opp);

    /* closes scanner */
    scan.close();
    }
}
