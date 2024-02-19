package LinkedList;

public class Qusetions {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

	}

	static Node  nthNodeFromEnd(Node head, int n) {
		int size = 0;
		Node temp = head;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		temp = head;
		int m = size - n + 1;
		for (int i = 1; i <= m - 1; i++) {
			temp = temp.next;
		}
		return temp;

	}

	static Node nthNodeFromEnd2(Node head, int n) {
		Node slow = head;
		Node fast = head;
		for (int i = 1; i <= n; i++) {
			fast = fast.next;
		}
		while (fast != null) {

			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
	
	public static Node deleteNthNodeFromEnd(Node head,int n) {
		Node slow = head;
		Node fast = head;
		
		for(int i=1;i<=n;i++) {
			fast=fast.next;
		}
		
		if(fast==null) {
			head=head.next;
			return head;
		}
		while(fast.next!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		slow.next=slow.next.next;
		return head;
	}

	public static void display(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		Node a = new Node(100);
		Node b = new Node(1);
		Node c = new Node(55);
		Node d = new Node(87);
		Node e = new Node(25);
		Node f = new Node(12);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;

		// 100 1 55 87 25 12

		Node t = nthNodeFromEnd(a, 2);

		System.out.println(t.data);

		Node q = nthNodeFromEnd2(a, 2);
		System.out.println(q.data);
		display(a);
		
		a= deleteNthNodeFromEnd(a, 6);
		display(a);
		
		
	}

}
