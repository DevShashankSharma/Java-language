
class C1{
    public int x = 5;
    protected int y =45;
    int z = 6;
    private int a = 78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class AccessModifier2 {
    public static void main(String[] args) {
        C1 c = new C1();
        // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a);
    }
}


// Modifier        class       package     subclass        world
// public           Y            Y            Y             Y 
// protected        Y            Y            Y             N       
// no Modifier      Y            Y            N             N    
// private          Y            N            N             N