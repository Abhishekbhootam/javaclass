
public class Measurements {
	static double length;
	static double breath;
	private static double side;

	final static double areaOfSquare(double side) {
	double area;
	area=side*side;
	System.out.println("Area Of Square  " +area);
	return area;
	
}
	Measurements(double length,double breath, double side ){
		this.length=length;
		this.breath=breath;
		this.setSide(side);
	
			
		}
	public static double getSide() {
		return side;
	}
	public static void setSide(double side) {
		Measurements.side = 4;
	}
	


}
