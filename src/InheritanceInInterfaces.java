interface sampleInterfaces{
    void meth1();
    void meth2();
}
interface childSampleInterfaces extends sampleInterfaces{
    // void  meth1();   //not a valid way
    // void  meth2();
    void  meth3();
    void  meth4();
}

class MysampleClass implements childSampleInterfaces{
    public void meth1(){
        System.out.println("meth 1");
    }
    public void meth2(){
        System.out.println("meth 2");
    }
    public void meth3(){
        System.out.println("meth 3");
    }
    public void meth4(){
        System.out.println("meth 4");
    }
}

public class InheritanceInInterfaces {
    public static void main(String[] args) {
        MysampleClass o1 = new MysampleClass();
        o1.meth1();
        o1.meth2();
        o1.meth3();
        o1.meth4();
    }
}
