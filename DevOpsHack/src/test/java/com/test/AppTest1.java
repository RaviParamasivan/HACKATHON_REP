package com.test;
import static org.junit.Assert.*; 
import org.junit.Test;
public class AppTest1 {

	@Test
	public void getText(){
		// TODO Auto-generated method stub
		AppTest test = new AppTest();
		String x=test.getTest();
		assertNull(x);
	}

}
