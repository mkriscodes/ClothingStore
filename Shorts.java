import java.util.Scanner;
import java.util.ArrayList;
public class Shorts extends Clothes {
    public static String size;
    int quantity;
    int total;
    double discount;


    public void chooseSize (ArrayList <String> chosenItems) {
    System.out.println("Select a size: ");
    System.out.println("Small");
    System.out.println("Medium");
    System.out.println("Large");
    Scanner userSize = new Scanner(System.in);
    size = userSize.nextLine();
    chosenItems.add(size);

    System.out.println("How many would you like? ");
    Scanner userQuantity = new Scanner(System.in);
    quantity = userQuantity.nextInt();
    chosenItems.add(String.valueOf(quantity));
    }

    //displays users total
    @Override
    public void displayCart (ArrayList <String> chosenItems) {
        super.price = 30;
        System.out.println(quantity + " " + chosenItems.get(1) + " " + chosenItems.get(0) +": $"+  quantity * price);
    }

    //if user purchases 2 or more shorts method take off 15%
   @Override
    public void displayTotal (ArrayList <String> chosenItems) {
        super.price = 30;
        if (quantity >= 2) {
            total = (quantity * price);
            discount = total - (total * 0.15);
            System.out.println("Total with 15% Discount: " + "$" + discount);
        }
        else {
            System.out.println("Sorry, you didn't qualify for any discounts.");
            System.out.println(quantity + " " + chosenItems.get(1) + " " + chosenItems.get(0) +": $"+  quantity * price);
        }
    }
}
