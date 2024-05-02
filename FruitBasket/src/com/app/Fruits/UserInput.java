package com.app.Fruits;

import java.util.Scanner;

public class UserInput {

	public static void addApple(Fruit fr[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < fr.length; i++) {
			System.out.println("Enter Apple Name: ");
			String nm = sc.next();
			System.out.println("Enter Apple Color: ");
			String cl = sc.next();
			System.out.println("Enter Apple Weight: ");
			double wt = sc.nextDouble();
			boolean fsh = true;
			fr[i] = new Apple(nm, cl, wt, fsh);
		}
	}

	public static void addMango(Fruit fr[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < fr.length; i++) {
			System.out.println("Enter Mango Name: ");
			String nm = sc.next();
			System.out.println("Enter Mango Color: ");
			String cl = sc.next();
			System.out.println("Enter Mango Weight: ");
			double wt = sc.nextDouble();
			boolean fsh = true;
			fr[i] = new Mango(nm, cl, wt, fsh);
		}
	}

	public static void addOrange(Fruit fr[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < fr.length; i++) {
			System.out.println("Enter Orange Name: ");
			String nm = sc.next();
			System.out.println("Enter Orange Color: ");
			String cl = sc.next();
			System.out.println("Enter Orange Weight: ");
			double wt = sc.nextDouble();
			boolean fsh = true;
			fr[i] = new Orange(nm, cl, wt, fsh);
		}
	}
}
