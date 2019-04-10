// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//
// ****************************************************************
import java.util.Scanner;
import java.util.ArrayList;
public class Square
{
    int[][] square;
    int sumNumbers = 0;
    int numNumbers = 0;
    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square(int size)
    {
        square = new int[size][size];
    }
    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
        for (int i = 0; i < square.length; i++)
        {
            numNumbers = square.length;
            sumNumbers += numNumbers;
            row++;
            System.out.println("Sum of row " + row + ": " + sumNumbers);
            return sumNumbers;
        }
        return sumNumbers;
    }
    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
        for (int i = 0; i < square.length; i++)
        {
            numNumbers = square.length;
            sumNumbers += numNumbers;
            col++;
            System.out.println("Sum of column " + col + ": " + sumNumbers);
            return sumNumbers;
        }
        return sumNumbers;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
        
    }
    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {

    }
    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {
        //if()
        {

        }
        return true;
    }
    //--------------------------------------
    //read info into the square from the input stream associated with the
    //Scanner parameter
    //--------------------------------------
    public void readSquare(Scanner scan)
    {
        for (int row = 0; row < square.length; row++)
            for (int col = 0; col < square.length; col ++)
                square[row][col] = scan.nextInt();
    }
    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
        System.out.println(sumNumbers);
    }
}