package arrayList;
import java.util.*;
public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<Integer>();
        al.add(5);
        al.add(4);
        al.add(4);
        al.add(4);
        al.add(1);
        System.out.println(al);
        boolean prs=al.contains(6);
        System.out.println(prs);
        int count=Collections.frequency(al,4);
        System.out.println(count);
        al.remove(4);
        System.out.println(al);
        al.add(3,10);
        System.out.println(al);


    }
}
