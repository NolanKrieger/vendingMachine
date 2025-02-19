import java.util.Scanner;

public class vending {
    public static double purchase(double machineNum, double price, double balance) {
        Scanner scan = new Scanner(System.in);

        double change = 0;

        // Added for better immersion, will take method inputs and provide a corresponding message so the user feels serviced.
        if (machineNum == 1 && balance >= 2.49) {
            System.out.println("That will be $" + price);
        } else if (machineNum == 2 && balance >= 2.49) {
            System.out.println("That will be $" + price);
        } else if (machineNum == 3 && balance >= 1.49) {
            System.out.println("That will be $" + price);
        } else if (machineNum == 4 && balance >= 1.99) {
            System.out.println("That will be $" + price);
        } else if (machineNum == 5 && balance >= 2.49) {
            System.out.println("That will be $" + price);
        } else if (machineNum == 6 && balance >= 2.99) {
            System.out.println("That will be $" + price);
        } else if (machineNum == 7 && balance >= 2.99) {
            System.out.println("That will be $" + price);
        } else if (machineNum == 8 && balance >= 2.99) {
            System.out.println("That will be $" + price);
        } else if (machineNum == 9 && balance >= 2.99) {
            System.out.println("That will be $" + price);
        }

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

        // If user inputs "Y", then purchase details are listed. If not, then nothing is listed
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
        Scanner venScan = new Scanner(System.in);
        int balance = 0;
        boolean hasMoney = true;
        boolean firstRun = true;
        System.out.println("Welcome to the vending machine. Please enter money into the machine. Only $1 bills are allowed.\n\nHow many would you like to enter?");

        System.out.println("1: Snickers: $2.49");
        System.out.println("2: Milkyway: $2.49");
        System.out.println("3: Starburst: $1.49");
        System.out.println("4: Water: $1.99");
        System.out.println("5: Gatorade: $2.49");
        System.out.println("6: Lemonade: $2.99");
        System.out.println("7: Coke: $2.99");
        System.out.println("8: Pepsi: $2.99");
        System.out.println("9: Dr Pepper: $2.99");
        System.out.println("To exit, enter -1.");

        while (hasMoney) {
            if (venScan.hasNextInt()) { // Check if the next input is a valid integer
                balance = venScan.nextInt();
                venScan.nextLine();
                
                System.out.println(balance + " dollar bills have been added to the vending machine.");

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

            int snickers = 1;
            int milkyway = 2;
            int starburst = 3;
            int water = 4;
            int gatorade = 5;
            int lemonade = 6;
            int coke = 7;
            int pepsi = 8;
            int drPepper = 9;

            double price1 = 2.49;
            double price2 = 2.49;
            double price3 = 1.49;
            double price4 = 1.99;
            double price5 = 2.49;
            double price6 = 2.99;
            double price7 = 2.99;
            double price8 = 2.99;
            double price9 = 2.99;

            System.out.println("Please enter a number into the machine.");
            int machineNumber = venScan.nextInt();
            venScan.nextLine();

            switch (machineNumber) {
                case 1:
                    System.out.println("Snickers selected.");
                    price = price1;
                    break;
                case 2:
                    System.out.println("Milky Way selected.");
                    price = price2;
                    break;
                case 3:
                    System.out.println("Starburst selected.");
                    price = price3;
                    break;
                case 4:
                    System.out.println("Water selected.");
                    price = price4;
                    break;
                case 5:
                    System.out.println("Gatorade selected.");
                    price = price5;
                    break;
                case 6:
                    System.out.println("Lemonade selected.");
                    price = price6;
                    break;
                case 7:
                    System.out.println("Coke selected.");
                    price = price7;
                    break;
                case 8:
                    System.out.println("Pepsi selected.");
                    price = price8;
                    break;
                case 9:
                    System.out.println("Dr Pepper selected.");
                    price = price9;
                    break;
                default:
                    break;
            }
            purchase(machineNumber, price, balance);
        }
        venScan.close(); // Close scanner at the end
    }
}
