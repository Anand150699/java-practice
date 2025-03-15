class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class practice {
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);

        a.next=b;
        b.next=c;
        c.next=d;

        Node prev=null;
        Node nxt=null;
        Node head=a;
        Node curr=head;

        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        head=prev;
        curr=head;
        
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }

    }
}
