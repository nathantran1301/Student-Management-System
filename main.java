import java.util.ArrayList;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		int option = 0;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Welcome to the School Management System ");
		System.out.println('\n');
		
		ArrayList<Teacher> teacherList = new ArrayList<>();
		ArrayList<students> studentList = new ArrayList<>();
		studentList hr = new studentList();
		Record record = new Record();
		hr.add(record);
		
		Teacher t1 = new Teacher(1111, "Henderson", 30000);
		Teacher t2 = new Teacher(2222, "Jameson", 35000);
		Teacher t3 = new Teacher(3333, "Ramsey", 25000);
		
		teacherList.add(t1);
		teacherList.add(t2);
		teacherList.add(t3);

		
		students s1 = new students(1001, "Matt", 4.0);
		students s2 = new students(1002, "Uli", 3.5);
		students s3 = new students(1003, "CJ", 2.5);
				
				
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		
		
		School p1 = new School("Burlington Central", teacherList, studentList);

		System.out.println("Teachers: " + t1.TeacherName() +'\t'+ t2.TeacherName() +'\t'+ t3.TeacherName());
			
		System.out.println("-------Student Management-------");
		do {
			Menu();
		option = stdIn.nextInt();
		switch (option) {
		
		case 1:
			System.out.println("Enter student ID: ");
			int idNumber = stdIn.nextInt();
			System.out.println("Enter contact number: ");
			int contactNumber = stdIn.nextInt();
			stdIn.nextLine();
			
			System.out.println("Student name: ");
			String name = stdIn.nextLine();
			
			record = new Record(name, idNumber, contactNumber);
			hr.add(record);
			System.out.println("Name: " + name + " , ID: " + idNumber + " , Contact Number: " + contactNumber);
			break;
			
		case 2:
			System.out.println("Enter student ID: ");
			int id = stdIn.nextInt();
			hr.delete(id);
			hr.display();
			break;
		
		case 3:
			System.out.println("Enter student ID: ");
			int rID = stdIn.nextInt();
			hr.update(rID, stdIn);
			break;
			
		case 4:
			System.out.println("Enter student ID: ");
			int ida = stdIn.nextInt();
			
			if(!hr.find(ida)) {
				System.out.println("Student does not exist in system... ");
			}
			break;
			
		case 5:
			hr.display();
			break;
			
		case 6:
			System.out.println("Program Ended... ");
			System.exit(0);
			break;
			
			default:
			
			System.out.println("Invalid input... ");
			break;
		}
		
		
		} while(option != 6);
		
		System.out.println("------Student Enrollment------");
		s1.PayFees(15000);
		s2.PayFees(7500);
		s3.PayFees(5000);
		
		s1.Enrollment();
		s2.Enrollment();
		s3.Enrollment();
		
		System.out.println("-------School Pay Salary-------");
		
		System.out.println("Burlington Central has earned " + p1.getTotalMoneyEarned() + " $ a year from the following students: "
				+ s1.getName() + '\t' + s2.getName() + '\t' + s3.getName());
		
		t1.ReceiveSalary(t1.getSalary());
		System.out.println("Burlington Central has spent a salary of " + t1.getTotalMoneyEarned() + " $ a year for " + t1.TeacherName());
		
		t2.ReceiveSalary(t2.getSalary());
		System.out.println("Burlington Central has spent a salary of " + t2.getTotalMoneyEarned() + " $ a year for " 
				+ t2.TeacherName());
		
		t3.ReceiveSalary(t3.getSalary());
		System.out.println("Burlington Central has spent a salary of " + t3.getTotalMoneyEarned() +" $ a year for "
				+ t3.TeacherName());
		
		
	}
	
	public static void Menu() {
		System.out.println("Menu ");
		System.out.println("1. Add Student ");
		System.out.println("2. Delete Student ");
		System.out.println("3. Update Student ");
		System.out.println("4. Find Student ");
		System.out.println("5. Display Students ");
		System.out.println("6. Exit Program ");
		System.out.println("Enter a number between (1-6): ");
	}

}
