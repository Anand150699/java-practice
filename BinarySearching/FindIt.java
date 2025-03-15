
package BinarySearching;
/*Find it!!
Easy
Time Limit: 2, Memory Limit: 256000
Given an integer K, find a positive integer x such that K = x2 + 3*x. If no such positive integer x exists, print -1.
Input
First and the only line of the input contains an integer K.

Constraints:
1 <= K <= 1018
Output
Print a positive integer x such that the above equation satisfies. If no such integer x exists, print -1.
Example
Sample Input:
28

Sample Output:
4

Explaination:
42 + 3*4 = 28
There is no other positive integer that will give such result. */
import java.io.*; 
import java.util.*;
public class FindIt {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        long k= sc.nextLong();
        long ans=-1;
        long l=0, r=(long)Math.sqrt(k);
        while(l<=r){
            long mid=(l+r)/2;
            long val=mid*mid+3*mid;
            if(val==k){
                ans=mid;
                break;
            }
            else if(val<k){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        System.out.println(ans);
    }
}
