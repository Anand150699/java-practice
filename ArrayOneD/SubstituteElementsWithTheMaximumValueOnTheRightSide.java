package ArrayOneD;

import java.util.Arrays;

public class SubstituteElementsWithTheMaximumValueOnTheRightSide {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        substituteValues(arr);
        System.out.println(Arrays.toString(arr));
    }
    //T.C=O(n^2)
    public static int[] substituteValues(int[] arr) {
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            int max=Integer.MIN_VALUE;
            for(int j=i+1; j<n; j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            arr[i]=max;
        }
        arr[n-1]=-1;
        return arr;
    }
}
/*
T.C=O(n)
  public static int[] substituteValues(int[] arr) {
    int mx=-1;
    int n=arr.length;
    for(int i=n-1;i>=0;i--){
        int x=arr[i];
        arr[i]=mx;
        if(x>mx)mx=x;
    }
    return arr;
}
 Array Rotation
Easy
Time Limit: 2, Memory Limit: 256000
A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. Given an integer, d, rotate the array that many steps left and return the result. Example d = 2 arr = [1, 2, 3, 4, 5] arr' = [3, 4, 5, 1, 2]
Input
The first line contains two space- separated integers that denote n, the number of integers, and d, the number of left rotations to perform.
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
[1, 2, 3, 4, 5] -> [2, 3, 4, 5, 1] -> [3, 4, 5, 1, 2] -> [4, 5, 1, 2, 3] -> [5, 1, 2, 3, 4]*/