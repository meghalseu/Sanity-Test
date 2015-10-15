package spi.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import spi.framework.GlobalConfig;


public class Iris_Page extends PageBase{

	public Iris_Page(WebDriver driver) {
		super(driver);
		
	}
	
	/*public Iris_Page() {
		this(GlobalConfig.currentdriver);
	}*/


	WebDriverWait wait = new WebDriverWait(driver, 15);
	

	public void getIrisPage() {
		WebElement irislink = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Iris")));
		irislink.click();
	}

}
