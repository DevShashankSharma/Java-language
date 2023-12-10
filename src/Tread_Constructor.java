class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        // int i= 34;
        System.out.println("Thank You");
        // while(true){
        //     System.out.println("I am a Thread");
        // }
    }
}

public class Tread_Constructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("Shashank");
        MyThr t1 = new MyThr("Ritika");

        t.start();
        t1.start();

        System.out.println("The id of the thread is " + t.threadId());     //at place of t.getId()
        System.out.println("The name of the thread is " + t.getName());

        System.out.println("The id of the thread1 is " + t1.threadId());
        System.out.println("The name of the thread1 is " + t1.getName());
    }
}
