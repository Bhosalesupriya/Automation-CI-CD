package Testt;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class frist {
	
	@BeforeClass
	
	public void beforclass()
	{ 
		System.out.println("before executing any method in the class");
	}
	
@Parameters({"URL"})
	@Test(groups={"smoke"})
	public void firstname(String urlname)
	{
		System.out.println("supriya");
		System.out.println("the url is:");
		System.out.println(urlname);

	}
	
	@Test
	public void lastname()
	{
		System.out.println("bhosale");
	
	}

}
