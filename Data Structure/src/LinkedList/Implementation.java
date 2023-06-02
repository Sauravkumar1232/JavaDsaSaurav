package LinkedList;

public class Implementation {
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	
	public static class linkedList{
		Node head=null;
		Node tail=null;
		
		int getAt(int index) {
			
			Node temp = head;
			if(index>size() || index<0) {
				System.out.println ("not possible");return-1;
			}
			for(int i=1;i<=index;i++) {
				temp=temp.next;
			}
			return temp.data;
		}
		void insertAt(int index,int val) {
			Node t=new Node(val);
			Node temp = head;
			
			if(index==size()) {
				insertEnd(val);
				return;
			}
			else if(index==0) {
				insertBeg(val);return;
			}
			else if(index<0) {
				System.out.println("Wrong Inddex");return;
			}
			else if(index>size()) {
				System.out.println("Wrong Inddex");return;
			}
			for(int i=0;i<index-1;i++) {
				temp= temp.next;
			}
			t.next=temp.next;
			temp.next=t;
		}
		
		void insertEnd(int val) {
			Node temp=new Node( val);
			if(head==null) {
				head=temp;
				tail=temp;
			}
			else {
				tail.next = temp;
				tail=temp;			
				}
			
		}
		
		void insertBeg(int val) {
			Node temp = new Node(val);
			if(head==null) {
				insertEnd(val);
				
			}else {
				temp.next=head;
				head=temp;
				
			}
		}
		
		void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" -> ");
				temp=temp.next;
			}System.out.println("Null");
		}
		
		 int size() {
			 int count=0;
			 Node temp = head;
			 while(temp!=null) {
				 count++;
				 temp=temp.next;
			 }return count;
			
		}
	}
	
	
	public static void main(String args[]) {
		linkedList ll = new linkedList();
	//	ll.insertBeg(0);
		ll.insertEnd(1);ll.insertEnd(2);
		ll.display();
		System.out.println(ll.size());
		ll.insertEnd(3);
		ll.insertEnd(20);
		ll.display();
		ll.insertBeg(0);ll.display();
		ll.insertAt(4,10);ll.display();
		//ll.insertAt(0, 3232);ll.display();
		ll.insertAt(30, 77);
		System.out.println(ll.getAt(90));
		
	}
	
	

}
