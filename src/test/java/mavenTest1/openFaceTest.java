package mavenTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openFaceTest {
	 @Test
	    public void login()
	    {
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver= new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("fnkjafnjahf");
			driver.findElement(By.id("pass")).sendKeys("fnkjjahf");
			driver.findElement(By.name("login")).click();

	        //driver.close();
	    }


}
