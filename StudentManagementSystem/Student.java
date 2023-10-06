
public class Student {
private String name;
private String department;

private int rollNumber;
private double cgpa;

public Student() {
	setName(null);
	setDepartment(null);
	setRollNumber(0);
	setCgpa(0);
}
public Student(String name,String department, int roll, double cgpa) {
	setName(name);
	setDepartment(department);
	setRollNumber(roll);
	setCgpa(cgpa);
}
public Student(Student obj) {
	this.setName(obj.getName());
	this.setDepartment(obj.getDepartment());
	this.setRollNumber(obj.getRollNumber());
	this.setCgpa(obj.getCgpa());
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public int getRollNumber() {
	return rollNumber;
}
public void setRollNumber(int rollNumber) {
	this.rollNumber = rollNumber;
}
public double getCgpa() {
	return cgpa;
}
public void setCgpa(double cgpa) {
	this.cgpa = cgpa;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public String toString() {
	return "Student [name=" + name + ", department=" + department + ", rollNumber=" + rollNumber + ", cgpa=" + cgpa+ "]";
}
}
