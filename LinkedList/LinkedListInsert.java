class Node{
int trackId;
Node next;
Node(int trackId){
this.trackId=trackId;
this.next=null;
}
}

public class LinkedListInsert{
static void insertAfter(Node current,int trackId){
Node newNode=new Node(trackId);
newNode.next=current.next;
current.next=newNode;
}

public static void main(String[] args){
Node head=new Node(1);
head.next=new Node(2);
head.next.next=new Node(3);

insertAfter(head.next,99);

Node temp=head;
while(temp!=null){
System.out.print(temp.trackId+" ");
temp=temp.next;
}
}
}