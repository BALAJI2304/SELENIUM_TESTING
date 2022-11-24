package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/menu/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		
		//music element
		WebElement music=d.findElement(By.id("ui-id-9"));
        music.click();
        Thread.sleep(2000);
        
        //jazz element
        WebElement jazz=d.findElement(By.id("ui-id-13"));
        jazz.click();
        Thread.sleep(2000);
        
        //modern element
        WebElement modern=d.findElement(By.id("ui-id-16"));
        modern.click();
        Thread.sleep(2000);
        
        Actions act=new Actions(d);
        act.moveToElement(music).moveToElement(jazz).moveToElement(modern).build().perform();
        

	}

}
