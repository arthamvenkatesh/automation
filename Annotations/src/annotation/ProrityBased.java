package annotation;

import org.testng.annotations.Test;

public class ProrityBased {
	
	@Test (priority=0)
	public void signup()
	{
		System.out.println("In Signin Process - Prority Based");
		
	}
	
	@Test (priority=1)
	public void login()
	{
		System.out.println("In Login Process - Prority Based");
	}
	
	@Test (priority=2)
	public void sigout()
	{
		System.out.println("In Signout Process - Prority Based");
	}


}
