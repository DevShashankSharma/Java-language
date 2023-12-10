public class Conditional {
    public static void main(String[] args) {
        Boolean a = true;
        Boolean b = false;

        if (a && b){
            System.out.println("Y");
        } else {
            System.out.println("N");
        }


        if (a || b){
            System.out.println("Y");
        } else {
            System.out.println("N");
        }


        if (a != b){
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
        System.out.println(!a);

        System.out.println(!b);
    }
}
