import java.io.*;
import java.util.*;
public class SearchEmployee {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        HashSet<String> hs= new HashSet<>();
        for(int i=0; i<n; i++){
            hs.add(sc.nextLine());
        }
        String check= sc.nextLine();
        System.out.println(hs.contains(check));
    }
}
