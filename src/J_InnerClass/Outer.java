package J_InnerClass;

public class Outer {
	int[] nums;

	// Outer constructor
	Outer(int[] n) {
		nums = n;
	}

	// Outer method
	void analyze() {
		Inner inOb = new Inner();

		System.out.println("Minimum: " + inOb.min());
		System.out.println("Maximum: " + inOb.max());
		System.out.println("Average: " + inOb.avg());
	}
	
	// Inner class
	class Inner {

		// Inner method
		int min() {
			int m = nums[0];
			
			for(int i = 1; i < nums.length; i++)
				if(nums[i] < m) m = nums[i];
			return m;
		}

		// Inner method
		int max() {
			int m = nums[0];
			
			for(int i = 1; i < nums.length; i++)
				if(nums[i] > m) m = nums[i];
			return m;
		}

		// Inner method
		int avg() {
			int a = 0;
			for(int i = 1; i < nums.length; i++)
				a += nums[i];
			return (a / nums.length);
		}
	}
}
