import java.io.*;
import java.util.*;
public class MaxSubArrayWithKsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        int sum=0; 
        int max=0;
        for(int i=0; i<n; i++){
            sum+= arr[i];
            if(sum==k){ 
                max = i+1;
            }
            else {
                if(hm.containsKey(sum-k)) {
                max = Math.max(max, i-hm.get(sum));
                }
                else {
                hm.put(sum,i);
                }
            }
        }
        System.out.println(max);
    }
}
