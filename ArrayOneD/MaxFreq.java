package ArrayOneD;
import java.util.*;
/*https://my.newtonschool.co/playground/code/nb1pi4jnn7io?admin-course-hash=7c635lc5hyyz */
public class MaxFreq {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int[] freqArr= new int[n];
        int freq=1;
         for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]){
                freqArr[i]=freq;
                freq++;
            }
            else{
                freqArr[i]=freq;
                freq=1;
            }
        }
        freqArr[n-1]=freq;
  
        int max=Integer.MIN_VALUE;
        int index=n-1;
        for(int i=0; i<n; i++){
            if(freqArr[i]>=max){
                max=freqArr[i];
                index=i;
            }
            
        }
         System.out.print(arr[index]);
        
        
       
     
        
      }
      
}
