package ArrayOneD;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenateArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int[]newArray=arrayConcatenation(arr,n);
        System.out.println(Arrays.toString(newArray));

    }
    public static int[] arrayConcatenation(int[] arr, int n) {
        int[] ans=new int[2*n];
        for(int i=0;i<2*n;i++){
            ans[i]=arr[i%n];
        }
        return ans;
    }
}
