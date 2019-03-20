import java.util.Scanner;
/**
 * Write a description of class Average here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Average
{
    public static void main (String[] args)
    {
        //Determines the average of 3 numbers
        double a, b, c;
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Enter the first number: ");
        a = scan.nextDouble();
        
        System.out.print ("Enter the second number: ");
        b = scan.nextDouble();
        
        System.out.print ("Enter the third number: ");
        c = scan.nextDouble();
        
        //Add the three numbers together and then divide them all by 3
        
        double average = (a + b + c) / 3;
        System.out.println ("The average of the three numbers is: " + average);
    }
}
