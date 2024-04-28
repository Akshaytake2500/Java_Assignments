package Classroom;

public class Teacher extends ClassRoom{
	private int teacherId;
	private String tname;
	DesignationEnum de;
	
	public Teacher(int roomId,String name,int teacherId,String tname,DesignationEnum de) {	
		super(roomId,name);
		this.teacherId=teacherId;
		this.tname=tname;
		this.de=de;
	}
	
	public String toString() {
		return super.toString()+" Teacher Id: "+teacherId+" Teacher Name: "+tname+" Designation: "+de;
	}
}
