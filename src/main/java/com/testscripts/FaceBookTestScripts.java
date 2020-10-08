package com.testscripts;

import org.testng.annotations.Test;

import com.components.FaceBookComponents;
import com.utility.BaseClass;

public class FaceBookTestScripts extends BaseClass {
	
	FaceBookComponents components = new FaceBookComponents();
	
	@Test(description="FB Login")
	public void FbLogin() throws Exception {
		
		readData.readTestDataFile("C:\\Users\\hp\\OneDrive\\Desktop\\SeleniumWorkspace\\FacebookFunctionality\\TestData\\HMSTestData.xlsx", "6");
		components.OpenUrl();
		components.login();
	}

}
