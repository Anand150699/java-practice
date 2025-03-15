package ArrayOneD;

import java.util.Scanner;

public class IndexPlus1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=i+1;
            System.out.println(arr[i]);
        }

    }
}
