package Testt;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sec {	
@BeforeClass
	
	public void beforclasss()
	{ 
		System.out.println("before executing any method in the class");
	}
 @Parameters({"URL", "APIKey/Username"})
     @Test
     public void CarLoan(String urlname, String key)
     {
          System.out.println("kiya");
          System.out.println(urlname);
           System.out.println(key);

     }
  
	@Test
	public void homeLoan()
	{
		System.out.println("dhulehome");
		
	}
	

	
	
	@Test(timeOut=4000)
	public void StuffLoan()
	{
		System.out.println("furnicher");
	
	}
	@Test(enabled = false)
	public void frezeLoan()
	{
		System.out.println("whirphol");
	
	}
	@Test(dependsOnMethods= {"StuffLoan"})
	public void laptopLoan()
	{
		System.out.println("HP");
	
	}
	}


