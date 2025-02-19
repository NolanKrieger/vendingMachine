import java.util.Scanner;

public class vending{
    public static double purchase(double price){

        Scanner venScan = new Scanner(System.in);

        System.out.println("That will be $" + price);
        System.out.println("Please enter how much you are going to put in the machine.");
        int amount = venScan.nextInt();
        venScan.nextLine();
        double change = amount - price;

        System.out.println("Your change is $" + change);

        


        System.out.println("type continue to confirm purchase or type stop to cancel");
        String choice = venScan.nextLine();
        venScan.close();
        
        if(choice.equals("continue")){
            return change;
        }else{
            return amount;
        }

        
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int snickers = 1;
        int milkyway = 2;
        int starburst = 3;
        int water = 4;
        int gatorade = 5;
        int lemonade = 6;
        int coke = 7;
        int pepsi = 8;
        int drPepper = 9;

        System.out.println("1: Snickers: $2.49");
        System.out.println("2: Milkyway: $2.49");
        System.out.println("3: Starburst: $1.49");
        System.out.println("4: Water: $1.99");
        System.out.println("5: Gatorade: $2.49");
        System.out.println("6: Lemonade: $2.99");
        System.out.println("7: Coke: $2.99");
        System.out.println("8: Pepsei: $2.99");
        System.out.println("9: Dr Pepper: $2.99");

        System.out.println("Please enter a number into the machine.");
        int machineNumber = scan.nextInt();

        switch (machineNumber) {
            case 1:
                System.out.println("Snickers selected.");
                
                
                break;
            case 2:
                System.out.println("Milky Way selected.");
                break;
            case 3:
                System.out.println("Starburst selected.");
                break;
            case 4:
                System.out.println("Water selected.");
                break;
            case 5:
                System.out.println("Gatorade selected.");
                break;
            case 6:
                System.out.println("Lemonade selected.");
                break;
            case 7:
                System.out.println("Coke selected.");
                break;
            case 8:
                System.out.println("Pepsi selected.");
                break;
            case 9:
                System.out.println("Dr Pepper selected.");
                break;
            default:
                break;
        }
    }
}