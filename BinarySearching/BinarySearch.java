package BinarySearching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
//BINARY SEARCH ONLY WORKS IN SORTED ARRAY
//Read https://www.geeksforgeeks.org/linear-search-vs-binary-search/ 
//T.C.=> O(logn)
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int find=sc.nextInt();
        
        int first=0;
        int last= n-1;//4
        int pos=0;
        int flag=-1;
       while(first<=last){
            int mid= (first+last)/2; //2 //0
            if(arr[mid]==find){
                pos= mid;
                flag=1;
                break;
                
            }

            else if(find<arr[mid]){
                last=mid-1;        //1
            }

            else {
                first=mid+1;
                }
            
        }

        if(flag==-1){
            System.out.println("Not Found");
        }
        else System.out.println("Given number" +find+"found at:"+ pos);
    }
}
