package Classroom;

public class ClassRoom {
	private int roomId;
	private String name;
	
	public ClassRoom(int roomId,String name) {
		this.roomId=roomId;
		this.name=name;
	}
	
	public String toString() {
		return "Room Id: "+roomId+" Name: "+name;
	}
}
