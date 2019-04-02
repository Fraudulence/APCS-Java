import java.util.Scanner;
public class Array2
{
    final static int range = 51;
    public Array2()
    {
        /* Design and implement an application that reads a number 
         * of integers that are in the range 0 to 50 inclusive and counts
         * how many times each one is entered. After all input has been 
         * processed, print all of the values, with the number of times each 
         * one was entered.
         */
        Scanner scan = new Scanner(System.in);
        int[] number = new int[range];
        System.out.println("Enter a value between -25 and 25. Type -40 to stop.");
        int current = scan.nextInt();
        //while (current != s)
        //{
        while (current != -40 && current >= -25 && current <= 25)
        {
            //Initializes array values
            //Counts the number of times x was inputted
            number[current+25]++;
            System.out.println("Enter a value.");
            current = scan.nextInt();
        }

        //}
        for (int index = 0; index < range; index++)
        {
            //Outputs the number of times the number was selected
            System.out.print(index - 25);
            System.out.println(": " + number[index]);
            //System.out.println(index + ": " + number[index]);
        }
    }
}
