import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter marks in math : ");
        float math = scan.nextFloat();

        System.out.print("Enter marks in physics : ");
        float physics = scan.nextFloat();

        System.out.print("Enter marks in chemistry : ");
        float chemistry = scan.nextFloat();

        System.out.print("Enter marks in hindi : ");
        float hindi = scan.nextFloat();

        System.out.print("Enter marks in english : ");
        float english = scan.nextFloat();

        float percentage = (math + physics + chemistry + hindi + english)/5;

        System.out.println("Your Percentage is :"+percentage+"%");

        scan.close();
    }
}
