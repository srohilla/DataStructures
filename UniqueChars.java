import java.util.Hashtable;
import java.util.Map;

public class UniqueChars {
	public static void main(String[] args) {
		String str="basim";
		System.out.println("Is Unique :"+new UniqueChars().isUnique(str));
		System.out.println("Is Unique :"+new UniqueChars().isUnique2(str));
		System.out.println("Is Unique :"+new UniqueChars().isUnique3(str));
		
	}
	
	/**
	 * checking using hash table
	 * complexity O(n)
	 * @param str
	 * @return
	 */
	public boolean isUnique(String str){
		//if we need to ignore case sensitivity
		str=str.toLowerCase();
		Map<Character,Integer> ht= new Hashtable<Character,Integer>();
	   for(int i=0; i<str.length();i++){
		   if(ht.containsKey(str.charAt(i))){
		   return false;
		   }
		 
		   ht.put(str.charAt(i), 1);
		   
	   }
	   return true;
	}

	/**
	 * checking using boolean array 
	 * Complexity O(n)
	 * @param str
	 * @return
	 */
	public boolean isUnique2(String str){
		if(str.length()>128)
			return false;
		//if we need to ignore case sensitivity
		str=str.toLowerCase();
		
	   boolean[] arr= new boolean[128]; 
	   for(int i=0; i<str.length();i++){
		   if(arr[str.charAt(i)]){
		   return false;
		   }
		 
		   arr[str.charAt(i)]=true;
		   
	   }
	   return true;
	}
	
	/**
	 * checking using bit vector 
	 * Complexity O(n)
	 * @param str
	 * @return
	 */
	public boolean isUnique3(String str){
		
		//if we need to ignore case sensitivity
		str=str.toLowerCase();
		
	   int checker=0;
	   for(int i=0; i<str.length();i++){
		   //to hold bit representation of character (subtract a to keep the value less than 32)
		   int value= str.charAt(i)-'a';
		   //check if the result of & is greater than 0 
		   //i.e the bit in place is already set
		   //means character already exists 
		   if((checker & (1<<value))>0){
		   return false;
		   }
		 
		  checker=checker | (1<<value);
		   
	   }
	   return true;
	}
}
