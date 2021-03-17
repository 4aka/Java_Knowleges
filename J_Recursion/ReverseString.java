package J_Recursion;

public class ReverseString {

	/*
	 * reverse("Quora")
	 * (reverse("uora")) + "Q"
	 * ((reverse("ora")) + "u") + "Q"
	 * (((reverse("ra")) + "o") + "u") + "Q"
	 * ((((reverse("a")) + "r") + "o") + "u") + "Q"
	 * (((("a") + "r") + "o") + "u") + "Q"
	 * "arouQ"
	 */

	public String reverse(String str) {
		if ((str == null) || (str.length() <= 1))
			return str;
		// str.substring(1) -  
		// str.charAt(0) - 
		return reverse(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		String str = "abcdefghijklmnopqrstuvwxyz";
		System.out.print(obj.reverse(str));
	}
}