import java.io.*;
import java.util.*;
class Stack{
    int max_size=100;
    int[] arr= new int[max_size];
    int top=0;
    public void push(int data){
        arr[top]=data;
        top++;
    }

    public void pop(){
        top--;
    }

    public void peek(){
        if(top==0){
            System.out.println("Empty Stack");
        }
        else{
        System.out.println(arr[top-1]);
        }
    }

    public void size(){
        System.out.println(top);
    }

    public void empty(){
        if(top==0){
        System.out.println("Empty Stack");
        }
        else{
            System.out.println("Not Empty stack, of size: "+ top);
        }
    }
}
public class ArrayImplementationOfStack {
    public static void main(String[] args) {
        Stack st= new Stack();
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.peek();
        st.pop();
        st.peek();
        st.size();
        st.empty();
    }
}
