class EkClass{
    int a;
     
    EkClass(int a){
        this.a = a;
    }
    public int get(){
        return a;
    }
    public int returnone(){
        return 1;
    }
}

class DoClass extends EkClass{
    DoClass(int a){
        super(a);
        System.out.println("I am a constructor");
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        // EkClass e = new EkClass(4);

        DoClass d = new DoClass(34);
        System.out.println(d.get());
    }
}
