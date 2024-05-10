package com.app.tester;

import java.util.HashSet;
import java.util.Scanner;

import com.app.core.Phone;

public class PBApplication {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashSet<Phone> hs = new HashSet<>();
			boolean exit = false;
			while (!exit) {
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Phone");
						break;
					case 2:
						break;
					case 0:
						exit = true;
						System.out.println("-----Exiting-----");
						break;
					default:
						break;
					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
