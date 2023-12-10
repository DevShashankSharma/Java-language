import java.util.Scanner;

public class MethodPractise {
    static void table(int x){
        for(int i=1;i<=10;i++){
            System.out.println(x + " * " + i + "  =  " + (x*i));
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a Number");
        n = cin.nextInt();
        cin.close();
        table(n);
        
    }
}
