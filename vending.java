import java.util.Scanner;

public class vending{
    public static double purchase(double machineNum, double price, double balance) {

        Scanner scan = new Scanner(System.in);

        System.out.println("That will be $" + price);
        double change = balance - price;

        
        System.out.println("Your change is $" + change);
        System.out.println("Thank you for your purchase. Your change is $" + change + " Would you like your receipt? Enter Y or N.");

        String choice = scan.nextLine();
        scan.close();
        
        if(choice.equals("Y")){
            System.out.println("Item cost: " + price);
            System.out.println("Have a wonderful day!");
            return change;
        } else {
            System.out.println("Have a wonderful day!");
            return balance;
        }

        
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the vending machine. Please enter money into the machine. Only $1 bills are allowed.\n\nHow much would you like to enter?");
        int balance = scan.nextInt();

        System.out.println("The following items are the options in the vending machine:");
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


        System.out.println("1: Snickers: $2.49");
        System.out.println("2: Milkyway: $2.49");
        System.out.println("3: Starburst: $1.49");
        System.out.println("4: Water: $1.99");
        System.out.println("5: Gatorade: $2.49");
        System.out.println("6: Lemonade: $2.99");
        System.out.println("7: Coke: $2.99");
        System.out.println("8: Pepsi: $2.99");
        System.out.println("9: Dr Pepper: $2.99");

        System.out.println("Please enter a number into the machine.");
        int machineNumber = scan.nextInt();

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

        scan.close();;
    }
}