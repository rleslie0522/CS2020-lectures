/*public class Practical2 {
    public static void main(String[] args) {
        System.out.println("I can now use \"escape sequence\" and can print even reserved characters like \\");

        int number1 = 5;
        int number2 = 5;
        int sum = number1 + number2;

        System.out.println("5 + 5 = " + sum);
    }
}*/

import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total miles driven: ");
        int miles = input.nextInt();

        System.out.print("Enter cost per gallon: ");
        double costPer = input.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        int milesPer = input.nextInt();

        System.out.print("Enter total parking fees: ");
        int parking = input.nextInt();

        System.out.print("Enter total tolls: ");
        int tolls = input.nextInt();

        double dailyCost = (miles / milesPer) * costPer + parking + tolls;

        System.out.printf("Daily driving cost: £%.2f%n", dailyCost);
    }
}