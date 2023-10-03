package day3;

import day2.Student;

public class Student_Assignment4 {
	public static void main(String[] args) {
		Student s = new Student();
		s.setStudentId(101);
		s.setName("KM","INDU");
		s.setStudentType('F');
		
		System.out.println(s.getStudentId());
		System.out.println(s.getName());
		System.out.println(s.getStudentType());
		
		Student s1 = new Student(102,"Rahul","Singh",'F');

		System.out.println(s1.getStudentId());
		System.out.println(s1.getName());
		System.out.println(s1.getStudentType());
	}
}