package com.app.customer_utils;

import java.time.LocalDate;
import java.util.List;

import com.app.core.Customer;
import com.app.core.ServicePlan;
import com.app.exception.CustomerException;
import com.app.tester.Utils;

public class Customer_Validations {

	// add method to check duplicate email or not(by email)
	public static void checkDuplicate(String email, List<Customer> customerList) throws CustomerException {

		// 1.Create customer class instance wrapping pk
		Customer newCust = new Customer(email);
		if (customerList.contains(newCust))
			throw new CustomerException("Duplicate email");
	}

	// add a method to parse n validate plan n it's charges
	public static ServicePlan parseAndValidatePlanAndCharges(String plan, double regAmount) throws CustomerException {

		// 1.parse String(plan) --> enum
		ServicePlan servicePlan = ServicePlan.valueOf(plan.toUpperCase());

		// => plan is valid, now check if reg amount is correct
		if (servicePlan.getPlanCost() == regAmount)
			return servicePlan;
		throw new CustomerException("Reg amount doesn't match with the chosen plan!!!");

		// ->incorrect reg amount : throw custom exc
	}

	// add a method to validate all i/ps
	public static Customer validateCustomerInputs(String firstName, String lastName, String email, String password,
			double regAmount, String dob, String plan, List<Customer> customers) throws CustomerException {

		// 1.Check for Duplicates
		checkDuplicate(email, customers);
		ServicePlan servicePlan = parseAndValidatePlanAndCharges(plan, regAmount);
		LocalDate birthDate = LocalDate.parse(dob);

		// all i/ps are valid, ret validated customer details to the caller
		return new Customer(firstName, lastName, email, password, regAmount, birthDate, servicePlan);
	}

	// add a method for login
//	public static Customer loginInputs(String email,String password,List<Customer> customerList) throws Exception {
//		for(Customer c: customerList) {
//			if(c.getEmail().equals(email)&&c.getPassword().equals(password)) {
//				return new Customer(email,password);
//			}
//		}
//		throw new CustomerException("Invalid...");
//	}

	public static Customer authenticate(String email, String password, List<Customer> authlist)
			throws CustomerException {
		Customer cr = new Customer(email);
		int idx = authlist.indexOf(cr);
		if (idx == -1)
			throw new CustomerException("Invalid Email, login failed");

		Customer cust = authlist.get(idx);
		if (cust.getPassword().equals(password))
			return cust;

		throw new CustomerException("Invalid Password");

	}

	public static void passUpdate(String email, String oldPasswd, String newPasswd, List<Customer> list)
			throws CustomerException {
		Customer cr = authenticate(email, oldPasswd, list);
		if (cr != null) {
			cr.setPassword(newPasswd);
			System.out.println("Password changed succesfully");
		} else {
			throw new CustomerException("Authentication failed");
		}
	}
	
	public static String deleteCustomer(String email,List<Customer> list) {
		return null;
	}

	// add a method for update
//	public static Customer updateDetails(String email,List<Customer> updateList) 
//	throws CustomerException{
//		for(Customer c:updateList) {
//			System.out.println("Inside validation");
//			if(c.getEmail().equals(email)) {
//				Customer update=Utils.upPasswd(updateList);
//				return new Customer(update);
//			}
//		}
//		throw new CustomerException("Unable to update");
//	}
};