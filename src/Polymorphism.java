interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
     
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Shashank", "Ritika", "Babli"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
    public void sampleMeth(){
        System.out.println("Meth");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2(); //this is a smartphone but use it as a camera
        // cam1.getNetworks();           --> not allowed (dynamic memory dispatch)
        // cam1.sampleMeth();            |^s//y 
        cam1.record4KVideo(); 

        MySmartPhone2 obj = new MySmartPhone2();
        obj.callNumber(123456);
        obj.sampleMeth();
    }
}
