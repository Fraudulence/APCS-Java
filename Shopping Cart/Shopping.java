import java.util.Scanner;
public class Shopping
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        String start = "Yes";
        String stop = "No";
        double price = 0.0;
        int quantity = 0;
        double totalPrice = 0.0;
        String items = ""; //Contains names of items
        String itemName = "Takes the name of an item";
        String shopping = "Asks if you want to continue shopping or not";
        String stopShopping = "No";
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Would you like to start shopping?");
        shopping = scan.nextLine();
        while (! shopping.equals(stop) && shopping.equals(start))
        {
            System.out.println("What would you like to buy?");
            itemName = scan.next();
            System.out.println("What is the price of the item?");
            price = scan.nextDouble();
            System.out.println("How many are you buying?");
            quantity = scan.nextInt();
            totalPrice = price*quantity;
            items += itemName;
            System.out.println("Would you like to continue shopping?");
            shopping = scan.next();
            if (shopping.equals(start))
            {
                items += ", ";
            }
        }
        System.out.println("Items in cart: " + items);
        System.out.println("Please pay $" + totalPrice);
        }
    }
