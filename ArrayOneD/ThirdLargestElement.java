package ArrayOneD;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int firstMax=Integer.MIN_VALUE;
        int secondMax= Integer.MIN_VALUE;
        int thirdMax=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>firstMax){
                thirdMax=secondMax;
                secondMax=firstMax;
                firstMax=arr[i];
                
            }
            else if(arr[i]>secondMax){
                thirdMax=secondMax;
                secondMax=arr[i];
            }
            else if(arr[i]>thirdMax){
                thirdMax=arr[i];
            }
        }

        System.out.println(thirdMax);
    }
}
