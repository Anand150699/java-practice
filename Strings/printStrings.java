package Strings;
import java.util.*;
public class printStrings {
    //https://my.newtonschool.co/playground/code/lloyum343lov?admin-course-hash=7c635lc5hyyz
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr= new String[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.next();//// nextLine() will end up before length of array
            if(arr[i].length()>5){
                System.out.println(arr[i]);
            }
        }
    }
}

