package LearnAndEarn;

import java.util.Scanner;

public class learnAndEarn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();//array length
        int[] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();//no. of rotation
        while(t>0){
        int arr0 = arr[0];
        for(int i=0;i<n;i++){
            if(i==n-1){
                arr[i] = arr0;
            }
            else{
                arr[i]= arr[i+1];
            }
        }
        t--;
    }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
       
       
        
    }
}
