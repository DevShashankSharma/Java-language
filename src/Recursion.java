public class Recursion {
    static int factorial(int n){
        if (n == 1 || n==0 ){
            return 1;
        }else{
            return n*factorial(n-1);
        }
        
    }

    static int fibbnaci(int n){
        if(n==1 || n==2){
            return n-1;
        } else{
        return fibbnaci(n-1)+fibbnaci(n-2);
        }
    }
    public static void main(String[] args) {
        // System.out.println(factorial(5));

        System.out.println(fibbnaci(6));
    }
}
