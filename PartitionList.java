
/**
 * A class to partition a linked list around
 * a pivot element (smaller on left and larger on right)
 * @author seemarohilla
 *
 */
public class PartitionList {
	
	private static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
		}
	}
	
	/**
	 * partitions the list around an element
	 * @param n(head)
	 * @param x(pivot)
	 */
	public static void listPartition(Node n , int x ){
	  Node head=n;
	  Node tail=n;
	  while(n!=null){
		  //preserving the next node 
		  Node next=n.next;
		  if(n.data<x){
			
			 //insert this node at the beginning
			  n.next=head;
			  head=n;
		  }
		  else{
			//insert at the end
			  tail.next=n;
			  tail=n;
		  }
		  n=next;
	  }
	  tail.next=null;
	  while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
	  
		
	}
	
	public static void main(String[] args) {
		Node n= new Node(3);
		Node n1=new Node(5);
		Node n2=new Node(8);
		Node n3=new Node(5);
		Node n4=new Node(10);
		Node n5=new Node(2);
		Node n6=new Node(1);
		n.next=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=null;
		listPartition(n, 5);
	}

}
