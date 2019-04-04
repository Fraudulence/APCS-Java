//********************************************************************
//  ReverseOrder.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates array index processing.
//********************************************************************

import java.util.Scanner;

public class ReverseOrder
{
   //-----------------------------------------------------------------
   //  Reads a list of numbers from the user, storing them in an
   //  array, then prints them in the opposite order.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      System.out.println("How many values are gonna be typed in?");
      Scanner scan = new Scanner (System.in);
      int max = scan.nextInt();
      int[] numbers = new int[max];
      System.out.println ("The size of the array: " + numbers.length);
      

      //int b = numbers.length -1;
      for (int index = 0; index < numbers.length; index++)
      {
         System.out.print ("Enter number " + (index+1) + ": ");
         numbers[index] = scan.nextInt();
      }
      
      System.out.println ("The numbers in reverse order:");
      int temp;
      int b = numbers.length - 1;
      for (int index = 0; index < numbers.length/2; index++)
      {   
          temp = numbers[index];
          numbers[index] = numbers[b];
          numbers[b] = temp;
          System.out.println("Numbers" + index + "and" + b + "have been swapped");
          //index++;
          b--;
      }
      
      for (int index = 0; index < numbers.length; index++)
      {
          System.out.print (numbers[index] + " ");
          System.out.println ();
      }
   }
}
