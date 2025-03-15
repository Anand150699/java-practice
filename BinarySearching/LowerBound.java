package BinarySearching;
/*https://www.naukri.com/code360/problems/lower-bound_8165382?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM&count=25&page=6&search=&sort_entity=order&sort_order=ASC */
public class LowerBound {
    public static void main(String[] args) {
        int[] arr={5,8,12,24,30};
        int target=23;
        int l=0; 
        int r=arr.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]>=target){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(ans==-1){
            System.out.println(-1);
        }else{
            System.out.println(ans);
        }
    }
}
