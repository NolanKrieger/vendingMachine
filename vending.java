import java.util.Scanner;

public class vending {
    public static double purchase(String machineNum, double price, double balance) {
        Scanner scan = new Scanner(System.in); // Opens scanner

        double change = 0; // Creates change variable

        // Added for better immersion, will take method inputs and provide a corresponding message so the user feels serviced.
        if (machineNum.equals("1a")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("2a")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("3a")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("4a")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("5a")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("6a")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("7a")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("8a")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("9a")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("1b")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("2b")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("3b")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("4b")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("5b")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("6b")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("7b")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("8b")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("9b")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("1c")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("2c")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("3c")) {
            System.out.println("That will be $" + price);
        } else if (machineNum.equals("4c")) {
            System.out.println("That will be $" + price);
        }

        // Prompts user to confirm or cancel order, reads in line and gives a response
        System.out.println("Are you sure you would like to purchase item " + machineNum + " for $" + price + "?");
        System.out.println("Enter 'confirm' to continue, or 'cancel' to exit the transaction.");
        String confirm = scan.nextLine();

        if (confirm.equals("confirm")) {
            change = balance - price;
            System.out.println("Thank you for your purchase. Your change is $" + change + " Would you like your receipt? Enter Y or N.");
        } else if (confirm.equals("cancel")) {
            System.out.println("Purchase canceled. A full refund has been issued.");
            System.out.println("Have a great day!\nIf you would like to purchase another item, please enter sufficient funds.");
            System.out.println("If you would like to exit instead, enter -1.");
            return balance;
        } else {
            System.out.println("Error: invalid input provided, canceling transaction. A full refund has been issued.\nIf you would like to purchase another item, please enter sufficient funds.");
            System.out.println("If you would like to exit instead, enter -1.");
            return balance;
        }

        String choice = scan.nextLine();

        // Asks user about receipt. Y/y means yes, N/n means no, any other input defaults to yes
        if (choice.equals("Y") || choice.equals("y")) {
            System.out.println("Item cost: " + price);
            System.out.println("Your change is: " + change);
            System.out.println("Have a wonderful day!\nIf you would like to purchase another item, please enter sufficient funds.");
            System.out.println("If you would like to exit instead, enter -1.");
            return balance;
        } else if (choice.equals("N") || choice.equals("n")) {
            System.out.println("Have a wonderful day!\nIf you would like to purchase another item, please enter sufficient funds.");
            System.out.println("If you would like to exit instead, enter -1.");
            return balance;
        } else {
            System.out.println("Invalid option selected, defaulting to 'Y'.\n");
            System.out.println("Item cost: " + price);
            System.out.println("Your change is: " + change);
            System.out.println("Have a wonderful day!\nIf you would like to purchase another item, please enter sufficient funds.");
            System.out.println("If you would like to exit instead, enter -1.");
            return balance;
        }
    }

