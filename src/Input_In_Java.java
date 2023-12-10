import java.util.Scanner;

public class Input_In_Java {
    public static void main(String[] args) {
        System.out.println("Taking input from the user"); // Use sortcut 'sort' 

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter no.1 : ");
        // // int a = sc.nextInt();
        // float a = sc.nextFloat();

        // System.out.print("Enter no.2 is : ");
        // // int b = sc.nextInt();
        // float b = sc.nextFloat();
        
         
        // System.out.println("Sum of no1 and no2 is : "+ (a+b));

        // String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);

        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);
        
        sc.close();
    }
}
