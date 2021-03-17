package AUTOMATION;

import org.junit.Test;
import com.jacob.com.LibraryLoader;
import autoitx4java.AutoItX;
import java.io.File;

public class AutoIT_Some_example {

	@Test
	public void extensionInstallation() {
		File file = new File("lib", "jacob-1.17-x86.dll");
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());
		AutoItX x = new AutoItX();

		try {
			// need to slow selenium to allow page load adding a sleep timer
			Thread.sleep(1000);
			x.mouseClick("left", 140, 408, 1, 15);
			x.send("installer");
			// selenium.type("id=name", "installer");
			x.mouseClick("left", 140, 469, 1, 15);
			x.send("password");
			// selenium.type("id=password", "password");
			// selenium.click("Install");
			x.mouseClick("left", 222, 372, 1, 15);// this was added to make install bar to go away in Firefox.
			x.mouseClick("left", 150, 523, 1, 15);
		} catch (Exception e) {
			System.err.println("Exception Caught: " + e);
		}
	}
}
