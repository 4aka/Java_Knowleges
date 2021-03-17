package J_Extends;

public class Super {

	double extend;
	private double width;
	private double height;

	// Super class constructor.
	Super(double w, double h) {
		width = w;
		height = h;
	}
	
	Super(double w, double h, double x) {
		x = w * h;
		width = w;
		height = h;
	}

	// Methods for changing values PRIVATE variable. 
	double getWidth() {return width;};
	double getHeight() {return height;};
	void setWidth(double w) {width = w;};
	void setHeight(double h) {height = h;};
	
	void showDim() {
		System.out.println("Width & Height: " + width + height);
	}
}