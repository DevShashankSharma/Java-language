interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int b = 45;
    void BlowHornK3g();
    void BlowHornHHH();
}
// we can also extends class with implement
class AvonCycle implements Bicycle , HornBicycle{
    //can be overwrite in child class
    // public int b = 5;
    void BlowHorn(){
        System.out.println("pee pee poo poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedup");
    }
    public void BlowHornK3g(){
        System.out.println("pee pee");
    }
    public void BlowHornHHH(){
        System.out.println("poo pee");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        AvonCycle cycleShashank = new AvonCycle();
        cycleShashank.applyBrake(1);
        //you can create properties in interfaces
        // System.out.println(cycleShashank.a);
        
        //you cann't modifies properties in Interfaces as they are final
        // cycleShashank.a = 445;
        // System.out.println(cycleShashank.a);

        cycleShashank.BlowHornHHH();
        cycleShashank.BlowHornK3g();
    }
}
