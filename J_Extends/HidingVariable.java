package J_Extends;

public class HidingVariable extends Super {

	HidingVariable(double w, double h) {
		super(w, h);
	}
	
	// Super class has variable "double extend".
	// Extends class can hide this variable
	
	void test(double d) {
	double extend = d; // Hide variable from Super.extend
	
	// For changing value:
	super.extend = 10; // need to use super. in method body
	}
}