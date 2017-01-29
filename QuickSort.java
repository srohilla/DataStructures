
public class QuickSort {
	public static void main(String[] args) {
		int[] arr={7,2,9,1,10,4,5};
		quickSort(arr);
	}
    public static void quickSort(int[] arr){
    	//now call the recursive function
    	quickSort(arr,0,arr.length-1);
    	
    }
    //method to recursively sort the array
    public static void quickSort(int[] arr, int left, int right){
    //cut off condition
    	if(left>=right){
    		
    		return ;
    	}
    	//determine the pivot element
    	int pivot=arr[(left+right)/2];
    	//partition the array into two halves and swap
    	int index=partition(arr,left,right,pivot);
    	//do quickSort on left half and right halves
    	quickSort(arr,left,index-1);
    	quickSort(arr,index,right);
    	System.out.println("After this round");
    	for(int i : arr){
		System.out.println(i);
	} 
    	
    }
    //partition the array and sort around pivot
    public static int partition(int[] arr, int left, int right,int pivot){
    	while(left<=right){
    		while(arr[left]<pivot){
    			//moving outwards
    			left++;
    			
    			
    		}
    		while(arr[right]>pivot){
    			//moving inwards  
    			right--;
    		}
    		if(left<=right){
    			//swap the out of order elements
    			int temp=arr[left];
    			arr[left]=arr[right];
    			arr[right]=temp;
    			left++;
    			right--;
    			
    		}
    	}
    	//return the partition point 
    	return left;
    }
    
}
