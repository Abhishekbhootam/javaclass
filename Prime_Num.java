import java.util.Scanner;

public class Prime_Num {
	
	static int n;
	static boolean isPrime=true;

		public static void main(String[] args) {

			
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter any number:");
			int num=scan.nextInt();
			for( int i=2;i<=num/2;i++)
			{
		           n=num%i;
			   if(n==0)
			   {
			      isPrime=false;
			      break;
			   }
			   		}
			
				if(isPrime)
			   System.out.println(num + " is prime");
			else
			   System.out.println(num + " is not a Prime Number");
				
				
		   }
		}

