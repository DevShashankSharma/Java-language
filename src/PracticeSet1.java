import java.util.Scanner;

public class PracticeSet1 {
    public static void main(String[] args) {
        int a = 23, b = 45, c = 34;
        System.out.println((a+b+c));

        int math = 56;
        int physics = 89;
        int chemistry = 90;
        float cgpa = (math+physics+chemistry)/30f;
        System.out.println(cgpa);

        String str;
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        
        System.out.println("Hello "+str+" have a good day");
        
        System.out.println("Enter your number");
        System.out.println(sc.hasNextInt());
        sc.close();
    }
}
