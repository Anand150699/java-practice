/*First & Last
Easy
Time Limit: 2, Memory Limit: 256000
Ram is given an array A of length N, Ram can right-rotate the array any number of times (possibly zero times also). 
His task is to find out the maximum value of A1 + AN.
Note: Right rotation of array [A1, A2,. , AN] is [AN, A1,. , AN-1].
Input
The first line of the input contains a single integer T, denoting the number of test cases.
The first line of each test case contains a single integer N, denoting the size of an array A.
The second line of each test case contains N space- separated integers denoting array A.

Constraints
1 ≤ T ≤ 1000
1 ≤ N ≤ 105
1 ≤ Ai ≤ 109
Output
For each test case output on a new line denoting the maximum value of A1 + AN.
Example
Sample Input
3
2
5 8
3
5 10 15
4
4 4 4 4
Sample Output
13
25
8 */
package ArrayOneD;
import java.util.Scanner;
public class FirstandLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=1;j<=t;j++){//t times
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int mx=arr[0]+arr[n-1];
            for(int i=1;i<n;i++){
                int pair=arr[i]+arr[i-1];
                if(pair>mx){
                    mx=pair;
                }
            }
            System.out.println(mx);
        }
    }
}
