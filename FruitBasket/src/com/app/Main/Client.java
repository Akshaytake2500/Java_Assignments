package com.app.Main;

import java.util.Scanner;

import com.app.Fruits.Fruit;
import com.app.Fruits.UserInput;
import com.app.fruitUtility.Utility;

public class Client {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter how much fruits u want? ");
			int size = sc.nextInt();
			Fruit fr[] = new Fruit[size];
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("1.Add Fruits\n2.Display\n3.Display Names Of Fruit \n4.Sour\n0.Exit");
					int ch = sc.nextInt();
					switch (ch) {
					case 1:
						Utility.addFruits(fr);
						break;
					case 2:
						Utility.dispFruits(fr, true);
						;
						break;
					case 3:
						Utility.dispName(fr);
						break;
					case 4:
//						Utility.setStale(fr, null);
						break;
					case 0:
						exit = true;
						break;
					default:
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
