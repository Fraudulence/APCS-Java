//********************************************************************
//  Student.java       Author: Lewis/Loftus/Cocking
//
//  Represents a college student.
//********************************************************************

public class Student
{
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private double test, test2, test3;
    private double average;
    //private double averageScore;
    /*Overloading the student method
     * Constructors create objects
     * Methods define behavior of the objects
     * 
     * Return types like int and double are variables in methods
     * Ex public void scores (double testScore)
     * Return types that include class names are objects
     * Ex public void scores (Student testScore)
     */

    // public void scores (double testScore)
    // {
        // testScore = 0.0;
    // }
    //-----------------------------------------------------------------
    //  Sets up this Student object with the specified initial values.
    //-----------------------------------------------------------------
    public Student (String first, String last, Address home,
    Address school)
    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        test = 0;
        test2 = 0;
        test3 = 0;
    }
    /*Almost identical constructor except it has test scores to send to the
     * StudentBody driver, and prints out the scores for each student.
     * The global class variables reference the scores inputted in StudentBody
     * and gives the t1, t2, and t3 values FROM the global variables
     */
    
    public Student (String first, String last, Address home,
    Address school, double t1, double t2, double t3)
    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        test = t1;
        test2 = t2;
        test3 = t3;
    }
    //Method that receives input of test number and test score (parameters)
    public double setTestScore (int testNumber, double testScore)
    {
        /*If statements used to determine what test score is returned
         * when inputting a test number
         */
        if (testNumber == 1)
        {
            test = testScore;
            //this.scores(testScore);
            this.sum();
        }
        else if (testNumber == 2)
        {
            test2 = testScore;
            //this.scores(testScore);
            this.sum();
        }
        else if (testNumber == 3)
        {
            test3 = testScore;
            //this.scores(testScore);
            this.sum();
        }
        //test = testScore;
        //this.scores(testScore);
        //this.sum(testScore);
        //test = testScore;
        //test = testScore;
        //return testScore;
        //return setTestScore(testNumber, testScore);
        return (testScore);
    }
    //Method that retrieves the test number and test score
    public double getTestScore (int testNumber, double testScore)
    {
        //How to call the method without having to ask for a test score?
        this.setTestScore(testNumber, testScore);
        return testScore;
    }
    //Takes the sum of the three test scores inputted
    private double sum ()
    {
        // this.scores(testScore);
        return test + test2 + test3;
    }
    //Takes the average of the sum of 3 test scores called from method sum
    public double average(double testScoreSum)
    { 
        return this.sum() / 3;
    }
    //-----------------------------------------------------------------
    //  Returns this Student object as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += ("Your first test score is: " + test + "\n");
        result += ("Your second test score is: " + test2 + "\n");
        result += ("Your third test score is: " + test3 + "\n");
        result += ("Your average test score is: " + average);
        return result;
    }
}