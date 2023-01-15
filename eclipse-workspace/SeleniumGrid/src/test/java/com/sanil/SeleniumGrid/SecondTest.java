package com.sanil.SeleniumGrid;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sanil.SeleniumGrid.TestBase;

public class SecondTest extends TestBase {

	 @Test
	    public void GOOGLE6() {
	        System.out.println("Google6 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
	        getDriver().navigate().to("http://www.google.com");
	        System.out.println("Google6 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
	        Assert.assertEquals(getDriver().getTitle(), "Google");
	        System.out.println("Google6 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
	    }

	    @Test
	    public void GOOGLE7() {
	        System.out.println("Google7 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
	        getDriver().navigate().to("http://www.google.com");
	        System.out.println("Google7 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
	        Assert.assertEquals(getDriver().getTitle(), "Google");
	        System.out.println("Google7 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
	    }

	    @Test
	    public void GOOGLE8() {
	        System.out.println("Google8 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
	        getDriver().navigate().to("http://www.google.com");
	        System.out.println("Google8 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
	        Assert.assertEquals(getDriver().getTitle(), "Google");
	        System.out.println("Google8 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
	    }

	    @Test
	    public void GOOGLE9() {
	        System.out.println("Google9 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
	        getDriver().navigate().to("http://www.google.com");
	        System.out.println("Google9 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
	        Assert.assertEquals(getDriver().getTitle(), "Google");
	        System.out.println("Google9 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
	    }
	    
	    @Test
	    public void GOOGLE10() {
	        System.out.println("Google10 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
	        getDriver().navigate().to("http://www.google.com");
	        System.out.println("Google10 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
	        Assert.assertEquals(getDriver().getTitle(), "Google");
	        System.out.println("Google10 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
	    }

}
