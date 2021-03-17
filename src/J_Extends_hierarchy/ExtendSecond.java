package J_Extends_hierarchy;

public class ExtendSecond extends SuperFirst {
	private final String style;
	
	ExtendSecond() {
		super();
		style = "none";
	}
	
	ExtendSecond(String s, double w, double h) {
		super(w, h);
		
		style = s;
	}

	ExtendSecond(double x) {
		super(x);
		
		style = "full";
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle: " + style);
	}
}