import java.io.*;
import java.util.*;
import java.util.Queue;
public class QueueOperations {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        int s= q.size();
        int add=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<s; i++){
            int f= q.peek();
            add+=f;
            q.remove();
            if(f>max){
                max=f;
            }
            System.out.print(f+" ");
            q.add(f);
        }
        System.out.println();
        System.out.println(max);
        int avg= (int)(add/q.size());
         System.out.println(avg);
    }
}
