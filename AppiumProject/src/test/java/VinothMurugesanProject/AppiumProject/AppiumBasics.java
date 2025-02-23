package VinothMurugesanProject.AppiumProject;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import org.testng.annotations.Test;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.android.AndroidDriver;

public class AppiumBasics {
	@Test
	public void AppiumTest() throws URISyntaxException, MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("VinothAndroid"); //emulator
		options.setApp("C:\\Users\\Vinoth\\workspace\\AppiumProject\\src\\test\\java\\resourses\\ApiDemos-debug.apk");
		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		
	}

}
