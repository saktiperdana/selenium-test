package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EleveniaTest {
	
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://elevenia.co.id");
		driver.findElement(By.cssSelector(".btn-close")).click();
	    driver.findElement(By.id("AKCKwd")).click();
	    driver.findElement(By.id("AKCKwd")).sendKeys("komputer");
	    driver.findElement(By.cssSelector(".header-big .btn-search")).click();
	    driver.findElement(By.linkText("Produk terlaris")).click();
	    driver.findElement(By.cssSelector("#prod_28911164 img")).click();
	    driver.findElement(By.cssSelector(".amountArea:nth-child(2) .incre")).click();
	    driver.findElement(By.cssSelector(".amountArea:nth-child(2) .incre")).click();
	    driver.findElement(By.cssSelector(".btnL:nth-child(1)")).click();
	    driver.findElement(By.linkText("Ya")).click();
	    driver.findElement(By.linkText("Ubah Kurir")).click();
	    driver.switchTo().frame(4);
	    driver.findElement(By.linkText("Batal")).click();
	    driver.switchTo().defaultContent();
	    driver.findElement(By.linkText("Hapus")).click();
	    driver.findElement(By.id("chkDelPopY")).click();

	    driver.close();
	  }
	}
		
		
		



