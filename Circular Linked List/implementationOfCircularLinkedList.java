class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class implementationOfCircularLinkedList {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=a;

        Node head=a;
        Node curr=head;

        do{
            System.out.print(curr.data+" ");
            curr=curr.next;

        }while(curr!=head);
    }
}
