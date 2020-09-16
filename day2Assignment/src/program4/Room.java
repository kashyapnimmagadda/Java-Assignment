package program4;
/*
 * Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine. 
 * In this class the member functions are setdata and displaydata
 */
public class Room {
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public char getRoomType() {
		return roomType;
	}
	public void setRoomType(char roomType) {
		this.roomType = roomType;
	}
	public String getRoomArea() {
		return roomArea;
	}
	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}
	public char getAcMachine() {
		return acMachine;
	}
	public void setAcMachine(char acMachine) {
		this.acMachine = acMachine;
	}
	private int roomNo;
	private char roomType;
	private String roomArea;
	private char acMachine;
	public void setData(int roomNo,char roomType, String roomArea, char acMachine){
		this.roomNo = roomNo;
		this.roomType=roomType;
		this.roomArea=roomArea;
		this.acMachine= acMachine;
	}
	public void display (){
		System.out.println("RoomNo: "+roomNo+" RoomType: "+roomType+" RoomArea: "+roomArea+" Is AcMachine available: "+acMachine);
	}

}