    public static void main(String[] args) {
        // Opens scanner, as well as some other necessary variables
        Scanner venScan = new Scanner(System.in);
        int balance = 0;
        boolean hasMoney = true;
        System.out.println("Welcome to the vending machine. Please enter money into the machine. Only $1 bills are allowed.\n\nHow many would you like to enter?");

        // Full detailed list of all available items
        System.out.println("===== REFRIDGERATED SECTION =====");
        System.out.println("|| 1a - Coke             $2.99 ||");
        System.out.println("|| 2a - Sprite           $2.99 ||");
        System.out.println("|| 3a - 7-Up             $2.99 ||");
        System.out.println("|| 4a - Pepsi            $2.99 ||");
        System.out.println("|| 5a - Dr. Pepper       $2.99 ||");
        System.out.println("|| 6a - Gatorade         $2.99 ||");
        System.out.println("|| 7a - Lemonade         $2.99 ||");
        System.out.println("|| 8a - Water            $1.99 ||");
        System.out.println("|| 9a - Mountain Dew     $2.99 ||");
        System.out.println("|| 1b - Sparkling Water  $2.99 ||");
        System.out.println("========= SNACK SECTION =========");
        System.out.println("|| 2b - Snickers         $2.49 ||");
        System.out.println("|| 3b - Milkyway         $2.49 ||");
        System.out.println("|| 4b - Starburst        $1.49 ||");
        System.out.println("|| 5b - Cookies          $2.49 ||");
        System.out.println("|| 6b - Pringles         $2.49 ||");
        System.out.println("|| 7b - Chocolate        $1.99 ||");
        System.out.println("|| 8b - Potato Chips     $1.49 ||");
        System.out.println("|| 9b - Doritos          $2.49 ||");
        System.out.println("|| 1c - Granola Bar      $2.49 ||");
        System.out.println("|| 2c - M&M's            $1.49 ||");
        System.out.println("|| 3c - Cheetos          $1.99 ||");
        System.out.println("|| 4c - Pretzels         $1.49 ||");
        System.out.println("======= To exit, enter -1 =======");

        // This while loop allows the vending machine to be operational unless forcibly closed (enter -1 into console to exit)
        while (hasMoney) { // hasMoney would be used if the money value saved every transaction, but that is not yet implemented.
            if (venScan.hasNextInt()) { // Check if the next input is a valid integer
                balance = venScan.nextInt();
                venScan.nextLine();
                
                System.out.println(balance + " dollar bills have been added to the vending machine.");

                // If user has enough money, then they may select and purchase
                if (balance > 0) {
                    System.out.println("The following items are the options in the vending machine:");
                    hasMoney = true;
                    if (balance < 1.49) {
                        System.out.println("You currently do not have sufficient funds to purchase anything.");
                        hasMoney = false;
                    }
                } else {
                    hasMoney = false;
                    System.out.println("If you want to purchase something, please enter money. The cheapest item is $1.49.");
                    break;
                }
            } else {
                // Input validation if the input is not an integer
                System.out.println("Invalid input. Please enter a valid amount in $1 bills.");
                venScan.next();
                continue;
            }

            double price = 0;

            // Sets the price for each item
            double price1 = 2.99;
            double price2 = 2.99;
            double price3 = 2.99;
            double price4 = 2.99;
            double price5 = 2.99;
            double price6 = 2.99;
            double price7 = 2.99;
            double price8 = 2.99;
            double price9 = 2.99;
            double price10 = 2.49;
            double price11 = 2.49;
            double price12 = 2.49;
            double price13 = 1.49;
            double price14 = 2.49;
            double price15 = 2.49;
            double price16 = 1.99;
            double price17 = 2.49;
            double price18 = 2.49;
            double price19 = 2.49;
            double price20 = 1.49;
            double price21 = 1.99;
            double price22 = 1.49;

            // User is prompted to enter a number into machine, their response will then be caught be switch case
            System.out.println("Please enter a number into the machine.");
            String machineNumber = venScan.nextLine();

            // Depending on user input, a case is called. When a case is called, user receives feedback of selection, and item price is set.
            switch (machineNumber) {
                case "1a":
                    System.out.println("Coke selected.");
                    price = price1;
                    break;
                case "2a":
                    System.out.println("Sprite selected.");
                    price = price2;
                    break;
                case "3a":
                    System.out.println("7-Up selected.");
                    price = price3;
                    break;
                case "4a":
                    System.out.println("Pepsi selected.");
                    price = price4;
                    break;
                case "5a":
                    System.out.println("Dr. Pepper selected.");
                    price = price5;
                    break;
                case "6a":
                    System.out.println("Gatorade selected.");
                    price = price6;
                    break;
                case "7a":
                    System.out.println("Lemonade selected.");
                    price = price7;
                    break;
                case "8a":
                    System.out.println("Water selected.");
                    price = price8;
                    break;
                case "9a":
                    System.out.println("Mountain Dew selected.");
                    price = price9;
                    break;
                case "1b":
                    System.out.println("Sparkling Water selected.");
                    price = price10;
                    break;
                case "2b":
                    System.out.println("Snickers selected.");
                    price = price11;
                    break;
                case "3b":
                    System.out.println("Milky Way selected.");
                    price = price12;
                    break;
                case "4b":
                    System.out.println("Starburst selected.");
                    price = price13;
                    break;
                case "5b":
                    System.out.println("Cookies selected.");
                    price = price14;
                    break;
                case "6b":
                    System.out.println("Pringles selected.");
                    price = price15;
                    break;
                case "7b":
                    System.out.println("Chocolate selected.");
                    price = price16;
                    break;
                case "8b":
                    System.out.println("Potato Chips selected.");
                    price = price17;
                    break;
                case "9b":
                    System.out.println("Doritos selected.");
                    price = price18;
                    break;
                case "1c":
                    System.out.println("Granola Bar selected.");
                    price = price19;
                    break;
                case "2c":
                    System.out.println("M&M's selected.");
                    price = price20;
                    break;
                case "3c":
                    System.out.println("Cheetos selected.");
                    price = price21;
                    break;
                case "4c":
                    System.out.println("Pretzels selected.");
                    price = price22;
                    break;
                default:
                    break;
            }
            purchase(machineNumber, price, balance); // Calls purchase function to begin transaction
        }
        venScan.close(); // Close scanner at the end
    }
}
