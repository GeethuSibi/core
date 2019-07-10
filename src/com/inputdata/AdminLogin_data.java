package com.inputdata;

public class AdminLogin_data {
	
	// Valid login
	
	public static String url="http://ec2-3-120-132-181.eu-central-1.compute.amazonaws.com/#/signin";
	public static String username="coreadmin";
	public static String password="password";
	public static String expectedresult="http://ec2-3-120-132-181.eu-central-1.compute.amazonaws.com/#/core/home";
	
	// Invalid login
	public static String wrongusername="coreadmin1";
	public static String wrongpassword="worngpassword";
	public static String expectedresult_wrong="http://ec2-3-120-132-181.eu-central-1.compute.amazonaws.com/#/signin";
	
	
	

}
