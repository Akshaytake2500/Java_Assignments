package com.app.tester;

import java.util.List;
import java.util.Scanner;

import com.app.core.Customer;
import com.app.exception.CustomerException;

public class Utils {
	public static void dispCustomer(List<Customer> displayCustomer) {
		for (Customer cust : displayCustomer) {
			System.out.println(cust);
		}
	}

//	public static Customer upPasswd(List<Customer> upPass){
//		Scanner sc=new Scanner(System.in);
//				System.out.println("Enter password: ");
//				String pass=sc.next();								
//				return new Customer(pass);
//			}

}
