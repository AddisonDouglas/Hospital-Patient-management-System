package cs141.group;
import java.util.Random;

/**
 * Name:Addison Douglas and Braeden Farry
 * Section: 4
 * Program Name: Doctor
 * Description: Exstends person to create a doctor 
 *
 */

public class Doctor extends Person{
	public int empID;
	Random rand = new Random();

	
	public Doctor (String fullName, String gender, String birthday) {
		super(fullName, gender, birthday);
		this.empID = Math.abs(rand.nextInt());
		
	}
	public int empID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String toString() {
		return ("\nName: " + fullName+ "\n" +  "Gender: " + gender + "\n" + "Birthday: " + birthday + "\n------");
	}
		
	public void printEmployee() {
		System.out.println("Name: " + fullName);
		System.out.println("Gender: " + gender);
		System.out.println("Birthday: " + birthday);
		System.out.println("Employee ID: " + empID);
		System.out.println("----------------------");
	}
}
