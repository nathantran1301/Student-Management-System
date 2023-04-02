
public class Record {
	private String student;
	private int id;
	private int contactNumber;
	
	public Record() {
		
	}
	
	public Record(String student, int id, int contactNumber) {
		this.student = student;
		this.id = id;
		this.contactNumber = contactNumber;
	}
	public int getContact() {
		return contactNumber;
	}
	public void SetContact(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getName() {
		return student;
	}
	public int getID() {
		return id;
	}
	public void setContact(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public void setID(int id) {
		this.id = id;
	}
	public void setName(String student) {
		this.student = student;
	}
	
	@Override public String toString() { // Returning records
		return "Records: "+ '\n' + "Name: " + student + " , ID Number: " + id + " , Contact Number:" + contactNumber;
	}
	
}
