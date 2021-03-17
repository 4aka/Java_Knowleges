package J_Recursion;

public class Example {
	
	String reverse = "";
	
	public String reverseString(String str) {
		if (str.length() == 1)
			return str;
		else
			/*
			 * abcdefghijklmnopqrstuvwxyz = 26.
			 * reverse += charAt(26 - 1) + (substring(0, 26 - 1))
			 * 
			 */
			reverse += str.charAt(str.length() - 1)	+ reverseString(str.substring(0, str.length() - 1));
			return reverse;
	}
	
	public String reverseStringV2(String str) {
		if ((str == null) || (str.length() <= 1))
			return str;
		
		// str.substring(1) - (1)-begin index. or str.substring(0, 5) - создание подстроки с символа 0 по 5. 
		// str.charAt(0) - возвращает указанный символ строки.
		/*
		 * abcdefghijklmnopqrstuvwxyz
		 * b + a
		 * 
		 */
		return reverseStringV2(str.substring(1)) + str.charAt(0);
	}
	
	// String buffer + reverse. Просто и понятно. :)
	public String reverseMethod(String str) {
	       StringBuilder buffer = new StringBuilder("Example");
	       buffer.reverse();
	       return buffer.toString();
	       // elpmaxE
	} 

	public static void main(String[] args) {
		Example srr = new Example();
		Example obj = new Example();
		String str = "abcdefghijklmnopqrstuvwxyz";

//		srr.reverseString(str);
		obj.reverseStringV2(str);
	}
}
