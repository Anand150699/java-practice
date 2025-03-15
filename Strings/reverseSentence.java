package Strings;

import java.util.Scanner;

public class reverseSentence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String sent=sc.nextLine();
        String[] arr=sent.split(" ");
        int n=arr.length;
        for(int i=0; i<n/2; i++){
            String temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        String soln= String.join(" ",arr);
        System.out.println(soln);

    }
}
