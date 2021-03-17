package J_ErrorMessage;

public class Main {

	public static void main(String[] args) {
		ErrorInfo err = new ErrorInfo();
		ErrorMessageClass e;
		
		e = err.getErrorInfo(2);
		System.out.println(e.msg + " level: " + e.severity);
		
		e = err.getErrorInfo(19);
		System.out.println(e.msg + " level: " + e.severity);
	}
}