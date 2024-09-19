//LinkedList --Total 6 opration    --18 sept 2024
import java.util.LinkedList;
class LL{
    private int size;
    Node head;
    LL(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next=null;
            size++;
        }
    }
//1st operation -> Adding Node
//1. At starting
public void addstart(String data){
    Node new_node = new Node(data);
    if(head==null){
        head = new_node;
        return;
    }
    new_node.next = head;
    head = new_node;
}
//2. At end
public void addend(String data){
    Node new_node = new Node(data);
    if(head==null){
        head = new_node;
        return;
    }
    Node curr_node = head;
    while(curr_node.next != null){
        curr_node=curr_node.next;
    }
    curr_node.next = new_node;
}
//2nd operation -> Printing Linked list
public void printlist(){
    Node curr_node = head;
    while(curr_node != null){
        System.out.print(curr_node.data+" -> ");
        curr_node=curr_node.next;
    }
}
//3rd Operation -> Deletion
public void deletionatstart(){
    if(head == null){
        System.out.println("The list is empty");
        return;
    }
    size--;
    head=head.next;
}
public void deletionatend(){
    Node lastnode = head.next;
    Node secondlast=head;
    if(head == null){
        System.out.println("The list is empty");
        return;
    }
    size--;
    if (head.next==null) {
        head = null;
    }
    while(lastnode.next!=null){
        lastnode = lastnode.next;
        secondlast=secondlast.next;
    }
    secondlast.next = null;
}
//4rth operation -> size
public int getsize(){
    return size;
}
public static void main(String[] args) {
    LL li = new LL();
    li.addstart("Tabish");
    li.addstart("name is");
    li.addstart("My");
    li.addend("Ansari!!!");
    li.deletionatend();
    li.printlist(); 

    System.out.println(li.getsize());
    //<--------------------------------------------------------------->
    //OR we can use buildin linkedlist that is provided by java
    LinkedList<String> li2 = new LinkedList<>();
    li2.addFirst("fatima");
    li2.addFirst("is");
    li2.addFirst("name");
    li2.addFirst("My");
    System.out.println(li2);
    System.out.println(li2.size());
    li2.remove(2);
    System.out.println(li2);
    li2.removeFirst();
    System.out.println(li2);
    li2.removeLast();
    System.out.println(li2);

}
}
