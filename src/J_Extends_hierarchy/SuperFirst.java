package J_Extends_hierarchy;

public class SuperFirst {
	private double width;
	private double height;
	
	// Constructor
	SuperFirst() {
		width = height = 0.0;
	}
	
	// Constructor
	SuperFirst(double w, double h) {
		width = w; 
		height = h;
	}
	
	// Constructor
	SuperFirst(double x) {
		width = height = x;
	}

	double getWidth() {return width;};
	double getHeight() {return height;};
	void setWidth(double w) {width = w;};
	void setHeight(double h) {height = h;};
	
	void showDim() {
		System.out.println("Width & Height: " + width + height);
	}
}