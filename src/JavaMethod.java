public class JavaMethod {
    // static int logic(int x , int y){
    //     int z;
    //     if(x>y){
    //         z = x+y;
    //     } else{
    //         z = (x+y)*5;
    //     }
    //     return z;
    // }
    int logic(int x , int y){
        int z;
        if(x>y){
            z = x+y;
        } else{
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        // int a = 3;
        // int b = 4;
        // int c = logic(a, b);//static funtion can call
        // if(a>b){
        //     c = a+b;
        // } else{
        //     c = (a+b)*5;
        // }
        
        int a1 = 6;
        int b1 = 4;
        // int c1 = logic(a1, b1);//static function can call;
        // if(a1>b1){
        //     c1 = a1+b1;
        // } else{
        //     c1 = (a1+b1)*5;
        // }

        JavaMethod obj1 = new JavaMethod();
        int c1 = obj1.logic(a1, b1);

        // System.out.println(c);
        System.out.println(c1);
    }
}
