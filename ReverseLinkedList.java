

public class ReverseLinkedList {
	private static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
		}
	}
	public static void main(String[] args) {
		Node n= new Node(1);
		Node n1=new Node(2);
		Node n2=new Node(3);
		Node n3=new Node(4);
		n.next=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=null;
		Node res=new ReverseLinkedList().reverse(n,null);
	}

	public Node reverse(Node head, Node previous){
		if(head.next==null){
			head.next=previous;
			return head;
		}
		Node n= reverse(head.next,head);
	
		head.next=previous;
		
		return n;
	}
}
