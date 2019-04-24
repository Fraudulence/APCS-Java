// ***************************************************************
// Shop.java
//
// Uses the Item class to create items and add them to a shopping
// cart stored in an ArrayList.
// ***************************************************************
import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        ArrayList <Item> cart = new <Item> ArrayList();
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            // *** create a new item and add it to the cart
            scan.nextLine();
            item = new Item(itemName, itemPrice, quantity);
            cart.add(item);
            // *** print the contents of the cart object using println
            for (int i = 0; i < cart.size(); i++)
            {
                Item temp = cart.get(i);
                double totalPrice = 0.0;
                totalPrice += itemPrice;
                System.out.println(temp);
            }
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
            System.out.println(cart);
        }
        while (keepShopping.equals("y"));
    }
}