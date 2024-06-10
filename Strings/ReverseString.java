
import java.util.Scanner;

public class ReverseString {
	
	    public static void main(String args[]) {
        // take input from user
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter any string");

        // call reveseWord method
	    	String s = reverseWord(sc.next());
	    	System.out.println("Reversed string= "+ s);
	    }
	    
	    public static String reverseWord(String str)
	    {
	    	// to extract an character from a string
	    	char ch;
        // to store the final reverse string
	    	String revString = "";
        // to traverse the string, extract the character one by one and add into the final string 
	    	for(int i=0; i<str.length(); i++) {
	    		ch = str.charAt(i);
	    		revString = ch + revString ;
	    	}
	    	
	    	return revString;
	    }
	

}
