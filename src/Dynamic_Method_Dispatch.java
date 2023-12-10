class Phone {
    public void name (){
        System.out.println("My name is Java");
    }

    public void greet () { 
        System.out.println("Good Morning");
    }
}

class SmartPhone extends Phone {
    public void name (){
        System.out.println("My name is Java of Java");
    }

    public void Morning () { 
        System.out.println("Good Morning , Welcome to class Two");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone();
        // SmartPhone smobj = new SmartPhone();
        // obj.name();

        Phone obj1 = new SmartPhone(); // by this we can only call the function which exits in main class
        // SmartPhone obj2 = new Phone(); // give error ---- not allowed

        obj1.greet();
        obj1.name(); // call sub class function
        // obj1.Welcome();//not allowed
    }
}
