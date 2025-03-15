package ArrayOneD;
import java.util.Scanner;
public class ArrayLeftRotation {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] arr= new int [n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int t=0;t<d; t++){
        int temp=arr[0];
        for(int i=0; i<n; i++){
            if((i+1)>=n){
                arr[i]=temp;
                break;
            }
            arr[i]=arr[i+1];
        }
    }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
       
    }
}
/****************************OR***********************************/
//1.Reverse whole array (0 to n-1)
//2.Reverse first (n-d) numbers
//3.Reverse last d numbers
/*import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] arr= new int [n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
      leftMove(arr,0,n-1);
      leftMove(arr,0,n-(d+1));
      leftMove(arr,n-d,n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        } 
    }
    public static void leftMove(int[] arr, int l, int r){
        int temp=0;
       while(l<r){
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
       
    }

} */ 
/*A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. 
Given an integer, d, rotate the array that many steps left and return the result. 
Example d = 2 arr = [1, 2, 3, 4, 5] arr' = [3, 4, 5, 1, 2]
Input
The first line contains two space- separated integers that denote n, the number of integers, 
and d, the number of left rotations to perform.
The second line contains n space- separated integers that describe arr[].

Constraints
1 ≤ n ≤ 105
1 ≤ d ≤ n
1 ≤ arr[i] ≤ 106
Output
Print the rotated array.
Example
Sample Input
5 4
1 2 3 4 5
Sample Output
5 1 2 3 4
Explanation
To perform d = 4 left rotations, the array undergoes the following sequence of changes:
[1, 2, 3, 4, 5] -> [2, 3, 4, 5, 1] -> [3, 4, 5, 1, 2] -> [4, 5, 1, 2, 3] -> [5, 1, 2, 3, 4] */