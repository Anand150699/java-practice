import java.io.*;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Stack{
    Node head=null;
    int cnt=0;
    void push(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
        cnt++;
    }

    void pop(){
        if(head!=null){
            head=head.next;
            cnt--;
        }
    }

    void peek(){
        if(head==null){
            System.out.println("Empty Stack");
        }
        else{
            System.out.println(head.data);
        }
    }

    void size(){
        System.out.println(cnt);
    }

    void empty(){
        if(head==null){
            System.out.println("Stack Empty");
        }
        else{
            System.out.println("Not Empty Stack");
        }
    }
}

public class LinkedListImplementationOfStack {
    public static void main(String[] args) {
        Stack st= new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.peek();
        st.pop();
        st.peek();
        st.size();
        st.empty();

    }
}
