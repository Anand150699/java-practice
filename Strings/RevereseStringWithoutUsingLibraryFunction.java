package Strings;


public class RevereseStringWithoutUsingLibraryFunction{
    public static void main(String[] args) {
        
    String original="Anand";
    System.out.println(reversedString(original));
}

public static String reversedString(String str) {
    char[] charArray= str.toCharArray();
    int left=0;
    int right=charArray.length-1;

    while(left<right){
        char temp= charArray[left];
        charArray[left]=charArray[right];
        charArray[right]=temp;

        left++;
        right--;

    }
    return new String(charArray);

}
    
}