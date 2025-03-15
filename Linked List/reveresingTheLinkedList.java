//https://my.newtonschool.co/playground/code/1pu49kw4aatn
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class reveresingTheLinkedList {
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        Node e= new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node head=a;
        Node curr=head;
        Node prev=null;
        Node nxt=null;
        while (curr!=null) {
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;

        }

        head=prev;
        curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
    }
}
