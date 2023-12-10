import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        age = sc.nextInt();

        sc.close();

        // if (age>56){
        //     System.out.println("You are experienced");
        // } else if(age >46){
        //     System.out.println("You are semi-experienced");
        // } else if(age > 36){
        //     System.out.println("You are semi-semi-experienced");
        // } else {
        //     System.out.println("You are not experienced");
        // }

        // if (age > 2){
        //     System.out.println("You are not a baby");
        // }

        //Switch case

            switch (age) {
                case 18:
                    System.out.println("You are going to become an adult");
                    break;
                case 23:
                    System.out.println("You are going to join a job");
                    break;
                case 60:
                    System.out.println("You are going to retired");
                    break;
                default:
                    System.out.println("Enjoy your life");
                    break;
            }
            
            //Enhanced switch case
            
            // switch (age) {
            //     case 18 ->{
            //         System.out.println("You are going to become an adult");
            //     }
            //     case 23 -> {
            //         System.out.println("You are going to join a job");
            //     }
            //     case 60 ->{
            //         System.out.println("You are going to retired");
            //     }
            //     default ->{
            //         System.out.println("Enjoy your life");
            //     }
            // }
            System.out.println("Thanks for using my java code"); 
        }
}