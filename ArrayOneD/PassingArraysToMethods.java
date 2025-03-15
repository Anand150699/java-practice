package ArrayOneD;

public class PassingArraysToMethods {
    public static void main(String[] args) {
        int [] arr={0,1};
        change(arr);
        printArray(arr);
     }
     public static void change(int[] arr){
        arr[0]=1;
        arr[1]=0;
     }
     public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
     }
}
