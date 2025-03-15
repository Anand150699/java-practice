package ArrayOneD;
import java.io.*; // for handling input/output
import java.util.*;
public class EvenFirst {
    //https://my.newtonschool.co/playground/code/j55prj0m68ii?admin-course-hash=7c635lc5hyyz
    

  // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

    public static void main (String[] args) {
       Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0; i<n; i++){
          arr[i]=sc.nextInt();
      }
      int[] even=new int[n];
      int [] odd= new int[n];
      int evenId=0; int oddId=0;
       for(int i=0; i<n; i++){
          if(arr[i]%2==0){
              even[evenId]=arr[i];
              evenId++;
          }
          else{
              odd[oddId]=arr[i];
              oddId++;
          }
      }
      int index=0;
      for(int i=0; i<evenId; i++){
          arr[index]=even[i];
          index++;
      }
      for(int i=0; i<oddId; i++){
          arr[index]=odd[i];
          index++;
      }
       for(int i=0; i<n; i++){
          System.out.print(arr[i]+" ");
      }

    }
}


 
