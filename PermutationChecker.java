import java.util.Arrays;

public class PermutationChecker {
	
	public static void main(String[] args) {
		System.out.println(new PermutationChecker().checkPermutation("this is good","doog htis si"));
		System.out.println(new PermutationChecker().checkPermutation1("this is good","doog htis si"));
	}
	/**
	 * to check whether one string is permutation of other
	 * using sort method
	 * @param str1
	 * @param str2
	 * @return
	 */
    public boolean checkPermutation(String str1, String str2){
    	if(str1.length()!=str2.length())
    		return false;
    	 if((sort(str1)).equals(sort(str2))){
    		return true;
    	 }
    	return false;
    }
    public String sort(String str){
    	char[] arr= str.toCharArray();
    	Arrays.sort(arr);
    	return new String(arr);
    	
    }
    
    /**
	 * to check whether one string is permutation of other
	 * @param str1
	 * @param str2
	 * @return
	 */
    public boolean checkPermutation1(String str1, String str2){
    	if(str1.length()!=str2.length())
    		return false;
    	 int[] arr = new int[128];
    	 for(int i =0; i<str1.length();i++){
    		 arr[str1.charAt(i)]+=1;
    	 }
    	 for(int i=0; i<str2.length();i++){
    		 arr[str2.charAt(i)]-=1;
    		 if(arr[str2.charAt(i)]<0)
    			 return false;
    	 }
    	 return true;
    	 
    }
    
    
}
