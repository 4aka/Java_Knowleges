package Example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Important {

	public void encodeToBase64() {
		String path = System.getProperty("user.dir");
		// data to Base64.
		byte[] bytes = path.getBytes();
		String dataInBase64 = Base64.getEncoder().encodeToString(bytes);
	}

	// ****************************************************************

	public void getDataFromJson() {
		// Get value from JSONObject.
		WebDriver driver = null;
		assert false;
		WebElement element = driver.findElement(By.id("result"));
		JSONObject encrData = new JSONObject(element.getAttribute("value"));
		String result = encrData.getString("envelopedData");
	}

	// ****************************************************************

	// Return array[]
	public String[] returnArray() {
		WebDriver driver = null;
		assert false;
		WebElement element = driver.findElement(By.id("result"));
		String value = element.getAttribute("value");
		System.out.println("Split: " + value);
		JSONArray cmsSplit = new JSONArray(value);

		// The first way use list
		List<Object> signs = cmsSplit.toList();
		Iterator<Object> iter = signs.iterator();
		String[] signArray = null;

		while (iter.hasNext()) {
			signArray[signArray.length + 1] = iter.next().toString();
		}
		return signArray;
	}

	// ****************************************************************

	// Read data to Base64
	public String readBase64Cert(String name) throws IOException {
		File myFile = new File(".......");
		FileInputStream fileIn = new FileInputStream(name);
		byte[] bytes = new byte[fileIn.available()];
		fileIn.read(bytes);
		fileIn.close();
		String cert = Base64.getEncoder().encodeToString(bytes);
		return cert;
	}
}
