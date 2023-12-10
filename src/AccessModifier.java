class MyEmployee{
    private int id ;
    private String name;

    public void Setter (int a , String n){
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

public class AccessModifier {
    public static void main(String[] args) {
        MyEmployee Shashank  = new MyEmployee();
        // Shashank.id =67;//give error due to private access modifier
        // Shashank.name = "Shashank";//give error due to private access modifier

        Shashank.Setter(45, "Shashank");

        System.out.println(Shashank.getid()); 
        System.out.println(Shashank.getname()); 
    }
}
