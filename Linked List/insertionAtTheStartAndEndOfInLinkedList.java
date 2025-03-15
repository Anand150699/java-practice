class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class insertionAtTheStartAndEndOfInLinkedList {
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        Node head= a;
        //Insertion At BEGINING
        Node newNode= new Node(0);
        newNode.next=head;
        head=newNode;
        Node curr=head;
        //INSERTION AT THE END OF LINKED LIST
        Node newNode2= new Node(1000);
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode2;
        head=newNode;
        curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }

    }
}
