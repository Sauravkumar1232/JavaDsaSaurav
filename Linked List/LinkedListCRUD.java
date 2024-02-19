import javax.swing.plaf.synth.SynthSpinnerUI;

public class LinkedListCRUD<T> {
    Node<T> start;

    static class Node<T>{
        T data;
        Node<T> next;
        Node(T data){
            this.data = data;
            this.next=null;
        }
    }

    void insertAtBeg(Node<T> node) {
        // if linked list is empty
        if(start == null) {
            start = node;
            return;
        }

        node.next = start;
        start = node;
    }

    void insertAtEnd(Node<T> node) {
        // if linked list is empty
        if(start == null) {
            start = node;
            return;
        }
        // if linked list has only one node
        if(start.next == null) {
            start.next = node;
            return;
        }

        Node<T> temp = start;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    void insertAtMid(Node<T> node, int pos) {
        // if linked list is empty
        if(start == null) {
            start = node;
            return;
        }
        if(pos == 0) {
            insertAtBeg(node);
        }

        int i = 1;
        Node<T> temp = start;
        while(i < pos) {
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;
    }

    void deleteAtBeg() {
        if(start == null) {
            throw new RuntimeException("List is empty...");
        }

        if(start.next == null) {
            start = null;
            return;
        }

        start = start.next;
    }

    void deleteAtEnd() {
        
    }

    void deleteAtMid() {

    }

    void midPoint() {
        Node<T> slow;
        Node<T> fast;
        slow = fast = start;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Mid Point : " + slow.data);
    }

    void kthFromEnd(int k) {
        Node<T> p;
        Node<T> q;
        p = q = start;
        int i = 0;
        while(i < k) {
            q = q.next;
            i++;
        }  
        while(q.next != null) {
            q = q.next;
            p = p.next;
        }
        System.out.println("Kth element is : " + p.data);
    }

    void reverseIterate() {
        
        if(start==null){
            System.out.println("Linked List is Empty");
            return;
        }
        if(start.next==null){
            System.out.println("Only one node is avaibale");return;
        }
        System.out.println("     reverse");
        Node<T> current=start;
        Node<T> pre = current;
        Node<T> nxt=current.next;
        current=nxt;
         pre.next=null;        
        System.out.println(current.data);
    
        while(current!=null){
            nxt=nxt.next;
            current.next=pre;
            pre=current;
            current=nxt;
        
            
           
        }
        start.next=null;
        start=pre;

    }
    Node<T> reverseUsingRecc( Node<T> curr, Node<T> pre,Node<T> nxt ){
        System.out.println("using rec");
        // Node<T> nxt=curr.next;
       
      if(curr==null){
        Node<T> temp=start;
        while( temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }

        return pre;
      }
      
     //   Node<T> nextNode = curr;
       
    //    nxt=curr.next;
    nxt=curr.next;
    curr.next=pre;
       
       pre=curr;
       curr=nxt;
       //nxt=nxt.next;
       //System.out.println(pre.data);
       return reverseUsingRecc(curr, pre,nxt);
       
       

     
        
      

        
    }

    void print() {
        System.out.println("print new list");
        Node<T> current = start;
        while(current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LinkedListCRUD<Integer> root = new LinkedListCRUD<>();
        root.insertAtBeg(new Node<>(10));
        root.insertAtBeg(new Node<>(20));
        root.insertAtBeg(new Node<>(30));
        root.insertAtBeg(new Node<>(40));
        root.insertAtEnd(new Node<>(100));
        root.insertAtMid(new Node<>(75), 3);

        root.print();
        root.deleteAtBeg();

        root.print();
       
       
        root.reverseIterate();
        root.print();

        root.reverseUsingRecc(root.start,null,root.start.next );
        root.print();
    }
}