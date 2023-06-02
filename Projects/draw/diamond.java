package draw;

//import java.io.*;

public class diamond {
    
    public static void main(String[] args){

        // this number determines the number of rows the shape will have before it repeats itself
        int number = 7;

        //starting number of symbols in first row
        int m = 1;

        //column printing
        int n;

        //outer loop 1
        // prints first half of diamond
        do{
            n = 1;

            //Inner loop one 
            // prints spaces until  ++n <= number  - m + 1 is
            // false
            do{
                //print whitespace between
                System.out.print(" ");

            }
            while(++n <= number - m + 1);
            
            // Now
            n = 1;
 
            // Inner loop 2
            // Prints star until ++n <= m * 2 - 1 is false
 
            do {
 
                // Print star
                System.out.print("*");
            }
            
            // Condition for inner do-while loop 2
            while (++n <= m * 2 - 1);
 
            // A new row requires a new line
            System.out.println();
        }
        
        // Condition for outer do-while loop 1
        while (++m <= number);
 
        // Now we are done with printing the upper half
        // diamond.
 
        // Note: Not to print the bottom row again in lower
        // half diamond printing Hence variable to be
        // initialized should one lesser than number
        m = number - 1;

        
        // Outer loop 2
        // Prints the second half diamond
        do {
            n = 1;
 
            // Inner loop 1
            // Prints space until ++n <= number - m + 1 is
            // false
            do {
                // Print whitespace between
                System.out.print(" ");
 
            } while (++n <= number - m + 1);
 
            n = 1;
 
            // Inner loop 2
            // Prints star until ++n <= m * 2 - 1 is false
            do {
                // Prints star
                System.out.print("*");
 
            } while (++n <= m * 2 - 1);
 
            // By now done with one row of lower diamond
            // printing so a new line is required
            System.out.println();
 
        }
        // Condition for outer do-while loop 2
        while (--m > 0);
    }
}
