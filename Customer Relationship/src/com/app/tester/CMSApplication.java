package com.app.tester;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.app.core.Customer;
import com.app.customer_utils.Customer_Validations;

public class CMSApplication {

	public static void main(String[] args) {

		// init phase
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;

			// init D.S
			List<Customer> customerList = new ArrayList<>(); // size=0,capacity=10
			
			while (!exit) {
				System.out.println("Options: 1. Customer SignUp 2.Display 3.Login 4.Update Password 5.Remove Subsription 0.Exit");
				System.out.println("Choose: ");
				try {
					switch (sc.nextInt()) {
					case 1: // register new customer
						System.out.println("Enter customer details: ");
						System.out.println("firstName, lastName, email, password, regAmount, dob, plan");
						Customer customer = Customer_Validations.validateCustomerInputs(sc.next(), sc.next(), sc.next(),
								sc.next(), sc.nextDouble(), sc.next(), sc.next(), customerList);

						// =>all i/ps are valid
						customerList.add(customer);
						System.out.println("customer registered....");
						System.out.println();
						break;
					case 2:
						System.out.println("Customer details are: ");

						Utils.dispCustomer(customerList);
						System.out.println("Printed successfully...");
						System.out.println();
						break;
					case 3:
						System.out.println("Enter mail and passwd: ");
						Customer signIn = Customer_Validations.authenticate(sc.next(), sc.next(), customerList);
						System.out.println("Login Success..." + signIn);

						System.out.println();
						break;
					case 4:
						System.out.println("Enter Email OldPassword NewPassword ");
					    Customer_Validations.passUpdate(sc.next(), sc.next(), sc.next(), customerList);
					    System.out.println();
						
						break;
					case 5:
						
						System.out.println("Enter email to un subscribe: ");
						
						break;
					default:
						System.out.println("-----Exiting-----");
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
