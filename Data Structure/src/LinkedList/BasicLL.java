package LinkedList;

public class BasicLL {
	
	public static class  Node{
		int data;    //value
		Node next;   // address of next node
		Node(int data){
			this.data=data;
		}
	}
		
	
	public static int length(Node head) {
		int count=0;
		while(head!=null) {
			head=head.next;
			count++;
		}
		return count;
		
	}
	
	public static void displayRec(Node head) {
		if(head==null) {
			return;
		}

		//System.out.print(head.data+" ");     4 5 6 7 8 
		displayRec(head.next);
		System.out.print(head.data+" ");  //stack falldown rev order 8 7 6 5 4 
		
		
	}
	
  public static void display(Node head) {
	  Node temp=head;       //     
	  while(temp!=null) {
		  System.out.print(temp.data+" ");
		  temp=temp.next;

	  }
  }
   
	
	
		
	
	public static void main(String[] args) {
		Node a=new Node(4);
		Node b=new Node(5);
		Node c=new Node(6);
		Node d=new Node(7);
		Node e=new Node(8);
		Node f=new Node(9);
		//System.out.println(x.data);
		a.next=b;   //4 -> 5 6 7 8
		b.next=c;   //4 -> 5 -> 6 7 8
		c.next=d;   //4 -> 5 ->6 -> 7 8
	 	d.next=e;   //4 -> 5 ->6 ->7 -> 8
		e.next=f;
		//Node temp = a;
		//System.out.println(e.next);
//		for( int i=1;i<=5;i++) {
//			System.out.println(temp.data);
//			temp=temp.next  ;
//			
//		}
//		while(temp!=null) {
//			System.out.print(temp.data + " ");
//			temp=temp.next;
//		}
		display( a);   //only know the head node
		System.out.println();
		displayRec(a);
		System.out.println(length(a));
		
		
	}

}
