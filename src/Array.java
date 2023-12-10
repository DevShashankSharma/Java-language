public class Array {
    public static void main(String[] args) {
        // int [] marks = new int[5];

        //OR

        // int [] marks;
        // marks = new int[5];
        // marks[0] = 45;
        // marks[1] = 56;
        // marks[2] = 67;
        // marks[3] = 423;
        // marks[4] = 6009;  

        //OR

        int [] marks = {45,56,67,423,6009};
        
        // for(int i=0; i<marks.length ; i++){
        //     System.out.println(marks[i]);
        // }

        for(int element : marks){ //using for each loop;
            System.out.println(element);
        }
        System.out.println(marks.length);


        String [] student = {"Shashank" , "Ritika" , "Roopnarayan" , "Babli"};

        System.out.println(student.length);
        System.out.println(student[3]);
    }
}
