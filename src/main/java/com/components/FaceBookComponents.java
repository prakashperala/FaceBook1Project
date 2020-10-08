package com.components;

import com.objectrepository.FaceBookLocaters;
import com.utility.BaseClass;

public class FaceBookComponents extends BaseClass {

	FaceBookLocaters loc = new FaceBookLocaters();
	public void OpenUrl() throws Exception {
		try {
			openBrowser("chrome");
			openURL(readData.testDataValue.get("AppURL"));
			readData.addStepDetails("OpenUrl", "Application should open the url", "successfully opened", "Pass", "Y");
		}catch(Exception e) {
			readData.addStepDetails("OpenUrl", "Application should open the url", "Unable to open the url","Fail" , "N");
			
		}
		
	}
	public void login() throws Exception {
		try {
			type(loc.username,readData.testDataValue.get("Username"));
			type(loc.password,readData.testDataValue.get("Password"));
			click(loc.submit);
			readData.addStepDetails("login", "Application should be logged in", "Successfully logged in", "Pass", "Y");
			
		}catch(Exception e) {
			readData.addStepDetails("login", "Application should be logged in", "unable to login", "Fail", "N");
		}
	}
	
	
	
}
