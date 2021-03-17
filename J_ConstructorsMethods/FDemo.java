package J_ConstructorsMethods;

public class FDemo {
	int x;
	
	// Constructor. wait to get int i.
	FDemo(int i) {
		x = i;
	}

	// This is special method for finalize objects.
	// It is deleting objects which are not needed.
	// syntax must be like this.
	protected void finalize() {
		System.out.println("Finalize" + x);
	}

	// OBJECT GENERATOR!
	// At first the object will create then delete object at once.
	// generator wait int i.
	void generator(int i) {
		FDemo o = new FDemo(i);
	}
}