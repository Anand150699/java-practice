package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String original="Anand";
        String reverse="";
        int j=0;
        for(int i=original.length()-1; i>=0; i--){
            reverse+=original.charAt(i);
        }
        System.out.println(reverse);
    }
}
