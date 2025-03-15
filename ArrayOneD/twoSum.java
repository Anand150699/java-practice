package ArrayOneD;
import java.util.*;
//https://leetcode.com/problems/two-sum/
public class twoSum {
    public static int[] getTwoSum(int[] nums, int target) {
        int n=nums.length;
        int[] ans= new int[2];
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int sum=nums[i]+nums[j];
                if(sum==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
                sum=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] arr= new int [n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int []ans=getTwoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }

}
