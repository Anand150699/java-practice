package ArrayOneD;
public class OddEvenRotation {
    
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6};
        int n=arr.length;
        int arr0= arr[0];
        for(int i=0; i<n; i+=2){
            if((i+2)>n){
                arr[i]=arr0;
                break;
            }
            arr[i]=arr[i+2];
        }
        int lastOddElem=0;
        if((n-1)%2==1){
            lastOddElem=n-1;
        }else{
            lastOddElem=n-2;
        }
        int temp=arr[lastOddElem];
       for(int i=n-1; i>0; i--){
        if(i%2==1){
            if((i-2)<0){
                arr[i]=temp;
                break;
            }
            arr[i]=arr[i-2];
        }
       }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
//https://my.newtonschool.co/playground/code/flubss1ria8t
/*Given an array of size N. Rotate elements at the even indexes towards left by one index and rotate elements at the odd indexes towards right by one index.
Assume 0 based indexing. See the example for better understanding.
Input
You don't have to input anything just complete the given function rotate() .

Constraints
1 <= N <= 105
1 <= arr[i] <= 109
Solve the problem without using extra space .
Output
No need to output anything. The driver code will take care of print the result.
Example
Input:
7
0 1 2 3 4 5 6

Output:
2 5 4 1 6 3 0

Explanation :
even indexed elements => { 0, 2, 4, 6 } => left rotation => {2, 4, 6, 0 }
odd indexed elements => { 1, 3, 5 } => left rotation => {5, 1, 3 }*/