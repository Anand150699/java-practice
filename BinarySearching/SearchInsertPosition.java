package BinarySearching;
/* Problem statement
You are given a sorted array 'arr' of distinct values and a target value 'm'.
You need to search for the index of the target value in the array.
Note:
If the value is present in the array, return its index.
If the value is absent, determine the index where it would be inserted in the array while maintaining the sorted order. Example:
Input:  arr = [1, 2, 4, 7],  m = 6 

Output: 3

Explanation: If the given array 'arr' is: [1, 2, 4, 7] and m = 6. We insert m = 6 in the array and get 'arr' as: [1, 2, 4, 6, 7]. The position of 6 is 3 (according to 0-based indexing)


Note:
1) The given array has distinct integers.

2) The given array may be empty.


Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
4 9
1 2 4 7


Sample Output 1:
4

Explanation of Input 1:
The given array 'arr' is: [1, 2, 4, 7] and m = 9. We insert m = 9 in the array and get 'arr' as: [1, 2, 4, 7, 9]. The position of 9 is 4 (according to 0-based indexing).


Sample Input 2:
3 1
2 5 7


Sample Output 2
0


Explanation of Input 2:
The given array 'arr' is: [2, 5, 7] and m = 1. We insert m = 1 in the array and get 'arr' as: [1, 2, 5, 7]. The position of 1 is 0 (according to 0-based indexing)


Sample Input 3:
4 2
1 2 4 7


Sample Output 3:
1


Explanation of Input 3:
The given array 'arr' is: [1, 2, 4, 7] and m = 2. We already have 2 in 'A'. The position of 2 is 1 (according to 0-based indexing)*/
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr={1,2,4,7};
        int m=5;
        int position=searchInsert(arr, m);
        System.out.println(position);
    }
    public static int searchInsert(int [] arr, int m){
        int l=0;
        int r= arr.length-1;
        int ans=arr.length;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]>=m){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
     }
}
