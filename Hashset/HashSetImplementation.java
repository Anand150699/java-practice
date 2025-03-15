import java.util.HashSet;

public class HashSetImplementation {
    public static void main(String[] args) {
        HashSet<Character> hs= new HashSet<>();
        String str="Khandelwal";

        for(int i=0; i<str.length(); i++){
            hs.add(str.charAt(i));
        }

        for(char i: hs){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(hs.contains('z'));
        System.out.println(hs.isEmpty());
        hs.remove('K');
        System.out.println(hs.contains('K'));
        System.out.println(hs.size());
        hs.clear();
        System.out.println(hs.size());
    }
}
