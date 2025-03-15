class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class createSinglyLinkedList {
    public static void main(String[] args) {
        Node a= new Node(34);
        Node b=new Node(22);
        Node c= new Node(12);
        Node d= new Node(11);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(a.next.next.next.data);

    }
}
