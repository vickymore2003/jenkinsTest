import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class RunnerClass {
	
	WebDriver driver;
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	
  @Test
  public void f() {  
	  driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      System.out.println("Running f function");
      System.out.println("Updated by sahil");
      System.out.println("Updated by sahil1");
	  System.out.println("Updated by sahil2124");
	  System.out.println("Updated by sahil3457478");
  }
	
  @BeforeMethod
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
	  driver = new ChromeDriver();
	  System.out.println("launching firefox browser");
	  System.out.println("Running f function");
  }

  @AfterMethod
  public void closeBrowser() {
	  driver.close();
  }

}
