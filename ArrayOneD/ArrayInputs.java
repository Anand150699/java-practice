package ArrayOneD;

import java.util.Scanner;

public class ArrayInputs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= new int[n];
        /*int x=sc.nextInt();
        int found=0;*/
        //int sum=0;
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            /*if(arr[i]==x){
                found=i;
            }*/
            //sum+=arr[i];
            //System.out.print(arr[i]+" ");
        }

        /*if(found==0){
            System.out.println("Not found!!!");
        }else{
            System.out.println(found);
        }*/
        
       int max=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]<max){
                max=arr[i];
            }
        }
        System.out.println(max);

       // System.out.println(sum);
    }
}
