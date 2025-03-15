package ArrayOneD;
import java.util.*;
public class SumOfAnSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int start=sc.nextInt();
        int end=sc.nextInt();
        int sum=0;
        for(int i=start;i<=end;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
