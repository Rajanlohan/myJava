package com.navinrevision;

public class EncapsulationDemo {

	public static void main(String[] args) {

		Student s = new Student();
		
		s.setRollno(001   );
	}
}

class Student {

	int rollno;
	String sname;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}