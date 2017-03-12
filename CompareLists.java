

public class CompareLists {
	
	int CompareList(Node headA, Node headB) {
		 if(headA==null && headB==null)
		        return 1;
	    if(headA==null || headB==null){
	        return 0;
	    }
	   
	    int res=0;
	    if((headA.data==headB.data) && (CompareList(headA.next,headB.next)==1)){
	        res=1;
	    }
	    return res;
	}

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
		
	
		n.next=n1;
		n1.next=n2;
		n2.next=null;
	
		Node m= new Node(1);
		Node m1=new Node(2);
		Node m2=new Node(3);
	
		m.next=m1;
		m1.next=m2;
		m2.next=null;
		
		int result= new CompareLists().CompareList(n,m);
		System.out.println(result);

	}

}
