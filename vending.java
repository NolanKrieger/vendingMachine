import java.util.Scanner;

public class vending{
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

        System.out.println("Snickers: $2.49");
        System.out.println("Milkyway: $2.49");
        System.out.println("Starburst: $1.49");
        System.out.println("Water: $1.99");
        System.out.println("Gatorade: $2.49");
        System.out.println("Lemonade: $2.99");
        System.out.println("Coke: $2.99");
        System.out.println("Pepsei: $2.99");
        System.out.println("Dr Pepper: $2.99");

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