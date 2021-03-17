package J_Arrays;

public class Array {

	public static void main(String[] args) {

		// Initialise
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int[] nums2 = { 0, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] nums3 = new int[20];
		int[] nums4;
		int[] nums5 = {};
		
		array(20);
	}
	
	public static int[] array(int quantity) {
		int[] testArray = new int[quantity];
		
		for (int i = 0; i < quantity; i++) {
			testArray[i] = i;
		}
		
		// Get result.
		for (int z = 1; z < 20; z++) {
			System.out.println(testArray[z]);
		}
		return testArray;
	}
}