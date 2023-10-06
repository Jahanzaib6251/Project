import java.util.Scanner;
public class TestFile {
private ArrayStack<Student> record;
private Scanner input;
private int counter;
public TestFile() {
	record = new ArrayStack<>();
	input = new Scanner(System.in);
	 counter = 0;
}
public void add() {
	System.out.print("Enter Student's Name: ");
	String name = input.nextLine();
	System.out.print("Enter Student's Department: ");
	String department = input.nextLine();
	System.out.print("Enter Student's ID: ");
	int roll = Integer.parseInt(input.nextLine());
	System.out.print("Enter Student's CGPA: ");
	double gpa = Double.parseDouble(input.nextLine());
	record.Push(new Student(name,department,roll,gpa));
	counter++;
	System.out.println("Name: "+name+" \tDepartment: "+department+"\tRoll Number: "+roll+"\tCgpa: "+gpa);
	System.out.println("Student is added successfully!");
}

public void remove() {
	try {
		if(!record.isEmpty()) {
		System.out.println(record.pop().toString());
	System.out.println("\nLast Student is removed successfully!");
	counter--;
		}
	} catch(Exception e) {
		System.out.println("Not Found!");
	}
	
}
public void look() {
	try {
		if(!record.isEmpty()) {
	System.out.println("\nLatest Student you added: ");
	System.out.println(record.peak().toString());
		} 
	}catch(Exception e) {
			System.out.println("Not Found!");
		}	
}
public void first() {
	ArrayStack<Student> temp = new ArrayStack<>();
	try {   while(!record.isEmpty()) {
		   temp.Push(record.pop());
		   
	   }
	   System.out.println(temp.peak().toString());
	   } catch(Exception e) {
		   System.out.println("Not Found!");
	   }
}
public void addedStudents() {
	System.out.println("You've "+counter+"  added Students");
}
public void clear() {
	if(counter > 0) {
	record.clear();
	counter = 0;
	System.out.println("\nRecord has Cleared successfully!");
	} else {
		System.out.println("Already Cleared");
	}
}
public void getDisplay() {
	LinkedQueue<Student> temp = new LinkedQueue<>();
   while(!record.isEmpty() || !temp.isEmpty()) {
	   if(!record.isEmpty()) {
		   temp.enqueue(record.pop());
		   counter--;
	   } else {
		   System.out.println(temp.dequeue().toString());
	   }//if
   }//while
}
public boolean search() {
	System.out.println("Enter Student's details to Search...");
	System.out.print("Enter Student's Name: ");
	String name = input.nextLine();
	System.out.print("Enter Student's Department: ");
	String department = input.nextLine();
	System.out.print("Enter Student's ID: ");
	int roll = Integer.parseInt(input.nextLine());
	System.out.print("Enter Student's CGPA: ");
	double gpa = Double.parseDouble(input.nextLine());
	Student obj =	new Student(name,department,roll,gpa);
	boolean result = false;
	try {
	while(!record.isEmpty() && counter >0) {
		Student tmp = new Student(record.pop());
		counter--;
		if(obj.getName().equals(tmp.getName()) && obj.getDepartment().equals(tmp.getDepartment()) &&obj.getRollNumber()==tmp.getRollNumber() && obj.getCgpa()==tmp.getCgpa()) {
		   result = true;
	}
	record.Push(tmp);
	}
	} catch(Exception e) {
	System.out.println("Not Found!");
	}
	return result;
}
}//class
