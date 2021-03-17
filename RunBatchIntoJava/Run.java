package RunBatchIntoJava;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "deleteDriverProcess.bat");
		File dir = new File("D:/deleteDriverProcess");
		pb.directory(dir);
		pb.start();
	}
}
