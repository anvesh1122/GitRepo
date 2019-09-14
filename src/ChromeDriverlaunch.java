import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeDriverlaunch
{
public static void main(String[] args) throws InterruptedException, IOException
{
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\JavaPractise\\Drivers\\chromedriver.exe");
	
	RemoteWebDriver d = new ChromeDriver();
    d.manage().window().maximize();
	Thread.sleep(3000);
	d.get("http://www.gmail.com");
	d.findElementById("identifierId").sendKeys("chilakaraju.anvesh7799@gmail.com");
	d.findElementById("identifierNext").click();
	Thread.sleep(3000);
	
	WebElement pass=d.findElementByXPath("//input[@type='password']");
	pass.sendKeys("9618989578");
	Thread.sleep(4000);
	
	WebElement Show=d.findElementByXPath("//span[@class='Ce1Y1c']");
	Show.click();
	Thread.sleep(1000);
	
	d.findElementByClassName("CwaK9").click();
	Thread.sleep(3000);
	
	d.findElementByXPath("//span[@class='gb_Ba gbii']").click();	
	Thread.sleep(2000);
	
	d.findElementByXPath("//a[@id='gb_71']").click();
    Thread.sleep(2000);
    
    d.close();
}
}

/*File file=d.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file,new File("D:\\New folder\\JavaPractise\\ScreenShotsOFChromeDriverLaunch\\pic.jpeg"));

d.close();*/
	
	
	//d.findElementByClassName("CwaK9").click();
	//Thread.sleep(3000);
	
	/*WebElement compose=d.findElementByXPath("//div[@class='T-I J-J5-Ji T-I-KE L3']");
	compose.click();
	
	WebElement msg=d.findElementByXPath("//div[@id=':pl']");
	msg.sendKeys("anvesh475@gmail.com");
	
	WebElement subject=d.findElementByXPath("//input[@name='subjectbox']");
	subject.sendKeys("Hi buddy");
	
	WebElement okay=d.findElementByXPath("//div[@id=':pc']");
	okay.click();*/
	//d.close();
	/*d.findElementByXPath("//span[@class='gb_Ba gbii']").click();	
	Thread.sleep(3000);
	d.findElementByXPath("//a[@id='gb_71']").click();
    Thread.sleep(2000);
   d.close();
}
}*/
	//d.findElementByClassName("ZFr60d CeoRYc").click();
	//Thread.sleep(1000);
	
    //d.close();
	// d.findElement(By.xpath("(//span[@class='RveJvd snByac'])[1]")).click();
	//Thread.sleep(1200);
	/*d.findElement(By.cssSelector("div[id*='passwordNext']")).click();
	Thread.sleep(1000);
	d.findElement(By.linkText(" ")).click();
			//("//*[id=\"gb\"]")).click();
	Thread.sleep(3000);
	d.findElement(By.id("gb_71")).click();
	Thread.sleep(6000);
	d.close();*/








