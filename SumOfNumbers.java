
/**
 * Add 2 same length numbers represented as linked lists (digits reversed)
 * represent the sum in form of linked list in similar manner
 * @author seemarohilla
 *
 */
public class SumOfNumbers {
	
	private static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
		}
	}
	
public static void main(String[] args) {
	Node num1= new Node(9);
	Node num1_2=new Node(7);
	Node num1_3=new Node(8);
	num1.next=num1_2;
	num1_2.next=num1_3;
	num1_3.next=null;
	
	
	Node num2=new Node(6);
	Node num2_2= new Node(8);
	Node num2_3= new Node(5);
	num2.next=num2_2;
	num2_2.next=num2_3;
	num2_3.next=null;
	
	sumUp(num1,num2);
	
}
/**
 * Calculates the sum of two numbers
 * represented as linked list
 * @param n1 (number 1)
 * @param n2 (number 2)
 */
public static void sumUp(Node n1, Node n2){
	int sum=0;
	int carry=0;
	Node sumList=null;
	Node Head=null;
	
	while(n1!=null && n2!=null){
	
		sum=n1.data+n2.data+carry;
		carry=0;
		if(sum>9){
			int num1=sum%10;
			carry=(sum/10)%10;
			if(sumList==null){
				Node n= new Node(num1);
			    n.next=null;
			    sumList=n;
				Head=sumList;}
			else{
				Node n= new Node(num1);
				n.next=null;
				sumList.next=n;
				sumList=n;
			}
			
		}
		else{
			if(sumList==null){
				Node n= new Node(sum);
			    n.next=null;
			    sumList=n;
				
				Head=sumList;
			}
			else{
				Node n= new Node(sum);
				n.next=null;
				sumList.next=n;
				sumList=n;
			}
		}
		n1=n1.next;
		n2=n2.next;
		
	}
	
	if (carry!=0){
		Node n= new Node(carry);
		n.next=null;
		sumList.next=n;
	}
	while(Head!=null){
		System.out.println(Head.data);
		Head=Head.next;
	}
	
	
	
}

}
