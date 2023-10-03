package day4.methOveridingSuperDynBind;

import day4.methOveridingSuperDynBind.Hostelite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hostelite h1 = new Hostelite(101, "Km", "Indu", "F", "Sarojini", 207, 15000.0);
		h1.displayStudentDetails();
		Hostelite h2 = new Hostelite(102, "Rahul", "Singh", "C", "Bose", 208, 17000.0);
		h2.displayStudentDetails();
	}

}