package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtoWishList {
	
	private WebDriver driver;
	int n=3;
	//Locators
	
	
	public AddtoWishList(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void addtoWishList()
	{
		for(int i=0;i<n;i++)
		{
	  driver.findElement(By.xpath("//*[@class='yith-wcwl-add-button']//i[@class='yith-wcwl-icon fa fa-heart-o')[i]'")).click();
		}
	}
	
	
	

}
