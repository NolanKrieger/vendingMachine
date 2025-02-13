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

        System.out.println("Please enter a number into the machine.");
        int machineNumber = scan.nextInt();

        switch (machineNumber) {
            case 1:
                System.out.println("Option 1 selected.");
                break;
            case 2:
                System.out.println("Option 2 selected.");
                break;
            default:
                break;
        }
    }
}
