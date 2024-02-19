package LinkedList;

public class ImpliLL {
	
	
	static class Node{
		 int data;
		Node next;
		
		
		Node(int data){
			this.data=data;
		}
	}
	
	 static class LinkedList{
		 int count=0;
		Node head=null;
		Node tail=null;
		
//		public Node nthNodeFromEnd(Node head,int n) {
//			
//			
//		}
	
		void deleteNode(Node a) {
			if(a==head) {
				head=head.next;
				count--;
				return;
			}
			else {
				a.data=a.next.data;
				a.next = a.next.next;
				count--;
			}
		
		}
		
		void reverse() {
			Node pre = null;
			Node curr= head;
			Node nxt =null;
			while(curr!=null || nxt!=null) {
				nxt=curr.next;
				curr.next=pre;
				pre=curr;
				curr=nxt;
			}
		while(pre!=null) {
			System.out.print(pre.data+"->");
			pre=pre.next;
		}
			
			
		}
		
		void insertAt(int index,int val){
			Node t = new Node(val);
			//count++;
			Node temp=head;
			if(index==size(count)) {
				insertEnd(val);return;
				
			}
			else if(index==0) {
				insertBeg(val);return;
			}
			else if(index<0 || index>size(count)) {
				System.out.println("Nost possible");return;
			}
			
			for(int i=0;i<=index-1;i++) {
				temp=temp.next;
			}
			temp.next=temp.next;
			temp.next=t;
		}
		
		
		public void insertEnd(int val) {
			Node temp = new Node(val);
			//count++;
			if(head==null) {
				head=temp;
				
			}
			
			else {
				tail.next=temp;
				

			}
			tail=temp;
		}
		public void insertBeg(int val) {
			Node temp = new Node(val);
			//count++;
			if(head==null) {
			insertEnd(val);	
			}
			else {	
				
			temp.next = head;
				head=temp;
			}
			
		}
		
		public int size(int count) 
		{
			 
		Node temp = head;
		while(temp!=null)
		{	
		temp=temp.next;
		count++;
		}
		return count;
		}
		
		
		void display() {
			Node temp=head;
			if(temp==null) {
				System.out.println("empty");
			}
			else {
				
				while(temp!=null) {
					System.out.print(temp.data+"->");
					
					temp=temp.next;
				}
				System.out.println();
				//System.out.println(count);
			}
			System.out.println("Total node "+size(count));
		}
	}
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		System.out.println("linkedList");
		
		ll.insertBeg(1);ll.display();
		ll.insertBeg(0);ll.display();
		ll.insertBeg(4);ll.display();
		ll.insertEnd(10);
		ll.display();
		ll.insertEnd(3);
		ll.display();
	//	ll.insertAt(0, 2);ll.display();
		//System.out.println("count is " +ll.size());;
		ll.insertAt(5, 55);ll.display();
		//System.out.println("Total node = "+size());
		ll.reverse();
		ll.insertEnd(50);
		ll.display();
		//ll.deleteNode(Node 10);
	//	ll.findNthNodeFromLast(head,2);     // only head is given
		
	}

}
