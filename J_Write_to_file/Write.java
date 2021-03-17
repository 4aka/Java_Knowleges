package J_Write_to_file;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Write {

	// set path to file
	public static String path = "";
	// data to stream in file
	public static String someData;
	public static String someData2;

	public static void main(String[] args) {

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		FileOutputStream signInFile;
		// create file array with file quantity.
		File[] fileName = new File[4];
		//
		String firstData = "Smth name: " + "\n" + "\n" + someData + "\n";
		String secondData = "Smth name: " + "\n" + "\n" + someData2;

		for (int i = 0; i < 4; i++) {
			fileName[i] = new File(path + ("name" + i));
			byte[] firstDataBuffer = firstData.getBytes();
			byte[] secondDataBuffer = secondData.getBytes();

			try {
				out.write(firstDataBuffer);
				Thread.sleep(500);
				out.write(secondDataBuffer);
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			try {
				signInFile = new FileOutputStream(fileName[i]);
				out.writeTo(signInFile);
				out.flush();
				out.reset();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void writeTestResultToFile(String filePath, String funcName, boolean result) {
		if (filePath == null || filePath.isEmpty()) {
			filePath = "D:/WebSignerAutoTests.report";
		}

		String dataToWrite = funcName + ":\t" + result + "\n";

		try {
            FileOutputStream fout = new FileOutputStream(filePath, true);
            fout.write(dataToWrite.getBytes());
            fout.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}