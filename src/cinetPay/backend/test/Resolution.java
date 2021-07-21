package cinetPay.backend.test;
import java.util.Arrays;

public class Resolution {

	public static void main(String[] args) {
	
		 String arr[] = {"Test", "CinetPay", "cela", "Pierre", "Cela", "Boris",
				 "CELA", "Probleme1" ,"C" ,"A" };
	  
	        System.out.println(nombreOccurenceUnMotDansTableau(arr, "cela"));
	        String word = "anticonstitutionnellement";
	        System.out.println(Arrays.toString(nombreOccurrenceDeChaqueCaratereDansUnMot(word)));
	}
	
	public static int nombreOccurenceUnMotDansTableau(String book[], String word)
	    {// Complexité O(n)
	        int res = 0;
	        for (int i=0; i<book.length; i++)
	            if (word.equalsIgnoreCase(book[i])) // ou simplement if (word.equals(book[i]))
	              res++;
	        return res;
	    }
	 
	public static String[] nombreOccurrenceDeChaqueCaratereDansUnMot(String word)
	    { // Complexité O(nlogn)
		 int occurence=0;
		 String arr[]=new String[word.length()];
		 for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			long count = word.chars().filter(ch -> ch == c).count();
			if(nombreOccurenceUnMotDansTableau(arr,c+""+count)==0) {
				arr[occurence]=c+""+count;
				occurence++;
			} 
	       }
	
		return Arrays.copyOf(arr, occurence);
	    }
}
