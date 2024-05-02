package com.app.fruitUtility;

import java.util.Scanner;

import com.app.Fruits.Fruit;
import com.app.Fruits.Mango;
import com.app.Fruits.Orange;
import com.app.Fruits.UserInput;

public class Utility {
	private static Object Orange;

	public static void addFruits(Fruit fr[]) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		for (int i = 0; i < fr.length; i++) {
			while (!exit) {
				System.out.println("Enter which fruits u want to add in basket: ");
				System.out.println("1.Mango\n2.Apple\n3.Orange\n4.Exit");

				switch (sc.nextInt()) {
				case 1:
					UserInput.addMango(fr);
					break;
				case 2:
					UserInput.addApple(fr);
					break;
				case 3:
					UserInput.addOrange(fr);
					break;
				case 4:
					System.out.println("Exiting fruits section");
					exit = true;
				default:
					break;
				}
			}
		}
	}

	// -----Display names of all fruits in the basket.------

	public static void dispName(Fruit fr[]) {
		System.out.println("Fruits in the basket:");
		for (Fruit fruit : fr) {
			System.out.println(fruit.getName());
		}
	}

	// ------------------End of Names-----------------------

	// -------------Display all fruits + fresh----------------
	public static void dispFruits(Fruit fr[], boolean fresh) {
		boolean exit = false;
		while (!exit) {
			for (int i = 0; i < fr.length; i++) {
				System.out.println(fr[i] + " Fresh: " + fresh);
			}
			exit = true;
		}
	}
	// --------------End of Display All-----------------------

//Mark a fruit in a basket , as stale(=not fresh)----------
//i/p : index --------------------------------------------	
//	-----------------End of Stale--------------------------

//	-------------- Mark all sour fruits stale -------------

//	public static int sourFruit(Fruit fr[]) {
//		for (Fruit fruit : fr) {
//			System.out.println("Inside sour");
//			if (fruit instanceof Orange) {
//				fruit.setFresh(false);
//			}
//		}
//		System.out.println("Sour fruits marked as stale.");
//		return 0;
//
//	}

//	public static void setStale(Fruit[] fr, String c) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("\nEnter the fruit name to mark as stale:");
//		String name = sc.next();
//		if (name == c) {
//			fr[name].setFresh(false);
//			System.out.println("Thefruit mark as stale successfully..............");
//
//		} else {
//			System.out.println("the baskert contain only " + c + " Fruit..........");
//		}

	}

//	 -------------Mark all sour fruits stale End----------- 

}