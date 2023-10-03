package day4.Inheritance;

public class Student {
	private int studentId;
	private String studentName;
	private double feesPerMonth;
	private String studentType;
	
	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}
	public void setFeesPerMonth(double d) {
		this.feesPerMonth = d;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentFirstName, String studentLastName) {
		this.studentName = studentFirstName+studentLastName;
	}
	public String getStudentType() {
		return studentType;
	}
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public double getFeesPerMonth() {
		return feesPerMonth;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentFirstName, String studentLastName, String studentType) {
		super();
		this.studentId = studentId;
		this.studentName = studentFirstName+" "+studentLastName;
		this.studentType = studentType;
	}
}