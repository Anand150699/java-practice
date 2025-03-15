package QuicKSort;

import java.util.Scanner;

public class QuickSort {
    public static int partition(int arr[], int l, int r){
        int pivot=arr[r];
        int left=l;
        for(int i=l;i<=r;i++){
            if(arr[i]<=pivot){
                //swap arr[i] arr[left]
                int temp=arr[i];
                arr[i]=arr[left];
                arr[left]=temp;
                left++;
            }
        }
        return left-1;
    }
    public static void quickSort(int arr[], int l, int r){
        if(l<r){
            int pt=partition(arr,l,r);
            quickSort(arr,l,pt-1);
            quickSort(arr,pt+1,r);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
