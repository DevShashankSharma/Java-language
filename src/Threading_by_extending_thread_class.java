class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("My Thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("Thread2 is good");
            System.out.println("I am sad");
            i++;
        }
    }
}

public class Threading_by_extending_thread_class {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
