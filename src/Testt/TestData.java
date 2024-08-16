package Testt;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestData {
	



	@Test(dataProvider= "getdata")
	public void Amozonlogin(String username, String password)
	{
	    System.out.println("amazon page login");
	    System.out.println(username);
	    System.out.println(password);
	}
	
	
	
	@DataProvider
	public Object[][] getdata()
	{
		// 1st combination - username password //good credit history 
		// 2nd combination - username  // No credit history 
		// 3rd fraud  credit history 
		 // so hear we are passing 3 differnt data for single Test case  row size is 3 and  column is 2 because username is 1 column and password is 2nd column 
		
		// multi dimensional object array 
		 Object[][]  data = new Object[3][2];
		  data [0][0] = "firstsetusername";
		  data [0][1] = "firstpassword";  //1st combination 
		  
		  data [1][0] = "secondsetusername";
		  data [1][1] = "secondpassword";
		  
		  data [2][0] = "thirdsetusername";
		  data [2][1] = "thirdpassword";
		  
		  return data;
	}
	
	
 
}
