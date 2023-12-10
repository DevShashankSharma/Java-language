class employee {
    int salary;
    // int id;
    String name;

    // public void printdetail(){
    //     System.out.println("My id is : " + id);
    //     System.out.println("My name is : " + name);
    // }

    public int getdata(){            
        return salary;
    }

    public void setname(String str){
        name = str;
    }
    public String getname(){
        return name;
    }
}

public class Class {
    public static void main(String[] args) {
        employee Shashank = new employee(); // Initiating a new object of employee class
        // employee Ritika = new employee();


        // Setting Attributes
        // Shashank.id = 1001;
        // Shashank.salary = 444;
        // Shashank.name = "Shashank Sharma";

        // Ritika.id = 1002;
        // Ritika.salary = 444;
        // Ritika.name = "Ritika Sharma";


        // Printing the Attributes

        // System.out.println(Shashank.id);
        // System.out.println(Shashank.name);
        // Shashank.printdetail();
        // Ritika.printdetail();







        Shashank.salary = 444;
        Shashank.setname("Shashank Sharma");


        System.out.println("My name is : " + Shashank.getname());
        System.out.println("My Salary is : " + Shashank.getdata());
    }

}