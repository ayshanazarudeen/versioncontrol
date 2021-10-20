package sel1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;  
import org.openqa.selenium.support.ui.Select;  
import org.openqa.selenium.WebElement; 
public class testwebsite {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D://Software//SEL_JAR-20210901T092836Z-001//SEL_JAR//chromedriver_win32//chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();  
		capabilities.setCapability("marionette",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		 String sampleText = driver.findElement(By.className("info")).getText(); 
	     System.out.println(sampleText);  
	          
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		String sum= driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[3]/td[4]")).getText();
		System.out.println("No.of family album sold in Canada is:"+sum);
		List rows=driver.findElements(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody"));
		System.out.println("No. of rows are" + rows.size());
		int a =0;
		for(int i=3;i<rows.size();i++)
		{
			String txt1= driver.findElement(By.xpath("//*[@id='ct100_MainContent_orderGrid']/tbody/tr["+(i)+"]/td[3]")).getText();
			String txt2= driver.findElement(By.xpath("//*[@id='ct100_MainContent_orderGrid']/tbody/tr["+(i)+"]/td[10]")).getText();
			if(txt1.equalsIgnoreCase("mymoney") && txt2.equalsIgnoreCase("mastercard"))
			{
				a+=1;
			}
		}
		System.out.print("The expected count is:"+a);
			
		
		driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();
		driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();
		driver.findElement(By.id("ctl00_MainContent_orderLInk")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.id("ctl00_MainContent_btnUncheckAll")).click();
		driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector")).click();
		driver.findElement(By.id("ctl00_MainContent_btnUncheckAll")).click();
		 String sample = driver.findElement(By.tagName("h2")).getText(); 
	     System.out.println(sample); 
		
		
	
		driver.findElement(By.linkText("View all products")).click();
		driver.findElement(By.partialLinkText("Order")).click();
		
		Select dropdown = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));  
	    dropdown.selectByVisibleText("FamilyAlbum");  
	    dropdown.selectByValue("FamilyAlbum");
	    dropdown.selectByIndex(0);
	  
	    driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("1000");
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).sendKeys("80");//id
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[1]/li[5]/input[2]")).click();//xpath
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("Alan Francis Cheeramvelil");//name
		   driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("ABC");

		   driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("kottayam");
		   driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Kerala");
		   driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("686543");
		   driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
		   driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("123456789012");
		   driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("01/99");
		   driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/div/a")).click();
		   Select drop = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));  
		    drop.selectByVisibleText("ScreenSaver");  
		    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("1000");
		    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).sendKeys("80");
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
			   driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Alan");
			   driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("Alappey");
			   driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("ANC");
			   driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Kerala");
			   driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("689574");
			   driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
			   driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("123456789012");
			   driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("01/99");
		   driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/div/input")).click();
		  
		
		driver.close();
	}

}




