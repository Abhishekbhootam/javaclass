import java.util.Scanner;

public class Method {
	
	public static int addTwoNum(int d, int f) {
		
	int c=d+f;
	System.out.println("sum " +c);
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a vaue" );
	int a=scan.nextInt();
	System.out.println("Enter b vaue" );
	int b=scan.nextInt();

	addTwoNum( a,  b);
	}

}
