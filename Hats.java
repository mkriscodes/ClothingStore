import java.util.Scanner;
import java.util.ArrayList;
public class Hats extends Clothes {
    public static String type;
    int quantity;
    int total;
    double discount;

    public void chooseType (ArrayList <String> chosenItems) {
        System.out.println("Select a type: ");
        System.out.println("Cap");
        System.out.println("Fedora");
        System.out.println("Beanie");
        Scanner userType = new Scanner(System.in);
        type = userType.nextLine();
        chosenItems.add(type);

        System.out.println("How many would you like? ");
        Scanner userQuantity = new Scanner(System.in);
        quantity = userQuantity.nextInt();
        chosenItems.add(String.valueOf(quantity));
    }

    //displays user total
    @Override
    public void displayCart (ArrayList <String> chosenItems) {
        super.price = 25;
        System.out.println(quantity + " " + chosenItems.get(1) + " " + chosenItems.get(0) +": $"+  quantity * price);
    }

    //displays discount
    @Override
    public void displayTotal (ArrayList <String> chosenItems) {
        super.price = 25;
        if (quantity % 2 == 0) {
            total = (quantity * price);
            discount = (total - 25);
            System.out.println("Total with $25 Discount: " + "$" + discount);
        }
        else {
            System.out.println("Sorry, you didn't qualify for any discounts.");
            System.out.println(quantity + " " + chosenItems.get(1) + " " + chosenItems.get(0) +": $"+  quantity * price);
        }
    }
}
