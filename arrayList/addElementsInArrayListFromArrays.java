package arrayList;
import java.util.*;
public class addElementsInArrayListFromArrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int [n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0; i<n; i++){
            al.add(arr[i]);
        }
        System.out.println(al.contains(6));
        Collections.sort(al);
        System.out.println(al);
        int count=Collections.frequency(al,5);
        System.out.println(count);
    }
}
