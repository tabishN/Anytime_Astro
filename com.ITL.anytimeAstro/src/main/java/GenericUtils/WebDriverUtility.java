package GenericUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	  public void select(WebElement element, String text)
	    {
	    	Select sel = new Select(element);
	    	sel.selectByVisibleText(text);
	    }
		
	    /**
	     * this method will select a value from drop down based on index
	     * @param element
	     * @param index
	     */
	    public void select(WebElement element, int index)
	    {
	    	Select sel = new Select(element);
	    	sel.selectByIndex(index);
	    }
	    public void waitForPageToLoad(WebDriver driver) {
	    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    }
	    public void mouseOver(WebDriver driver, WebElement element) {
	    	Actions act= new Actions(driver);
	    }
	    public void rightClick(WebDriver driver, WebElement element) {
	    	Actions act = new Actions(driver);
	    }
	    public void maximiseWin(WebDriver driver) {
	    	driver.manage().window().maximize();
	    }
	    public void waitForElementToBeVisible(WebDriver driver, WebElement element)
	    {
	    	WebDriverWait wait = new WebDriverWait(driver, 20);
	        wait.until(ExpectedConditions.visibilityOf(element));
	       
	    }
	    public void waitForElementToBeClickable(WebElement element, WebDriver driver) {
	    	WebDriverWait wait = new WebDriverWait(driver, 20);
	    	 wait.until(ExpectedConditions.elementToBeClickable(element));
	    }
	    public void alertSwitch(WebDriver driver) {
	    	driver.switchTo().alert();
	    }
	    public void handlingWindows(WebDriver driver) {
	    	driver.getWindowHandle();
	    	
	    }
	    public void handlingFrames(WebDriver driver) {
	    	driver.switchTo().frame(0);
	    }
	    
	    

		 

	    
	    
	    
	    
	    
	  
}
