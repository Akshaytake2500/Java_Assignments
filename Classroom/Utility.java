package Classroom;
import java.util.Scanner;


public class Utility {
	@SuppressWarnings({ "resource", "unused" })
	public static void AcceptClassRoomDetails (ClassRoom[] arr)
	{	
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
		System.out.println("Enter Room Id: ");
		int rid=sc.nextInt();
		System.out.println("Enter Room Name: ");
		String nm =sc.next();
		System.out.println("Enter Teacher Id: ");
		int tid=sc.nextInt();
		System.out.println("Enter Teacher Name: ");
		String tnm=sc.next();
		System.out.println("Enter Teacher Designation: ");
		DesignationEnum tde=null;
		System.out.println("1.Prof\n2.AsstProf");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			tde=DesignationEnum.Prof;
			break;
		case 2:
			tde=DesignationEnum.AsstProf;
			break;
			default:
				break;
		}
		arr[i]=new Teacher(rid,nm,tid,tnm,tde);
		}
	}
    public static void DisplayClassRoomDetails (ClassRoom[] arr)
    {
    	for(int i=0;i<arr.length;i++) {
    		System.out.println(arr[i]);
    	}
    }
}
