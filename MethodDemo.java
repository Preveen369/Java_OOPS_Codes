
import java.util.Scanner;

class GroceryShop {
    public void listOfItems() {
        System.out.println("1. Sunflower Oil");
        System.out.println("2. Bathing Soap");
        System.out.println("3. 2-Minutes Noodles");
        System.out.println("4. Shaving Cream");
        System.out.println("5. Chilli Powder");
    }

    //System.out.println("Bought: Sunflower Oil");
    //System.out.println("Price of item: " + amount);
    
    public String getAnItem(int choice, int amount) {
        switch (choice) {
            // NOTE -> Switch_new (approach-5) {block used}
            case 1 -> { if (amount >= 115) 
            return "Bought sunflower oil\nPrice of item: " + amount;}

            case 2 -> { if (amount >= 10)
            return "Bought bathing soap\nPrice of item: " + amount;}

            case 3 -> { if (amount >= 14)
            return "Bought 2-Minutes Noodles\nPrice of item: " + amount;}

            case 4 -> { if (amount >= 25)
            return "Bought shaving cream\nPrice of item: " + amount;}

            case 5 -> { if (amount >= 15)
            return "Bought chilli powder\nPrice of item: " + amount;}
        }
        return "bought nothing";
    }
}

public class MethodDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Grocery Shop----");

        GroceryShop shop = new GroceryShop();
        shop.listOfItems();   // access method with no values passed

        System.out.println("\nEnter your choice and amount to buy?");
        int option = sc.nextInt();
        int rate = sc.nextInt();

        // access method with parameter values passed
        String itemBought = shop.getAnItem(option, rate);
        System.out.println("\n" + itemBought);
        sc.close();
    }
}
