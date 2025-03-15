package BinarySearching;

import java.util.Scanner;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int find=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int elementFoundAtIndex=recursiveCallForBinarySearch(arr, find, 0, n-1);
        System.out.println(elementFoundAtIndex);
    }
    public static int recursiveCallForBinarySearch(int[] arr, int find, int l, int r ){
        if(l>r){
            return -1;
        }
        int mid=(l+r)/2;
        if(arr[mid]==find){
            return mid;
        }   
        else if(arr[mid]<find){
            l=mid+1;
           return recursiveCallForBinarySearch(arr,find,l,r);
        }
        else{
            r=mid-1;
            return recursiveCallForBinarySearch(arr, find, l, r);
        }
     }
}
