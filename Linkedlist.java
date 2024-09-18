//LinkedList --Total 6 opration    --18 sept 2024
 class t{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next=null;
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
public static void main(String[] args) {
    t li = new t();
    li.addstart("Tabish");
    li.addstart("name is");
    li.addstart("My");
    li.printlist();
    li.addend("Ansari!!!");
    li.printlist();
}
}
