package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewWishList {
	
	private WebDriver driver;
	
	
	public ViewWishList(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String viewList()
	{
	
	 driver.findElement(By.xpath("(//*[@class='header-wishlist']/a[@title='Wishlist']/i[@class='lar la-heart'])[1]")).click();
	String name=driver.findElement(By.xpath("//*[@class='single-head page-head no-thumbnail']/h1")).getText();
	
	return name;
	}
	
	
	



}
