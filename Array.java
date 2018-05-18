import java.util.Scanner;

public class Array {
	
	public static int getMin(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
				
		}
		System.out.println("min num is " + min);
return min;

		
	}
	public static int getMax(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
				
		}
		System.out.println("max num is " + max);
return max;
	
		
	}
	
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of array elements ");
		int n=scan.nextInt();
		int[] myarray= new int[n];
		for(int i=0;i<=myarray.length-1;i++)
		{
			System.out.println("Enter the " + (i+1) + " array elements ");
			myarray[i]=scan.nextInt();
			 }		
		
		int Diff = getMax(myarray)-getMin(myarray);
		System.out.println("differnce is " + Diff);}

}
