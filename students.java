
public class students {
	
	private String student;
	private double grade;
	private int feesTotal;
	private int feesPaid;
	private int id;
	public students(int id, String student, double grade) {
		this.id = id;
		this.student = student;
		this.grade = grade;
		this.feesTotal = 15000;
		this.feesPaid = 0;
		
	}
	
	
	public String getName() {
		return student;
		}
	public double getGrade() {
		return grade;
	}
		public int TotalFee() {
		return feesTotal;
	}
	public int PaidFees() {
		return feesPaid;
	}
	public int getID() {
		return id;	
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
	public int RemainFees() {
		return feesTotal - feesPaid;
	}
	
	
	public void PayFees(int fees) {
		feesPaid+=fees;
		School.updateMoneyEarned(feesPaid);
	}
	public void Enrollment() {
		if (feesPaid >= 15000) {
			System.out.println( getName() +" Qualify for enrollment ");
		}else {
			System.out.println(getName() + " Insuffcient funds for enrollment ");
		}
		
	}
	
	
	
	

	
	
	
	
}