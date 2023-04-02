import java.util.ArrayList;

public class School {
private ArrayList<Teacher> teachers;
private ArrayList<students> Students;
private String schoolName;
private static int TotalMoneyEarned;
private int TotalMoneySpent;

public School(String schoolName, ArrayList<Teacher> teachers, ArrayList<students> Students) {
	this.schoolName = schoolName;
	this.teachers = teachers;
	this.Students = Students;
	this.TotalMoneyEarned = 0;
	this.TotalMoneySpent = 0;
}

public ArrayList<Teacher> getTeacher() {
	return teachers;
	
}
public ArrayList<students> getStudent() {
	return Students;
}
public String getSchool(String schoollName) {
	return schoolName;
}

public void addTeacher(Teacher teacher) {
	teachers.add(teacher);
}
public void addStudent(students stud) {
	Students.add(stud);
}

public int getTotalMoneyEarned() {
	return TotalMoneyEarned;
}
public int getTotalMoneySpent() {
	return TotalMoneySpent;
}

public static void updateMoneyEarned(int MoneyEarned) {
	TotalMoneyEarned += MoneyEarned;
}
public static void updateMoneySpent(int MoneySpent) {
	TotalMoneyEarned-= MoneySpent;
}





}
