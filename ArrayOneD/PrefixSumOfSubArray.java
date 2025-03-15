package ArrayOneD;
import java.util.*;
public class PrefixSumOfSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] pre= new int[n];
        pre[0]=arr[0];
        for(int i=1; i<n; i++){
            pre[i]=arr[i]+pre[i-1];
        }
        int start=sc.nextInt();
        int end=sc.nextInt();
        int sum;
        if(start==0){
            sum=pre[end];
        }else{
            sum=pre[end]-pre[start-1];
        }
        System.out.println(sum);
    }
}
