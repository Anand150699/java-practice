class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
public class insertANodeAtTheHeadOfDoublyLinkedList {
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);

        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;

        Node head=a;
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
        Node newNode= new Node(0);
        curr=head;
        newNode.next=curr;
        curr.prev=newNode;
        head=newNode;
        curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
