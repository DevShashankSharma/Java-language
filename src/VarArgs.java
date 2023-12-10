public class VarArgs {
    // static int sum(int a , int b){
    //     return a+b;
    // }
    // static int sum(int a , int b , int c){
    //     return a+b+c;
    // }
    // static int sum(int a , int b , int c , int d){
    //     return a+b+c+d;
    // }

    //Using VarArgs
    // static int sum (int a , int ...arr){} // if you want to take one argument every time
    static int sum(int ...arr){
        // Available as int [] arr
        int results = 0;
        for(int a :arr){
            results += a;
        }
        return results;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to VarArgs Tutorial");
        System.out.println("The sum of 3 and 4 is : " + sum(3,4));
        System.out.println("The sum of Nothing is : " + sum());
        System.out.println("The sum of 3 , 4 and 5 is : " + sum(3,4,5));
        System.out.println("The sum of 3 , 4 , 5 and 6 is : " + sum(3,4,5,6));
    }
}
