class Base {
    int x;

    public void setx(int x) {
        System.out.println("I am setting x now");
        this.x = x;
    }

    public int getx() {
        return x;
    }

    public void printme() {
        System.out.println("I am constructor");
    }
}

class Derived extends Base {
    int y;

    public void sety(int y) {
        this.y = y;
    }

    public int gety() {
        return y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setx(4);
        System.out.println(b.getx());


        Derived d = new Derived();
        d.setx(3);
        System.out.println(d.getx());
        d.sety(6);
        System.out.println(d.gety());
    }
}
