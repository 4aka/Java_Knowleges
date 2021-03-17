package J_TryCatch;

import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Try_Catch_Automation {

//	public String[] commandCmsInfo(String signInBase64, String data, String[] certPath)
//			throws InterruptedException, IOException {
//
//		WebElement element = driver.findElement(By.id("result"));
//		WebElement webStatus = driver.findElement(By.id("status"));
//		CMSInfo[] cmsInfo = null;
//		String[] status = null;
//		Thread.sleep(2000);
//		System.out.println(webStatus.getAttribute("value"));
//
//		// Set condition.
//		if (!webStatus.getAttribute("value").contains("error")) {
//			try {
//				// Do some code in "try" 
//				System.out.println("log in try");
//				JSONObject obj = new JSONObject(element.getAttribute("value"));
//				cmsInfo = new CMSInfo[1];
//				status = new String[1];
//				cmsInfo[0] = new CMSInfo(obj);
//				status[0] = cmsInfo[0].getSignatureStatus();
//				return status;
//			// Than do the second code in "Catch"
//			} catch (JSONException e) {
//				System.out.println("log in catch");
//				JSONArray info = new JSONArray(element.getAttribute("value"));
//				cmsInfo = new CMSInfo[info.length()];
//				status = new String[info.length()];
//				for (int i = 0; i < info.length(); i++) {
//					cmsInfo[i] = new CMSInfo(info.getJSONObject(i));
//					status[i] = cmsInfo[i].getSignatureStatus();
//				}
//				return status;
//			// do something finally	
//			} finally {
//				
//			}
//		}
//		return status;
//	}
}