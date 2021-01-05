package ngptest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LibraryUtils {

	public static WebElement waitforelement (WebDriver driver, WebElement webElement, int seconds)
	{
		WebDriverWait wait =new WebDriverWait(driver, seconds);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
		System.out.println("waiting for elementFunctions is called");
		return element;
		
	}
	
	

	public static WebElement waittocclick (WebDriver driver , WebElement webElement, int seconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
		return element;
	}

	
}
