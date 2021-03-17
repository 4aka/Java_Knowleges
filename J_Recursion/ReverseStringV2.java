package J_Recursion;

public class ReverseStringV2 {

	String reverse = "";

	public String reverseString(String str) {
		if (str.length() == 1)
			return str;
		else
			reverse += str.charAt(str.length() - 1)	+ reverseString(str.substring(0, str.length() - 1));
			return reverse;
	}

	public static void main(String[] a) {
		ReverseStringV2 srr = new ReverseStringV2();
		System.out.println("Result: " + srr.reverseString("RecursiveReversal"));
	}
}
