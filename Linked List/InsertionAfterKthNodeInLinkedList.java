import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class InsertionAfterKthNodeInLinkedList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        Node e= new Node(5);
        Node f= new Node(6);
        Node g= new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        Node newNode= new Node(1000);
        Node head=a;
        Node curr=head;
        for(int i=0; i<k-1; i++){
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;

        head=a;
        curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }

    }
}
