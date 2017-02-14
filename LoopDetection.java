/**
 * Loop Detection in Singly Linked List
 * @author seemarohilla
 *
 */

public class LoopDetection {
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
		n3.next=n1;
		
		Node b=detectLoop(n);
		if(b!=null){
			System.out.println(b.data);
		}
		else 
			System.out.println("No collision");
		
	}
	/**
	 * Detect the loop and return the collision node
	 * @param head
	 * @return
	 */
	public static Node detectLoop(Node head){
		Node fast=head;
		Node slow=head;
		
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				//the fast and slow pointer meets 
				break;
			}
		}
		//check if no everything traversed
		//so no meeting point 
		if(fast==null || fast.next==null){
			return null;
		}
		//keep the slow to head and fast at the meeting point 
		// after k steps they will meet and that will tell the
		//position of the colliding node
       slow=head;
       while(slow!=fast){
    	   slow=slow.next;
    	   fast=fast.next;	   
       }
       //fast is at the  collision node
       return fast;
       
	}
}
