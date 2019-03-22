//********************************************************************
//  RationalNumbers.java       Author: Lewis/Loftus/Cocking
//
//  Driver to exercise the use of multiple Rational objects.
//********************************************************************
import java.util.Scanner;
public class RationalNumbers
{
    //-----------------------------------------------------------------
    //  Creates some rational number objects and performs various
    //  operations on them.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        Rational r1 = new Rational (6, 8);
        Rational r2 = new Rational (1, 3);
        Rational r3, r4, r5, r6, r7;
        int number;

        Scanner scan = new Scanner(System.in);
        System.out.println ("First rational number: " + r1);
        System.out.println ("Second rational number: " + r2);

        // if (r1.equals(r2))
        // System.out.println ("r1 and r2 are equal.");
        // else
        // System.out.println ("r1 and r2 are NOT equal.");

        // r3 = r1.reciprocal();
        // System.out.println ("The reciprocal of r1 is: " + r3);
        r4 = r1.add(r2);
        r5 = r1.subtract(r2);
        r6 = r1.multiply(r2);
        r7 = r1.divide(r2);
        
        System.out.println("To add two fractions, press 1");
        System.out.println("To subtract two fractions, press 2");
        System.out.println("To multiply two fractions, press 3");
        System.out.println("To divide two fractions, press 4");
        System.out.println("To quit the program, press 0");
        
        number = scan.nextInt();
        while (number != 0)
        {
            if (number == 1)
            {
                System.out.println("" + r4);
                number = scan.nextInt();
            }
            else
            if (number == 2)
            {
                System.out.println("" + r5);
                number = scan.nextInt();
            }
            else
            if (number == 3)
            {
                System.out.println("" + r6);
                number = scan.nextInt();
            }
            else
            if (number == 4)
            {
                System.out.println("" + r7);
                number = scan.nextInt();
            }
        }
        

        //System.out.println ("r1 + r2: " + r4);
        //System.out.println ("r1 - r2: " + r5);
        //System.out.println ("r1 * r2: " + r6);
        //System.out.println ("r1 / r2: " + r7);
    }
}
