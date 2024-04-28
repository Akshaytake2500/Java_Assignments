package Classroom;

//import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		ClassRoom arr[]=new ClassRoom[3];
		Utility.AcceptClassRoomDetails(arr);
		Utility.DisplayClassRoomDetails(arr);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter how much details you want to enter:  ");
//		int size = sc.nextInt();
//		ClassRoom arr[] = new ClassRoom[size];
//		boolean exit = false;
//		while (!exit) {
//			System.out.println("Enter your choice: ");
//			System.out.println("1.ADD\n2>Display\n3.Exit");
//			int ch = sc.nextInt();
//			switch (ch) {
//			case 1:
//				Utility.AcceptClassRoomDetails(arr);
//				break;
//			case 2:
//				Utility.DisplayClassRoomDetails(arr);
//				break;
//			case 3:
//				exit = true;
//				break;
//			default:
//				break;
//			}
//		}
	}

}
