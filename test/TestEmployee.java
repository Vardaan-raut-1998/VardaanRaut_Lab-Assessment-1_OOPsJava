package com.greatlearning.test;

import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;
import com.greatlearning.service.CredentialServiceImpl;

public class TestEmployee 
{
	public static void main(String[] args) 
	{
    // Hard coded parameters of constructor since object is recognized by name:
	Employee employee=new Employee("Vardaan","Raut");
	CredentialService cs=new CredentialServiceImpl();
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter Company of Employee hired :");
    String company=sc.nextLine();
    System.out.println("Please select the department from the Following :");
    System.out.println("1. Technical dept");
    System.out.println("2. Admin dept");
    System.out.println("3. Human resourse dept");
    System.out.println("4. legal dept");
  
   int option=sc.nextInt(); 
   String department=null ; 
   switch(option)
        {
   case 1: department="tech";
           break;
   case 2: department="admin";
           break;
   case 3: department="Hr";
           break;
   case 4: department="leg";
           break;
   default :{ System.out.println("It is assured to opt 1,2,3 & 4 only :");
	          System.out.println("Retry");
              System.exit(-1); }
        }  
   
  String generatedPassword=(cs.generatePassword());
  String generatedEmail=cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(),department,company);
  // Showing credentials 
  cs.showCredentials(employee, generatedEmail, generatedPassword);
  // Closing input stream 
  sc.close(); 
}
}