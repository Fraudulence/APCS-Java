import java.util.Scanner;
public class Shopping
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        String start = "Yes";
        double price;
        int quantity;
        double totalPrice = 0.0;
        Item item; //Contains names of items
        String itemName; //Contains one item name at one time
        String shopping; //User decides if they keep shopping or not
        ShoppingCart cart = new ShoppingCart();
        shopping = start;
        while (shopping.equals(start))
        {
            System.out.println("What would you like to buy?");
            itemName = scan.nextLine();
            System.out.println("What is the price of the item?");
            price = scan.nextDouble();
            System.out.println("How many are you buying?");
            quantity = scan.nextInt();
            
            scan.nextLine();
            
            
            cart.addToCart(itemName, price, quantity);
            System.out.println(cart.toString());
            System.out.println("Would you like to continue shopping?");
            shopping = scan.nextLine();
            //if (shopping.equals(start))
            {
            //    items += ", ";
            }
        }
        System.out.println("Please pay $" + cart.getTotalPrice());
    }
}
