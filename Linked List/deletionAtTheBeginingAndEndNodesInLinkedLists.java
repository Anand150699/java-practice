
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class deletionAtTheBeginingAndEndNodesInLinkedLists {
    public static void main(String[] args) {
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

        Node head=a;
        Node curr=head;
        head=head.next;
        curr=head;
        /*while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
*/
        curr=head;
        while(curr.next!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
        curr=null;
        
    }
}
