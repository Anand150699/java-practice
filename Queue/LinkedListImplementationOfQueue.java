import java.util.*;
import java.io.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Queue{
    Node front=null;
    Node rear=null;
    int cnt=0;

    public void enque(int data){
        Node newNode= new Node(data);
        if(front==null){
            front=newNode;
            rear=newNode;
        }
        else{
            rear.next=newNode;
            rear=newNode;
        }
        cnt++;
    }

    public void deque(){
        if(front==null){
            return;
        }
        else{
            front=front.next;
            if(front==null){
                rear=null;
            }
            cnt--;
        }
    }

    public void size(){
        if(cnt==0){
            System.out.println("Empty queue");
        }
        else{
            System.out.println("Queue has size: "+cnt);
        }
    }

    public void peek(){
        if(front==null){
            System.out.println("Empty queue");
        }
        else{
            System.out.println(front.data);
        }
    }
}
public class LinkedListImplementationOfQueue {
    public static void main(String[] args) {
                Queue q= new Queue();
                q.enque(1);
                q.enque(2);
                q.enque(3);
                q.enque(4);
                q.size();
                q.peek();
                q.deque();
                q.size();
                q.peek();
               
    }
}
