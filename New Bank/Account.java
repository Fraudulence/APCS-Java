//********************************************************************
//  Account.java       Author: Lewis/Loftus/Cocking
//
//  Represents a bank account with basic services such as deposit
//  and withdraw.
//********************************************************************

import java.text.NumberFormat;

public class Account
{
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();

    private final double RATE = 0.035;  // interest rate of 3.5%

    private int acctNumber;
    private double balance;
    private String name;

    //-----------------------------------------------------------------
    //  Sets up the account by defining its owner, account number,
    //  and initial balance.
    //-----------------------------------------------------------------
    public Account (String owner, int account, double initial)
    {
        name = owner;
        acctNumber = account;
        balance = initial;
    }

    //-----------------------------------------------------------------
    //  Validates the transaction, then deposits the specified amount
    //  into the account. Returns the new balance.
    //-----------------------------------------------------------------
    public double deposit (double amount)
    {
        if (amount < 0)  // deposit value is negative
        {
            System.out.println ();
            System.out.println ("Error: Deposit amount is invalid.");
            System.out.println (acctNumber + "  " + fmt.format(amount));
        }
        else
            balance = balance + amount;
        return balance;
    }

    //-----------------------------------------------------------------
    //  Validates the transaction, then withdraws the specified amount
    //  from the account. Returns the new balance.
    //-----------------------------------------------------------------
    public double withdraw (double amount, double fee)
    {
        amount += fee;

        if (amount < 0)  // withdraw value is negative
        {
            System.out.println ();
            System.out.println ("Error: Withdraw amount is invalid.");
            System.out.println ("Account: " + acctNumber);
            System.out.println ("Requested: " + fmt.format(amount));
        }
        else
        if (amount > balance)  // withdraw value exceeds balance
        {
            System.out.println ();
            System.out.println ("Error: Insufficient funds.");
            System.out.println ("Account: " + acctNumber);
            System.out.println ("Requested: " + fmt.format(amount));
            System.out.println ("Available: " + fmt.format(balance));
        }
        else
            balance = balance - amount;

        return balance;
    }

    //-----------------------------------------------------------------
    //  Adds interest to the account and returns the new balance.
    //-----------------------------------------------------------------
    public double addInterest ()
    {
        balance += (balance * RATE);
        return balance;
    }

    //-----------------------------------------------------------------
    //  Returns the current balance of the account.
    //-----------------------------------------------------------------
    public double getBalance ()
    {
        return balance;
    }

    //-----------------------------------------------------------------
    //  Returns the account number.
    //-----------------------------------------------------------------
    public int getAccountNumber ()
    {
        return acctNumber;
    }

    //Transfers whatever money is withdrawn to another bank account
    public double transfer(double amount, Account recipient)
    {
        /*"this" = the object being used to call this method
        It's vital that when calling upon a method, one must
        input all parameters that are required in paranthesis,
        as shown in the method withdraw, which has
        (double amount, double fee). Withdraw calls the amount
        and the fee from the original method, and then the parameter
        declared calls amount again and returns the value of what is
        to be withdrawn from the sender and transferred to the recipient.
        */
        this.withdraw(amount, 0);
        recipient.deposit(amount);
        return amount;
    }

    //-----------------------------------------------------------------
    //  Returns a one-line description of the account as a string.
    //-----------------------------------------------------------------
    public String toString ()
    {
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
    }
}
