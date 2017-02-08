
/**
 * Class to find the Kth element from the back in singly linked list
 * @author seemarohilla
 *
 */
public class KthToTheLast {
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
		Node Head=n;
		while(Head!=null){
			System.out.println(Head.data);
			Head=Head.next;
		}
		
		kthToLast( n,3);
	
		Node res =kthToLast1( n,new Index(),3);
	    System.out.println(res.data);
	    
		Node res1 =kthToLast2( n,3);
		System.out.println(res1.data);
	   
	}
	/**
	 *  Prints the kth to last element in a linked list
	 *  recursive solution
	 *  takes O(n) space
	 * @param n
	 * @param k
	 * @return the index of the element
	 */
	public static int kthToLast(Node n, int k){
		if(n==null)
			return 0;
		//recursion to reach at the end and then calculate the indexes from there
		int index=kthToLast(n.next,k)+1;
		if(index==k){
			System.out.println(n.data);
		}
		return index;
		
	}
	
	/**
	 *  Returning the kth to the last Node
	 *  recursive solution
	 *  takes O(n) space
	 * @param n
	 * @param k
	 * @return the index of the element
	 */
	public static Node kthToLast1(Node n,Index idx ,int k){
		if(n==null)
			return n;
		//recursion to reach at the end and then calculate the indexes from there
		Node node = kthToLast1(n.next,idx,k);
		idx.value=idx.value+1;
		if(idx.value==k){
			return n;
			
		}
		return node;
		
	}
	
	/**
	 *  Returning the kth element to the last Node
	 *  iterative solution
	 *  takes O(n) time and O(1) space
	 * @param n
	 * @param k
	 * @return the index of the element
	 */
	public static Node kthToLast2(Node n,int k){
		if(n==null)
			return n;
		Node faster=n;
		Node slower=n;
		//move the faster node ahead by K elements
		for(int i=0;i<k;i++){
			//out of bound
			if(faster==null){
				return null;
			}
			faster=faster.next;
			
		}
		//move both the nodes together while faster node doesn't reaches the end
		while(faster!=null){
			faster=faster.next;
			slower=slower.next;
		}
		//now the slower is at last - kth spot (kth from the last)
		return slower;
		
	}
	
	public  static class Index{
	public int value=0;
	}
	
	
	
}
