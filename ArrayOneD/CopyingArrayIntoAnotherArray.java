package ArrayOneD;

import java.util.Scanner;

public class CopyingArrayIntoAnotherArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        int[] brr= new int[n];
        int[] frr= new int[n+n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            frr[i]=arr[i];
        }
        int count=5;
        for(int i=0; i<n; i++){
            brr[i]=sc.nextInt();
            frr[count++]=brr[i];
        }
        for(int i=0; i<n+n; i++){
            System.out.println(frr[i]);
        }
        
        


    }
}
