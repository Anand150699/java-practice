package BinarySearching;

public class NumberOfOccurance {
    //https://www.naukri.com/code360/problems/occurrence-of-x-in-a-sorted-array_630456?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    /*Problem statement
You have been given a sorted array/list of integers 'arr' of size 'n' and an integer 'x'.



Find the total number of occurrences of 'x' in the array/list.



Example:
Input: 'n' = 7, 'x' = 3
'arr' = [1, 1, 1, 2, 2, 3, 3]

Output: 2

Explanation: Total occurrences of '3' in the array 'arr' is 2.


Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
7 3
1 1 1 2 2 3 3


Sample Output 1:
2


Explanation For Sample Input 1:
In the given list, there are 2 occurrences of integer 3.


Sample Input 2:
 5 6
 1 2 4 4 5


Sample Output 2:
 0


Explanation For Sample Input 2:
In the given list, there are 0 occurrences of integer 6.


Expected time complexity:
The expected time complexity is O(log 'n').


Constraints:
1 <= n <= 10^4
1 <= arr[i] <= 10^9
1 <= x <= 10^9
Where arr[i] represents the element i-th element in the array/list.

Time Limit: 1sec
     * public class Solution {
    public static int count(int arr[], int n, int x) {
       int l=0;
       int r=n-1;
       int first=-1;
       while(l<=r){
           int mid=(l+r)/2;
           if(arr[mid]==x){
               first=mid;
               r=mid-1;
           }
           else if(arr[mid]>x){
               r=mid-1;
           }
           else{
               l=mid+1;
           }
       }
      l=0;
       r=n-1;
       int last=-1;
       while(l<=r){
           int mid=(l+r)/2;
           if(arr[mid]==x){
               last=mid;
               l=mid+1;
           }
           else if(arr[mid]>x){
               r=mid-1;
           }
           else{
               l=mid+1;
           }
       }

    if(first==-1){
            return 0;
    }
    else if(last==-1){
        return 1;
    }
    else{
        return (Math.abs(first-last))+1;
    }


    }
}
     */
}
