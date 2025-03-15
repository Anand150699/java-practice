import java.io.*;
import java.util.*;
import java.util.Stack;
public class implementStack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        Stack<Integer> st2= new Stack<>();
        while(st.isEmpty()==false){
            int top= st.peek();
            st.pop();
            System.out.print(top+" ");
            st2.push(top);       
         }
         System.out.println();
         System.out.print(st);
         System.out.println();
         System.out.print(st2);

         while(st2.isEmpty()==false){
            int top= st2.peek();
            st2.pop();
            st.push(top);
         }
         System.out.println();
         System.out.print(st);

         System.out.println();
         System.out.println(st.search(1));
         System.out.println(st.search(4));
         System.out.println(st.search(5));

         System.out.println(st.contains(8));
        System.out.println(st.size());
    }

}
