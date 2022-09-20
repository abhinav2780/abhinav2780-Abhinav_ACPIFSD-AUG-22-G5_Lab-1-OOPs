package org.greatlearning.model;

import java.util.Scanner;

public class Test {
public static void main(String[]args) {
	Scanner sc =new Scanner(System.in);
	Employee e=new Employee("Harshit","Choudary");
	CredentialService credentialservice = new CredentialService();
	int ch;
	do
	{
		System.out.println("Please enter the department from following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.HumanResource");
		System.out.println("4.Legal");
		ch=sc.nextInt();
		String email;
		char[] password;
		switch (ch) {
		case 1:
			email=CredentialService.generateEmailAddress(e.getFirstName(), e.getLastName(), "tech");
		password=credentialservice.generatePassword();
		credentialservice.showCredentials(e, email, password);
		break;
		case 2:
			email=CredentialService.generateEmailAddress(e.getFirstName(), e.getLastName(), "Admin");
		 password=credentialservice.generatePassword();
		credentialservice.showCredentials(e, email, password);
		break;
		case 3:
			email=CredentialService.generateEmailAddress(e.getFirstName(), e.getLastName(), "HumanResource");
		 password=credentialservice.generatePassword();
		credentialservice.showCredentials(e, email, password);
		break;
		case 4:
			email=CredentialService.generateEmailAddress(e.getFirstName(), e.getLastName(), "Legal");
		 password=credentialservice.generatePassword();
		credentialservice.showCredentials(e, email, password);
		break;
		default:
		}
		if((ch > 4) || (ch < 0)) {
	        System.out.println("Error : Please enter a valid option");
		}
		ch=sc.nextInt();
	}
	while (ch<=4);  
	
	
}
}

