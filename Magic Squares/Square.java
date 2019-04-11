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
    //String sumRow = new String();
    String sumColomn = new String();
    String magicSquare = new String();
    int magicNumber;
    int size;
    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square(int size)
    {
        square = new int[size][size];
        this.size = size;
    }
    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
        int sumRow = 0;
        for (int i = 0; i < square.length; i++)
        {
            sumRow += square[row][i];
            //row++;
            //sumRow += "Row " + i + ": " + sumNumbers + "\n";
            //return sumRow;
        }
        return sumRow;
    }
    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
        int sumCol = 0;
        for (int i = 0; i < square.length; i++)
        {
            //numNumbers = square.length;
            sumCol += square[col][i];
            //col++;
            //sumColomn += "Colomn " + i + ": " + sumNumbers + "\n";
            //return sumCol;
        }
        return sumCol;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
        int sumMain = 0;
        for(int i = 0; i <square.length; i++)
        {
            sumMain += square[i][i];
        }
        return sumMain;
    }
    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
        int sumOther = 0;
        for(int i = 0; i < square.length; i++)
        {
            sumOther += square[i][square.length - 1 - i];
        }
        return sumOther;
    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {
        int sum = sumMainDiag();
        if (this.sumOtherDiag() != sum)
        {
            return false;
        }
        else
        {
            for (int i = 0; i < size; i++)
            {
                if (sumRow(i) != sum || sumCol(i) != sum)
                {
                    return false;
                }
            }
            return true;
        }
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
        //System.out.println(sumRow);
        //System.out.println(sumColomn);
        for (int row = 0; row < square.length; row++)
        {
            for (int col = 0; col < square.length; col++)
            {
                System.out.print(square[row][col] + "\t");
                //numNumbers = square.length;
                //magicSquare += square[row] + "\t";
            }
            System.out.println();
        }
    }
}