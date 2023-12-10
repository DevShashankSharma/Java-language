class MyThreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
        System.out.println("I am a Thread1 not a treat");
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
        System.out.println("I am a Thread2 not a treat");
    }
}

public class Threading_using_runnable_interface {
    public static void main(String[] args) {
        MyThreadRunnable1 Bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(Bullet1);

        MyThreadRunnable2 Bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(Bullet2);

        gun1.start();
        gun2.start();
    }
}