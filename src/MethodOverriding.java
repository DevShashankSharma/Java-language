class A {
    public int med1(){
        return 4;
    }
    public void med2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override        //choice you can add or not
    public void med2(){
        System.out.println("I am method 2 of class B");
    }
    public void med3(){
        System.out.println("I am method 3 of class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.med2();

        B b = new B();
        b.med2();
    }
}
