package jenkinproject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class jekinsdemo {
	public class BeforeAfterClass {
		WebDriver driver;
		@BeforeClass
		public  void openbrowser()
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
			
		}
		@Test(priority='1')
		public void GetTitle() throws InterruptedException
		{
	   
		
	    String title=driver.getTitle();
	    System.out.println(title);
	   
	    }
	@Test(priority='2')
	public void login() throws InterruptedException
	{
		driver.findElement(By.linkText("My Account")).click();
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("input-email")).sendKeys("vaishu.alwar@gmail.com");
	    Thread.sleep(1500);
	    driver.findElement(By.id("input-password")).sendKeys("Harrystyles_01&");
	    driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	   Thread.sleep(1500);
	  
	}
	@Test(priority='3')
	public void logout() throws InterruptedException
	{
		
	    driver.findElement(By.linkText("My Account")).click();
	    driver.findElement(By.linkText("Logout")).click();
	    Thread.sleep(1500);
	}
	@AfterClass
	    public void closebrowser()
	    {
	    	driver.close();

	    }

		}
		

}
