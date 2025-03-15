package BinarySearching;
import java.util.Scanner;
//https://my.newtonschool.co/playground/code/nv76tpsr0cto
public class RotationInCircularArray {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int l=0; 
        int r=n-1;
        int ans=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[0]>arr[mid]){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        System.out.println(ans);
    }
}
