package Strings;
import java.util.*;
public class Palindrome {
    //https://my.newtonschool.co/playground/code/yagqgpfecbnm?admin-course-hash=7c635lc5hyyz
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        int f=0;
        int l= s.length()-1;
        int count=0;
        while(f<l){
            if(s.charAt(f)!=s.charAt(l)){
            count++;
            }
            f++;
            l--;
           
        }
            System.out.print(count);
        
    }
}
