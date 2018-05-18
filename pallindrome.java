	import java.util.Scanner;

public class pallindrome {

	
	    public static void main(String[] args)
	    {
	        System.out.println("Enter string to reverse:");
	        
	        Scanner read = new Scanner(System.in);
	        String str = read.nextLine();
	        String reverse = "";
	        
	        System.out.println(str.length());
	        str = str.replace(" ", "");
	        for(int i = str.length()-1 ; i >= 0; i--)
	        {
	            
	        	reverse = reverse + str.charAt(i);
	        }
	        
	        System.out.println("Reversed string is:");
	        System.out.println(reverse);
	        if (str.equalsIgnoreCase(reverse))
	            System.out.println("string is pallindrome" );
	        else 
	            System.out.println(" string is not a pallindrome:");


	    }
	}


