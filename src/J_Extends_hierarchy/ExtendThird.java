package J_Extends_hierarchy;

public class ExtendThird extends ExtendSecond {
	private final String color;
	
	ExtendThird(String c, String s, double w, double h) {
		super(s, w, h);
		
		color = c;
	}
	
	String getColor() {return color;}
	
	void showColor() {
		System.out.println("Color: " + color);
	}
}