package queues;

public class QueueImpl {
int size=100;
int rear =-1;
int front=0;
int[] arr =new int[size];

public void enqueue(int element){
	if(rear==size-1){
		System.out.println("Queue is full");
		
	}
	else{
		
		arr[++rear]=element;
	}
}

public int dequeue(){
	
	System.out.println("item dequed : ");
	return arr[++front];
}
public void dequeue1(){
	
	System.out.println("item dequed : "+arr[front]);
	for(int i=0;i<=rear;i++)
	{
		arr[i]=arr[i+1];
	
	}
	rear--;
	System.out.println("the new rear :"+rear);
	
}

	public void display(){
		for (int i=front;i<=rear;i++)
		System.out.println(arr[i]);
		
		
		
	}
	public static void main(String[] args) {
		QueueImpl impl=new QueueImpl();
		impl.enqueue(2);
		
		impl.enqueue(3);
		impl.enqueue(4);
		impl.enqueue(5);
		impl.enqueue(6);
		impl.display();
		
		impl.dequeue1();
		impl.display();
		impl.dequeue1();
		impl.dequeue1();
		impl.display();
	
	
	}
}
