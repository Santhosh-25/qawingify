package qawingify;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		//launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launching the given URL
		driver.get("https://sakshingp.github.io/assignment/login.html");
		
		//Give inputs to get login
		//Note:- Any value of user name/password is valid to log in the application
		driver.findElement(By.id("username")).sendKeys("santhoshmahii25@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Sandy@123");
		
		//To test the check boxes
		WebElement m = driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[1]/label/input"));
	    m.click();
	    System.out.println("Check boxes are not working");
	    
	    //Login into the login page
		driver.findElement(By.id("log-in")).click();
		System.out.println("Login successfully");
		
		//Before sorting
		
		//WebElement first = driver.findElement(By.xpath("(//table)[1]//tbody//tr[2]//td[2]"));
		//System.out.println(first.getText());
		
		System.out.println("Before Sorting the Amount Column");
		List<WebElement> amount = driver.findElements(By.xpath("(//table)[1]//tbody//tr//td[5]"));
		
		for(int i=0;i<amount.size();i++)
		{
			System.out.println(amount.get(i).getText());
		}
		
		//Click Amount button to sort the datas 
		
		driver.findElement(By.id("amount")).click();
		
		//After Sorting
		System.out.println("After Sorting the Amount Column");
		List<WebElement> Aftersort = driver.findElements(By.xpath("(//table)[1]//tbody//tr//td[5]"));
		
		for(int i=0; i<Aftersort.size(); i++)
		{
			System.out.println(Aftersort.get(i).getText());
		}
		
		driver.quit();
		}

}
