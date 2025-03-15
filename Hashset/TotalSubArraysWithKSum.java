import java.io.*;
import java.util.*;
public class TotalSubArraysWithKSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int cnt = 0;

        for(int i=0; i<n; i++){
            sum+= arr[i];
            if(sum==k) cnt++;
            if(hm.containsKey(sum-k)) cnt+= hm.get(sum-k);
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        }
        System.out.println(cnt);
    }

}
