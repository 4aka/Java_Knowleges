package J_AccesPrivateClass;

public class Acces {
	
	private int alpha; // private
	public int beta;   // public
	int gamma;		   // default public
	
	void setAlpha(int a) { // set value to alpha in private variable.
		alpha = a;
	}

	int getAlpha() { // get alpha value. 
		return alpha;
	}
}
