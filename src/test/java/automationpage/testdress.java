package automationpage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testdress {
	mystorepageobject ms= new mystorepageobject();
	dresspage dp= new dresspage();
	
	
	@Test
	public void dispalycount(){
		boolean test;
		if(dp.count()==dp.num()){
			test=true;
		}
		else{
			test=false;
		}
		
		Assert.assertTrue(test);
	}
	


}
