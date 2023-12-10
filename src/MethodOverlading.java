public class MethodOverlading {
    static void change(int [] arr){
        arr[0] = 45;
    }

    static void change(int x){
        x = 4;
    }
    

    public static void main(String[] args) {
        //Change an value of integer
        // int x = 7;
        // change(x);


        int [] marks = {34,23,14,22};
        change(marks);
        System.out.println(marks[0]);

        //Method Overloading can not be done by changing return type
    }
}
