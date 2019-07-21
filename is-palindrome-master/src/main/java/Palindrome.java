public class Palindrome {
    public boolean check(String sentence) {
    	String[] strings=sentence.split(" ");
    	String compressedsentence="";
    	for(int i=0;i<strings.length;i++){
    		compressedsentence+=strings[i];
    	}
    	compressedsentence=compressedsentence.toLowerCase();
    	int n=compressedsentence.length();
    	for (int i=0;i<n/2;i++ ) {
    		if(compressedsentence.charAt(i)!=compressedsentence.charAt(n-i-1)){
    			return false;
    		}
    		
    	}
        return true;
    }
}
