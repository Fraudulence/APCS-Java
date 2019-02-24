import java.lang.Math;
import java.util.Scanner;
/**
 * Demonstrates a calculation based on user input.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quadratic
{
    public static void main (String[] args)
    {
        //Determines the roots of a quadratic equation
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("Enter the coefficient of x squared: ");
        a = scan.nextInt();
        
        System.out.print ("Enter the coefficient of x: ");
        b = scan.nextInt();
        
        System.out.print ("Enter the constant: ");
        c = scan.nextInt();
        
        /*Use the quadratic formula to compute the roots
          Assumes a positive discriminant*/
          
        double discriminant = Math.pow(b,2) - (4*a*c);
        double root1 = ((-1*b) + Math.sqrt(discriminant)) / (2*a);
        double root2 = ((-1*b) + Math.sqrt(discriminant)) / (2*a);
        
        System.out.print("Root #1: " + root1);
        System.out.print("Root #2: " + root2);
    }
}
