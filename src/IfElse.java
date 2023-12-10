public class IfElse {
    public static void main(String[] args) {
        int age = 60;
        // if (age>18){
        //     System.out.println("Yes boy you can drive");
        // } else {
        //     System.out.println("No boy you cann't drive");
        // }

        //Another method 
        Boolean cond = (age > 18);
        if (cond){
            System.out.println("Yes boy you can drive");
        } else {
            System.out.println("No boy you cann't drive");
        }
    }
}
