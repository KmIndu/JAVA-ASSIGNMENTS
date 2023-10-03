package day4.ProtectedAccessSpecifier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hostelite h1 = new Hostelite(101, "Km", "Indu", "F", "Sarojini", 207, 15000.0);
		System.out.println(h1.getStudentId());
		System.out.println(h1.getStudentName());
		System.out.println(h1.getStudentType());
		System.out.println(h1.getHostelName());
		System.out.println(h1.getRoomnumber());
	}

}