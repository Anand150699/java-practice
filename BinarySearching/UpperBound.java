/*Upper Bound= first number> target 
 * Lower Bound= first Number>=target
 * Even though the target elements are not present in an array, it provides the respective outputs.
 */
package BinarySearching;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int l=0;
        int r=n-1;
        int UpperBound=-1;
        while(l<=r){
            int mid=(l+r)/2;
             if(arr[mid]>target){
                UpperBound=mid;
                r=mid-1;
                
            }
            else{
                l=mid+1;
            }
        }
        if(UpperBound==-1){
            System.out.println("Upper Bound not found!!!!!");
        }else{
            System.out.println(UpperBound);
        }
    }
}
