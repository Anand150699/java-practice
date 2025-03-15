package Strings;

import java.util.Scanner;

public class CheckWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int n=str.length();
        boolean spaceExists=false;
        for(int i=0; i<n; i++){
            if(str.charAt(i)==' '){
                spaceExists=true;
            }
        }
        if(spaceExists){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
