import java.util.*;
import java.io.*;
public class LargestSubArayWithZeroSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        int max=0;
        int sum=0;
        int findSum=15;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            if(sum==findSum){
               max=  Math.max(max,i+1);
            }
            else{
                
                if(hm.containsKey(sum-findSum)){
                    max= Math.max(max, i-hm.get(sum-findSum));
                }
                else{
                hm.put(sum,i);
                }
            }
        }

        System.out.println(max);
    }
}
