import java.util.ArrayList;
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        //objects
        ArrayList<String> chosenItems = new ArrayList<>();
        Shorts shortsClass = new Shorts();
        Dress dressClass = new Dress();
        Hats hatsClass = new Hats();


        Scanner userInput = new Scanner(System.in);
        //user options and choices
        System.out.println("***Lilies Clothing***");
        System.out.println("Add Items to Cart..........Press 1"); //nothing in cart, after adding show options
        System.out.println("Display Cart Items..........Press 2");
        System.out.println("Display Cart Total..........Press 3");
        System.out.println("Exit..........Press 4");

        if (userInput.nextInt() == 1)  {
            System.out.println("What would you like to buy? ");
            System.out.println("Shorts");
            System.out.println("Dress");
            System.out.println("Hats");

            Scanner userChoice = new Scanner(System.in);
            String command = userChoice.next();

            if (command.equals("shorts")) {
                chosenItems.add("shorts");
                shortsClass.chooseSize(chosenItems);
                System.out.println("Got it!");
            }
            if (command.equals("dress")) {
                chosenItems.add("dress");
                dressClass.chooseColor(chosenItems);
                System.out.println("Great choice!");
            }
            if (command.equals("hats")) {
                chosenItems.add("hat");
                hatsClass.chooseType(chosenItems);
                System.out.println("Added!");
            }

            //after user adds items, display options again for cart and total
            System.out.println("Display Cart Items..........Press 2");
            System.out.println("Display Cart Total..........Press 3");

            if (userInput.nextInt() == 2) {
                if (chosenItems.contains("shorts")) {
                    shortsClass.displayCart(chosenItems);
                }
                if (chosenItems.contains("dress")) {
                    dressClass.displayCart(chosenItems);
                }
                if (chosenItems.contains("hat")) {
                    hatsClass.displayCart(chosenItems);
                }
            }
            else {
                if (chosenItems.contains("shorts")) {
                    shortsClass.displayTotal(chosenItems);
                }
                if (chosenItems.contains("dress")) {
                    dressClass.displayTotal(chosenItems);
                }
                if (chosenItems.contains("hat")) {
                    hatsClass.displayTotal(chosenItems);
                }
            }
        }
         else {
             System.out.println("Bye. Please add an item next time");
         }

    }
}