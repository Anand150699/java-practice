//https://my.newtonschool.co/playground/code/u1fwfhmcwz1u
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class zeroesAtTheFrontOfLinkedList {
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(0);
        Node c= new Node(0);
        Node d=new Node(0);
        a.next=b;
        b.next=c;
        c.next=d;
        Node head=a;
        Node curr=head;
        int cnt=0;
        while(curr!=null){
            if(curr.next!=null && curr.next.data==0){
                cnt++;
                curr.next=curr.next.next;
            }
            else{
            curr=curr.next;
            }
        }

        for(int i=0; i<cnt; i++){
            Node newNode= new Node(0);
            newNode.next=head;
            head=newNode;
        }

        curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }

    }

}
