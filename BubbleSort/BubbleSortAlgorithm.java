package BubbleSort;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr={5,10,7,101,1};
       for(int i=0; i<arr.length;i++){
        for(int j=0; j<arr.length-1; j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
       }

       for(int i=0;i<arr.length; i++){
        System.out.print(arr[i]+" ");
       }

       }
}
