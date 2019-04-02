import java.util.Scanner;
public class Array
{
    final static int range = 11;
    public Array()
    {
        /* Design and implement an application that reads a number 
         * of integers that are in the range 0 to 50 inclusive and counts
         * how many times each one is entered. After all input has been 
         * processed, print all of the values, with the number of times each 
         * one was entered.
         */
        Scanner scan = new Scanner(System.in);
        int[] number = new int[range];
        System.out.println("Enter a value between 0 and 50. Type -1 to stop.");
        int current = scan.nextInt();
        //while (current != s)
        //{
        while (current != -1 && current >= 0 && current <=50)
        {
            
                //Initializes array values
                //Counts the number of times x was inputted
                number[current]++;
            
            System.out.println("Enter a value.");
            current = scan.nextInt();
        }

        //}
        for (int index = 0; index < range; index++)
        {
            //Outputs the number of times the number was selected
            System.out.println(index + ": " + number[index]);

        }
    }
}
