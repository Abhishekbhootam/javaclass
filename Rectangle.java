
public class Rectangle extends Measurements{

		Rectangle(double length, double breath) {
			super(length, breath,getSide());
			  
			}
		public static int addTwoNum(int d, int f) {
			
			int c=d+f;
			System.out.println("sum " +c);
				return c;
				
			}

		

		public static void main(String[] args) {
Rectangle R1=new Rectangle(5,6);
double areaofrectangle=length*breath;
System.out.println("area of rectangle " + areaofrectangle);
				 areaOfSquare(getSide());
addTwoNum(1,4);
		}

	}

