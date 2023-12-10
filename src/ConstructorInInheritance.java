class Base1 {
    public int x ;

    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int a){
        x = a;
        System.out.println("I am a overloaded constructor with value of a is : " + a);
    }
}

class Derieved1 extends Base1 {
    public int y;

    Derieved1(){
        super(0);
        System.out.println("I am constructor of derieved class");
    }
    Derieved1(int x , int y){
        super(x);
        System.out.println("I am a overloaded constructor with value of y : " + y);
    }
}

class childofderieved extends Derieved1 {
    childofderieved(){
        System.out.println("I am constructor of derieved class");
    }

    childofderieved(int x , int y , int z){
        super(x, y);
        System.out.println("I am constructor of derieved class of z value : " + z);
    }
}
public class ConstructorInInheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();

        // Derieved1 d = new Derieved1();
        // Derieved1 d = new Derieved1(4,9);


        // childofderieved cd = new childofderieved();
        childofderieved cd = new childofderieved(12,13,14);

        System.out.println(cd.x);
        cd.x = 4;
        System.out.println(cd.x);
    }
}
