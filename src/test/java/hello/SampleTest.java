package hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
	WebDriver driver;
	@Test
	public void mtest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
	}

}
