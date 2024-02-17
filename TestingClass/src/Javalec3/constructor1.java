package Javalec3;

public class constructor1 {
	String name ;
	int userID;
	constructor1(String name,int userID){
		this.name = name;
		this.userID = userID;
		System.out.println(name);
		System.out.println(userID);
	}
	public static void main(String[] args) {
		constructor1 obj = new constructor1("Amit",1001);
		constructor1 boj1 = new constructor1("uday",1002);
	}

}
