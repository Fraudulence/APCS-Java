
/**
 * Write a description of class Commission here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Commission extends Hourly
{
    // instance variables - replace the example below with your own
    private int x;
    double totalSales;
    double comRate;
    /**
     * Constructor for objects of class Commission
     */
    public Commission(String eName, String eAddress, String ePhone,
    String socSecNumber, double rate, double comRate)
    {
        // initialise instance variables
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.comRate = comRate;
    }
    
    public void addSales (double totalSales)
    {
        this.totalSales = totalSales;
    }
    
    public double pay()
    {
        double payment = super.pay() + totalSales*comRate;
        totalSales = 0.0;
        //payRate * hoursWorked
        //Commission.addSales(totalSales)
        return payment;
    }
    
    public String toString()
    {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}
