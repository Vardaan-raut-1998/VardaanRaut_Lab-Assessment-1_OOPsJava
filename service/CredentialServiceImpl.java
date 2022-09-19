package com.greatlearning.service;

import java.util.Random;
import com.greatlearning.model.Employee;

public class CredentialServiceImpl implements CredentialService
{   
	public String  generatePassword()
	{
	String p="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
			  +"0123456789{/[()=!@#$%^&*<>?~]}";
	Random r=new Random();
	char[] pasw=new char[8];
	for(int i=0;i<8;++i)
	     {
	   pasw[i]=p.charAt(r.nextInt(p.length()));
	     }	
    // converting char[] to string to boycott unwanted steady password by char[]returns.
	String password=String.valueOf(pasw);
	return password;
	}
    public String generateEmailAddress(String firstname,String lastname,
			                             String department,String company)
	{
		// To make email proper  using ( toLowerCase method ).
	String s=firstname.toLowerCase()+lastname.toLowerCase()+"@"+department+"."+company+".com";
	 return s;
	}
    public void showCredentials(Employee employee,String email,String generatedPassword)
	{
	System.out.println("\nDear "+employee.getFirstName()+" "+employee.getLastName()
	                           +" ur generated credentials are as :\n");
	System.out.println("Generated Email is    :~  "+email);
	System.out.println("Generated Password is :~  "+generatedPassword);
	}
}
