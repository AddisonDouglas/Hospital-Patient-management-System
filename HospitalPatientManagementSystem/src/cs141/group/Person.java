package cs141.group;

/**
 * Name:Addison Douglas and Braeden Farry
 * Section: 3
 * Program Name: Person
 * Description: The class that doctor and patient implements, has strings for fullName, Gender and birthday
 * then has setters and getters for each and a constuctor for them
 *
 */

public class Person {
	public String fullName;
	public String gender;
	public String birthday;
	


	public Person (String fullName, String gender, String birthday) {
		this.fullName = fullName;
		this.gender = gender;
		this.birthday = birthday;
	
	}

	public String getFullName() {
		return fullName;
	}
	public String getGender() {
		return gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
