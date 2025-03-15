import java.io.*;
import java.util.*;

import javax.xml.transform.Source;
public class HashMapImplementation {
    public static void main(String[] args) {
        HashMap<Integer,Character> initials= new HashMap<>();
        initials.put(1,'a');
        initials.put(2,'b');
        initials.put(3,'c');
        initials.put(4, 'd');

        Set<Integer> Keys= initials.keySet();
        for(int i: Keys){
            System.out.print(i+" "+initials.get(i));
            System.out.println();
        }
        System.out.println(initials.size());
        System.out.println(initials.containsValue('b'));
        System.out.println(initials.containsKey(1));
        System.out.println(initials.isEmpty());

        
    }
}
