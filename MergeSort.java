
public class MergeSort {

	public static void main(String[] args){
		int arr[]={4,1,3,2,8,6,7,5};
		mergeSort(arr);
	}
	public static void mergeSort(int arr[]){
		//because we need a temp array to merge
		//we pass this array from here
		int[] temp=new int[arr.length];
		mergeSort(arr,temp,0,arr.length-1);
		
	}
	
	public static void mergeSort(int[] arr, int[] temp, int leftStart,int rightEnd){
		//check if array has become out of order
		if(leftStart>=rightEnd)
			return;
		int mid=(leftStart+rightEnd)/2;
		//sort the left half of array recursively
		mergeSort(arr,temp,leftStart,mid);
		//sort the right half of array recursively
		mergeSort(arr,temp,mid+1,rightEnd);
		//merge the array
		merge(arr,temp,leftStart,rightEnd);
	}
	public static void merge(int[] arr,int[] temp,int leftStart, int rightEnd){
		//take a leftEnd (midpoint)
		int leftEnd= (rightEnd+leftStart)/2;
		//take the right start mid+1
		int rightStart= leftEnd+1;
		//we need a right pointer
		int right=rightStart;
		//we need a left pointer
		int left=leftStart;
		//and an index for temp array
		int index=leftStart;
		//size
		int size=rightEnd-leftStart+1;
		//traverse through array and sort
		while(left<=leftEnd && right<=rightEnd){
			if(arr[left]<arr[right]){
			temp[index]=arr[left];
			left++;
			}
			else{
				temp[index]=arr[right];
				right++;
			}
			index++;
		}
		
		//copy the remaining elements in left half
		System.arraycopy(arr, left, temp, index , leftEnd-left+1 );
		
		//copy the remaining elements in right half
		System.arraycopy(arr, right, temp, index , rightEnd-right+1 );
		
		//copy the entire array
		System.arraycopy(temp, leftStart, arr, leftStart , size );
		System.out.println("This iteration:");
		for (int i : arr){
			System.out.println(i);
		}
		
	}
}
