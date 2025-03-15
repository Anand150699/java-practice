package ArrayOneD;

import java.util.Scanner;
import java.util.*;

public class InsertAnElementAtGivenIndexOfAnArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        int x=sc.nextInt();
        int index=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n-1; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1; i>index; i--){
            arr[i]=arr[i-1];
        }
        arr[index]=x;
     for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
