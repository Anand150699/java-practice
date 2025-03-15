class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class iteratingLinkedList {
    public static void main(String[] args) {
        Node a= new Node(34);
        Node b= new Node(22);
        Node c= new Node(12);
        Node d= new Node(11);
        a.next=b;
        b.next=c;
        c.next=d;

        //Iterating
        Node head=a;
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("null");
        System.out.println();
        //sum of all Nodes

        int sum=0;
        curr=head;
        while(curr!=null){
            sum+=curr.data;
            curr=curr.next;
        }

        System.out.println(sum);
    }
}
