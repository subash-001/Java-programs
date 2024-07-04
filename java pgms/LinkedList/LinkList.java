package LinkedList;

public class LinkList {
    private Node head;
    private Node tail;
    private int size;
    
    
   public LinkList() {
    this.size=0;
    }
    public void insertNode(int val){
        Node node = new Node(val);
        node.next= head;
        head =node;
        if(tail==null){
            tail = head;
        }
        size+=1;
        

    }
    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.val + " -> ");
            temp= temp.next;
        }
        System.out.println("end");
    }


private class Node{
        private int val;
        private Node next;
        public Node(int val) {
            this.val = val;
        }     
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

}
