package BinarySearching;
import java.util.*;
public class MindCutTree {
        public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                int n=sc.nextInt();
                int k=sc.nextInt();
                int[] arr= new int[n];
                int max= Integer.MIN_VALUE;
                for(int i=0; i<n; i++){
                    arr[i]=sc.nextInt();
                    if(arr[i]>max){
                        max=arr[i];
                    }
                }
                int l=0;
                int h=max;
                int ans=0;
                while(l<=h){
                    int x=(l+h)/2;
                    int total=calculateWood(arr,x,n);
                    if(total>k){
                        l=x+1;
                    }else{
                         ans=x;
                        h=x-1;
                    }
                }
                System.out.print(ans);
                
                
        
            }
            public static int calculateWood(int[]arr, int x, int n){
                int add=0;
                for(int i=0; i<n; i++){
                    int sum=arr[i]-x;
                    if(sum<=0){
                        sum=0;
                    }
                    add+=sum;
                }
                return add;
            }
        
}
