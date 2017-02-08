import java.util.HashSet;
import java.util.Set;

public class LinkedDups {
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
	Node n2=new Node(1);
	Node n3=new Node(4);
	n.next=n1;
	n1.next=n2;
	n2.next=n3;
	n3.next=null;
	Node Head=n;
	while(Head!=null){
		System.out.println(Head.data);
		Head=Head.next;
	}
    
	removeDups1(n);
	removeDups2(n);
   
}
/**
 * method to remove duplicated node from unsorted linked list 
 * with additional datastructure
 * @param Head
 */
public static void removeDups1(Node Head){
	Node head=Head;
	//to hold the previous node
	Node previous=null;
	Set<Integer> s= new HashSet<Integer>();
	
	while(head!=null){
		if(s.contains(head.data)){
			//now new previous will be the element after skipping
			previous.next=head.next;
			
		}
		else{
			//add the current node data
			s.add(head.data);
			//make the current node as previous node
			previous=head;

			
		}
		head=head.next;
	}
	while(Head!=null){
		System.out.println(Head.data);
		Head=Head.next;
	}
	
}

/**
 * method to remove duplicated node from unsorted linked list 
 * without additional datastructure
 * Runners Technique
 * @param Head
 */
public static void removeDups2(Node head){
	if(head==null){
		return ;
	}
	Node current=head;
	while(current!=null){
		Node runner = current;
	while(runner.next!=null)	{
		if(current.data==runner.next.data){
			//if the next nodes holds same data then point to next of next
			runner.next=runner.next.next;
		   	
		}
		else{
			
			runner=runner.next;	
			
		}
			
	}
	current=current.next;
	}
	while(head!=null){
		System.out.println(head.data);
		head=head.next;
	}
	
}


}
