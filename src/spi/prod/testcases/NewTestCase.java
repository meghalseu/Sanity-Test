package spi.prod.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import spi.logger.Log;
import spi.pom.Home_Page;
import spi.pom.Icons_Page;
import spi.pom.Iris_Page;
import spi.pom.Samples_Page;
import spi.utility.Wrapper;

public class NewTestCase extends TestCaseBase01{
 

@Test
  public void run02(){
	  
	 DOMConfigurator.configure("log4j.xml");
	  
	  Log.startTestCase("VerifyMenuLinks_01");
	  
	  Samples_Page SamplesPage = new Samples_Page(null);
	  SamplesPage.getSamplesPage();
	  
	  Log.info("Page Title : " + Wrapper.getTitle("Samples - SPI"));
	  Log.info("Page url : " + Wrapper.getURL());
	  	  	  
	  Icons_Page IconsPage = new Icons_Page(null);
	  IconsPage.getIconsPage();
	  	 	    
	  Log.info("Page Title : " + Wrapper.getTitle("Icons - SPI"));
	  Log.info("Page url : " + Wrapper.getURL());
	  
	  Iris_Page IrisPage = new Iris_Page(null);
	  IrisPage.getIrisPage();
	  
	  Log.info("Page Title : " + Wrapper.getTitle("Sources - SPI"));
	  Log.info("Page url : " + Wrapper.getURL());
	  
	  Home_Page homepage = new Home_Page(null);
	  homepage.getHomePage();
	  	  	  
	  Log.info("Page Title : " + Wrapper.getTitle("SPI"));
	  Log.info("Page url : " + Wrapper.getURL());
	  	  
	  Log.endTestCase("VerifyMenuLinks_01");
	  
  }
}
