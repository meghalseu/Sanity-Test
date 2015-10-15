package spi.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


import org.openqa.selenium.support.ui.WebDriverWait;

import spi.framework.GlobalConfig;

public class Home_Page extends PageBase {

	public Home_Page(WebDriver driver) {
		super(driver);
		
		
	}
	
	/*public Home_Page()
	{
		this(GlobalConfig.currentdriver);
	}*/
	
	
	
	public void getHomePage() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		WebElement spilink = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SPI")));
		spilink.click();
	}
}
