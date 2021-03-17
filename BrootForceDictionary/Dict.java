package BrootForceDictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Dict {
	
	// Set one path for all dictionaries there.
	static String path = "D:/dictionary.txt";
	static String[] months = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
	File dictionary = new File("D:/dictionary.txt");
	
	/**
	 * WiFi password contains 8 symbols minimum
	 * So we can't use passwords like 111970 or 1011970
	 * 
	 * If you want generate each dictionary inside different file use different path when method calls in Main.
	 */

	public static void main(String[] args) {
		
		dictionary(path);
		dictionary(path, true);  
		dictionary(path, "");	
	}

	/**
	 * 01011970 =>
	 * @param path
	 */
	public static void dictionary(String path) {
		String data = "";
		String dataToWrite;

		// Years from 1970 till 2020
		for (int j = 1970; j <= 2020; j++) {
			
			// Months from 01 Jan to 12 Dec
			for (int k = 0; k <= 11; k++) {
				
				// Day from 01 to 31
				for (int i = 1; i < 32; i++) {

					if (i <= 9) {
						data = "0" + i + months[k] + j;
					} else if (i >= 10) {
						data = i + months[k] + j;
					}
					try {
						FileOutputStream fout = new FileOutputStream(path, true);
						dataToWrite = data + "\n";
						fout.write(dataToWrite.getBytes());
						fout.close();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			}
		}
	}

	/**
	 * 01.01.1970 =>
	 * @param path
	 */
	public static void dictionary(String path, boolean dot) {
		String data = "";
		String dataToWrite;

		for (int j = 1970; j <= 2020; j++) {
			
			for (int k = 0; k <= 11; k++) {

				for (int i = 1; i < 32; i++) {

					if (i <= 9) {
						data = "0" + i + "." + months[k] + "." + j;
					} else if (i >= 10) {
						data = i + "." + months[k] + "." + j;
					}
					try {
						FileOutputStream fout = new FileOutputStream(path, true);
						dataToWrite = data + "\n";
						fout.write(dataToWrite.getBytes());
						fout.close();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			}
		}
	}

	/**
	 * 01-01-1970 =>
	 * @param path
	 * @param defis
	 */
	public static void dictionary(String path, String defis) {
		String data = "";
		String dataToWrite;

		for (int j = 1970; j <= 2020; j++) {
			
			for (int k = 0; k <= 11; k++) {

				for (int i = 1; i < 32; i++) {

						if (i <= 9) {
						data = "0" + i + "-" + months[k] + "-" + j;
					} else if (i >= 10) {
						data = i + "-" + months[k] + "-" + j;
					}
					try {
						FileOutputStream fout = new FileOutputStream(path, true);
						dataToWrite = data + "\n";
						fout.write(dataToWrite.getBytes());
						fout.close();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			}
		}
	}
}