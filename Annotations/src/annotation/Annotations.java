package annotation;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {
	
	
	@BeforeSuite
	public void befores(){
		System.out.println("Before Suite : It will Start Before execution start");
	}
	
	@AfterSuite
	public void aftersuit(){
		System.out.println("After Suite: It will executes after all will terminates");
	}
	
	//It will executes top of all testcases
	@BeforeClass
	public void BrowserCompatability(){
		System.out.println("Before Class - Executes only once, before start execution");
	}
	
	//It will executes after execution of all testcases
	@AfterClass
	public void BrowserCompatabilityterminets()
	{
		System.out.println("After Class - Executes only once - After finishing all the test execution");
	}
	
	//It will executes each&every test method before starts
	@BeforeMethod 
	public void instalization()
	{
		System.out.println("BeforeMethod - Executes each test case before");
	}
	
	//It will executes each&every test method after it executes
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("AfterMethod - Executes each test case after");
	}
	
	@Test 
	public void signup()
	{
		System.out.println("In Signin Process");

	}
	
	@Test
	public void Enhancementcase(){
		System.out.println("Not yet Implemented");
		throw new SkipException("Enhancement Phase");
	}
	
	@Test 
	public void login()
	{
		System.out.println("In Login Process");
	}
	
	@Test 
	public void sigout()
	{
		System.out.println("In Signout Process");
	}
	
	
	

}
