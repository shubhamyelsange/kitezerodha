package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {//how to open browser without upcasting
public static void main(String[] args) {
	//WebDriver dr = WebDriverManager.chromedriver().create();//crete()mule chlu houn band hote lagech url
	 WebDriverManager.chromedriver().setup();//setup()mule run hoto prgm
	 WebDriver dr=new ChromeDriver();
	dr.get("https://www.google.com/");
	System.out.println("shubham");
	
}
}
