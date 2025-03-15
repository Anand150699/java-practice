package ArrayOneD;

import java.util.Scanner;

public class EqualisingAnArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        int[] evenArray=new int[n];
        int[] oddArray=new int[n];
        int even=0;
        int odd=0;
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                evenArray[even]=arr[i];
                even++;
            }
            else{
                oddArray[odd]=arr[i];
                odd++;
            }
        }

        if(even>odd){
            for(int i=0;i<even;i++){
                System.out.print(evenArray[i]+" ");
            }
        }
        else{
                for(int j=0;j<odd;j++){
                    System.out.print(oddArray[j]+" ");
                }
            }
        }
        



        

    }

