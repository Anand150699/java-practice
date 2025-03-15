package Strings;
import java.util.*;
//https://my.newtonschool.co/playground/code/gc3sm74dyt1j
public class anagram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        String b= sc.nextLine();
        char[] arr= a.toCharArray();
        char[] brr= b.toCharArray();
        if(a.length()!=b.length()){
            System.out.println("No");
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        a= new String(arr);
        b= new String(brr);
        if(a.equals(b)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
