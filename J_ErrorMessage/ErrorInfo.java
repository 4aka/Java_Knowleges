package J_ErrorMessage;

public class ErrorInfo {
	
	String[] msgs = {
			"Output error",
			"Input error",
			"Have no place on the disk",
			"Index out of bounds"
		};
	int[] howBad = {3, 3, 2 ,4 };
	
	ErrorMessageClass getErrorInfo(int i) {
		if(i > 0 & i < msgs.length)
			return new ErrorMessageClass(msgs[i], howBad[i]);
		else
			return new ErrorMessageClass("Unknown error code", 0);
	}

}
