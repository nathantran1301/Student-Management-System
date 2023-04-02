import java.util.LinkedList;
import java.util.Scanner;
public class studentList {
	Scanner stdIn = new Scanner(System.in);
	LinkedList<Record> list;
	
	public studentList() {
	list = new LinkedList<>();
	
	}
	
	public Record findRecord(int id) {
		for(Record one : list) {
			if(one.getID() == id) {
				return one;
			}
		}

		return null;
		
	}
	
	public void add(Record record) {
		if(!find(record.getID())) {
			list.add(record);
		}
		else {
			System.out.println("Record currently exists ");
		}
	}
	
	public boolean find(int idnumber) {
		for(Record one: list) {
			if(one.getID() == idnumber) {
				System.out.println(1);
				return true;
			}
		}
		return false;
	}
	
	public void delete(int deltNumber) {
		Record record = null;
		
		for(Record eleven: list) {
			if(eleven.getID() == deltNumber) {
				record = eleven;
			}
		}
		
		if(record == null) {
			System.out.println("Invalid ");
		}
		
		else {
			list.remove(record);
		}
	}
	
	public void update(int id, Scanner stdIn) {
		if(find(id)) {
			Record record = findRecord(id);
			
			System.out.println("Enter student ID: ");
			int idNumber = stdIn.nextInt();
			
			System.out.println("Enter student Contact Number: ");
			int contactNumber = stdIn.nextInt();
			stdIn.nextLine();
			
			System.out.println("Enter updated Student Name: ");
			String name = stdIn.nextLine();
			
			record.setID(id);
			record.setName(name);
			record.setContact(contactNumber);
			
			System.out.println("Record Updated... ");
		}
		else {
			System.out.println("Record Invalid ");
		}
		
		
		
	}
	
	public void display() {
		
		if(list.isEmpty()) {
			System.out.println("No Records found... ");
		}
		
		for(Record record : list) {
			System.out.println(record.toString());
		}
		
	}
	
	
	
	
}
