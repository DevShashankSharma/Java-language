import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static int convert(String choice1){
        if(choice1 == "paper"){
            return 0;
        }
        else if (choice1 == "scissor"){
            return 1;
        }
        else {
            return 2;
        }
    }
    public static String check(String choice1 , int choice2){ 
        int choice = convert(choice1);

        if(choice == choice2){
            return "Match Draw";
        }
        else if((choice == 1 && choice2 == 0) || (choice == 2 && choice2 == 1) || (choice == 0 && choice2 == 2)){
            return "You Win";
        }
        else{
            return "You Lose";
        }
    }
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        String str = "stone";
    
        /*
         * 0 = paper
         * 1 = scissor
         * 2 = stone
         */
        while (!str.equals("exit")) {
            System.out.println("Enter stone , paper and scissor  AND exit to exit game");
            str = scan.next();
        
            if(!str.equals("exit")){
                int c = random.nextInt(3);

                System.out.println(str + " : " + c + "\n" +check(str, c)); 
            }
        }

        scan.close();
    }
}
