class MymainEmployee{
    private int id ;
    private String name;
    
    public MymainEmployee (){
            id = 56;
            name = "Ritika";
        }

    public MymainEmployee (int a , String n){
        id = a;
        name = n;
    }

    public int getid(){
        return id;
    }
    public String getname (){
        return name;
    }
}

public class Constructors {
    public static void main(String [] args){
        MymainEmployee e1 = new MymainEmployee(45, "Shashank Sharma");

        System.out.println(e1.getid()); 
        System.out.println(e1.getname()); 

        //Overloading constructor
        MymainEmployee e2 = new MymainEmployee();
        System.out.println(e2.getid());
        System.out.println(e2.getname());
    }
}
