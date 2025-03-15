import java.io.*;
import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        HashMap<Character,String> name= new HashMap<>();
        name.put('a',"Anand");
        name.put('m',"Manojkumar");
        name.put('k',"Khandelwal");

        Set<Character> Keys= name.keySet();

        for(char i: Keys){
            System.out.print(i+" "+name.get(i));
            System.out.println();
        }
    }
}
