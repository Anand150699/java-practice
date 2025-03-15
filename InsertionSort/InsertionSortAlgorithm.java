package InsertionSort;
/*  Time complexity: Best case- size of the array of sorted array i.e. n, Avg case- n^2, worst case- O(n^2)
    Space complexity:The auxiliary space complexity of Insertion Sort is O(1), indicating it uses constant extra space regardless of the input size.

This is because the algorithm typically performs in-place sorting, 
meaning it rearranges the elements within the input array itself 
without requiring additional data structures or memory allocation proportional to the input size. 
Therefore, regardless of the size of the input array, the amount of extra space used by the Insertion Sort algorithm remains constant.
*/
import java.util.Scanner;
public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1; i<n; i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i=0;i<n; i++){
            System.out.print(arr[i]+" ");
        }


    }
}
