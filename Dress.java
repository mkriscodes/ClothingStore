import java.util.Scanner;
import java.util.ArrayList;
public class Dress extends Clothes {
    public static String color;
    int quantity;
    int total;
    double discount;


    public void chooseColor (ArrayList <String> chosenItems) {
        System.out.println("Select a color: ");
        System.out.println("Blue");
        System.out.println("Green");
        System.out.println("Red");
        Scanner userColor = new Scanner(System.in);
        color = userColor.nextLine();
        chosenItems.add(color);

        System.out.println("How many would you like? ");
        Scanner userQuantity = new Scanner(System.in);
        quantity = userQuantity.nextInt();
        chosenItems.add(String.valueOf(quantity));
    }

    //displays user total
    @Override
    public void displayCart (ArrayList <String> chosenItems) {
        super.price = 70;
        System.out.println(quantity + " " + chosenItems.get(1) + " " + chosenItems.get(0) +": $"+  quantity * price);
    }

    //if user purchases 2 or more dresses method takes off 25%
    @Override
    public void displayTotal (ArrayList <String> chosenItems) {
        super.price = 70;
        if (quantity >= 2) {
            total = (quantity * price);
            discount = total - (total * 0.25);
            System.out.println("Total with 25% Discount: " + "$" + discount);
        }
        else {
            System.out.println("Sorry, you didn't qualify for discounts.");
            System.out.println(quantity + " " + chosenItems.get(1) + " " + chosenItems.get(0) +": $"+  quantity * price);
        }
    }
}
