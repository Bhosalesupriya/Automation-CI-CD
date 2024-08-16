package Testt;



//import org.testng.Assert;
import org.testng.annotations.Test;

public class thrid {

	
	  @Test  
	    public void test1()                      // First test case.  
	  {  
	    System.out.println("test1");   
	  }   
	  @Test(groups={"smoke"})  
	   public  void test2()                     // Second test case.  
	{  
	 System.out.println("test2");  
	// Assert.assertTrue(false);

}
}
