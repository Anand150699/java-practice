package ArrayOneD;
import java.util.*;
/*https://leetcode.com/problems/find-the-duplicate-number/submissions/1230926517/ */// for T.C O(N)
public class FindDuplicateInAnArray {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4,4};
        int ans=findDuplicate(nums);
        System.out.println(ans);
    }
    public static int findDuplicate(int[] nums) {
        int ans=-1;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                ans=nums[i];
            }
        }
        return ans;
        }
        //for T.C O(N)
}
//FOR T.C O(N^2);
/*int ans=-1;
for(int i=0; i<nums.length-1; i++){
    for(int j=i+1; j<nums.length;j++){
        if(nums[i]==nums[j]){
            ans=nums[j];                }
    }*/