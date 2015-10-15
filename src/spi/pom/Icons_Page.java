package spi.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


import org.openqa.selenium.support.ui.WebDriverWait;

import spi.framework.GlobalConfig;

public class Icons_Page extends PageBase {

	public Icons_Page(WebDriver driver) {
		super(driver);
		
	}
	
	/*public Icons_Page(){
		
		this(GlobalConfig.currentdriver);
	}*/

			
	public void getIconsPage() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement iconlink = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Icons")));
		iconlink.click();
		
	}
	
}
