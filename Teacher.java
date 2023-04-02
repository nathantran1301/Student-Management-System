
public class Teacher {
private int salary;
private String teachName;
private int id;
private int SalaryEarned;
private int TotalMoneyEarned;


public Teacher (int id, String teachName, int salary) {
	this.id = id;
	this.teachName = teachName;
	this.salary = salary;
	this.SalaryEarned = 0;
}

public int getID() {
	return id;
}
public String TeacherName() {
	return teachName;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

public void ReceiveSalary(int salary) {
	SalaryEarned+=salary;
	School.updateMoneyEarned(salary);
}

public int getTotalMoneyEarned() {
	return TotalMoneyEarned + salary;
}
public String toString() {
	return "Teacher name:" + teachName + "has earned a total amount of " + salary + "per year ";
}



}
