public class Loop {
    public static void main(String[] args) {
    //     int i = 0;
    //     while(i<10){
    //         System.out.println(i);
    //         i++;
    //     }

    //     do{
    //         System.out.println(i);
    //     }while(i<7);

    //     for(int j=0; j<5; j++){
    //         System.out.println(j);
    //     }

        for(int i=0;i<5 ;i++){
            for(int j=i;j<5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
