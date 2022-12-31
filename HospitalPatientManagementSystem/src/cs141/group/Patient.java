package cs141.group;

/**
 * Name:Addison Douglas and Braeden Farry
 * Section: 5
 * Program Name: Patient
 * Description: extends person adding in admittanceReason, dateAdmitted, doctor, and roomNumber.
 * The doctor is a Doctor object. constructor calls super for fullname, gender and birthday, has 
 *  admittanceReason and dateAdmitted get set, and sets docotr to a blank doctor object and roomnubmer
 *  to max interger value 
 *
 */

public class Patient extends Person {
	public String admittanceReason;
	public String dateAdmitted;
	public Doctor doctor;
	public int roomNumber;


	

	public Patient (String fullName, String gender, String birthday, String admittanceReason, String dateAdmitted) {
		super(fullName, gender, birthday);
		this.admittanceReason = admittanceReason;
		this.dateAdmitted = dateAdmitted;
		this.doctor = new Doctor("No Doctor", "False", "false") ;
		roomNumber = Integer.MAX_VALUE;
	}

	/**
	 * @return the roomNumber
	 */
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public void setDoctorName(Doctor doctor) {
		this.doctor = doctor;
	}
	public String getAdmittanceReason() {
		return admittanceReason;
	}
	public String getDateAdmitted() {
		return dateAdmitted;
	}
	public void setAdmittanceReason(String admittanceReason) {
		this.admittanceReason = admittanceReason;
	}
	public void setDateAdmitted(String dateAdmitted) {
		this.dateAdmitted = dateAdmitted;
	}
	public String toString() {
		return ("\nName: " + fullName+ "\n" +  "Gender: " + gender + "\n" + "Birthday: " + birthday + "\n" + "Admittance Reason: " + admittanceReason + " \n" + "Date Admitted: " + dateAdmitted + "\n" + "Doctor Name: " + doctor.getFullName() + "\n" +  "Room Number: " + roomNumber + "\n------------" );
	}

	public void printPatient() {
		System.out.println("Name: " + fullName);
		System.out.println("Gender: " + gender);
		System.out.println("Birthday: " + birthday);
		System.out.println("Admittance Reason: " + admittanceReason);
		System.out.println("Date Admitted: " + dateAdmitted);
		System.out.println("----------------------");
		}
}

