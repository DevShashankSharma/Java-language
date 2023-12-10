import java.util.Scanner;

class myArray{
   int total_size;
   int use_size;  
   int [] Arr ;
   
   public Scanner scan = new Scanner(System.in);

   myArray(int tSize , int uSize){
      total_size = tSize;
      use_size = uSize;
   }

   public void GetArray(){
      for(int i=0 ; i<use_size ; i++){
         System.out.println(Arr[i]);
      }
   }

   public void SetArray(){
      Arr = new int [total_size];
      for(int i=0 ; i<use_size ; i++){
         System.out.print("Enter Arr" + i +" : ");
         Arr[i] = scan.nextInt();
      }
   }
   
}

public class dsaCreateADTArray {

   public static void main(String[] args) {
      myArray marks = new myArray(10,2);
      
      marks.SetArray();
      marks.GetArray();
   } 
}
