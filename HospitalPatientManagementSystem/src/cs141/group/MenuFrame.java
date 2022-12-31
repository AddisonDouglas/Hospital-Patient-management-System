package cs141.group;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 * Name:Addison Douglas and Braeden Farry
 * Section: 2
 * Program Name: MenuFrame
 * Description: This is the classer for the user interface. it extends JFrame and implments actionListener
 * using a serires of JButtons that get hidden and un-hidden, it displays the correct button to the user.
 * Using a JTextField to get user input to create patients and doctors, and assign them. The user may
 * also save to a file which is created when the program is run.
 *
 */
public class MenuFrame extends JFrame implements ActionListener{
	//textfield
	JTextField userInput;
	JTextField userInput2;
	JTextField userInput3;
	JTextField userInput4;
	//buttons
	JButton add;
	JButton addPatient;
	JButton submitName;
	JButton submitDoctorName;
	JButton save;
	JButton submitGender;
	JButton submitDoctorGender;
	JButton menu;
	JButton print;
	JButton remove;
	JButton update;
	JButton assignDoctor;
	JButton addDoctor;
	JButton submitBirthday;
	JButton submitDoctorBirthday;
	JButton setRoom;
	JButton submitAdmittance;
	JButton submitDateAdmitted;
	JButton submitNumber;
	JButton submitRoom;
	JButton removeDoctor;
	JButton removePatient;
	JButton submitDoctorInt;
	JButton submitPatientInt;
	JButton submitPatient;
	JButton submitDoctor;
	
	//label
	JLabel label;
	//write to save to file
	FileWriter myWriter;
	
	String name;
	String gender;
	String birthday;
	String admittanceReason;
	String dateAdmitted;
	
	String doctorName;
	String doctorGender;
	String doctorBirthday;

	int interger;
	int patientIndex;
	int doctorIndex;
	
	JTextArea printedList;
	ArrayList<Patient> patients = new ArrayList<Patient>(); //create patient arraylist
	
	ArrayList<Doctor> doctors = new ArrayList<Doctor>(); //create Employee arraylist
	MenuFrame(){
		//creating file to write to, has to be surronded in try catch for IOException
		File myObj = new File("filename.txt");
	      try {
			if (myObj.createNewFile()) {
			    System.out.println("File created: " + myObj.getName());
			  } else {
			    System.out.println("File already exists.");
			  }
		} catch (IOException e) {
			e.printStackTrace();
		}
	      //Intilizating myWriter for later use, has to be surronded in try catch for IOException
	      try {
			myWriter = new FileWriter("filename.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	      
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting close operation
		this.setLayout(new FlowLayout()); //setting layout to flow
		this.setPreferredSize(new Dimension(400,300));
		
		userInput = new JTextField();
		userInput.setVisible(false);
		userInput.setPreferredSize(new Dimension(250, 40));
		
		addPatient = new JButton("Add patient");
		addPatient.addActionListener(this);
		addPatient.setVisible(false);
		
		submitName = new JButton("Submit Name");
		submitName.addActionListener(this);
		submitName.setVisible(false);
		
		submitGender = new JButton("Submit Gender");
		submitGender.addActionListener(this);
		submitGender.setVisible(false);
		
		submitBirthday = new JButton("Submit Birthday(dd/mm/yyyy)");
		submitBirthday.addActionListener(this);
		submitBirthday.setVisible(false);
		
		submitDoctorName = new JButton("Submit Name");
		submitDoctorName.addActionListener(this);
		submitDoctorName.setVisible(false);
		
		submitDoctorGender = new JButton("Submit Gender");
		submitDoctorGender.addActionListener(this);
		submitDoctorGender.setVisible(false);
		
		submitDoctorBirthday = new JButton("Submit Birthday(dd/mm/yyyy)");
		submitDoctorBirthday.addActionListener(this);
		submitDoctorBirthday.setVisible(false);
		
		
		add = new JButton("Add");
		add.addActionListener(this);
		
		menu = new JButton("Menu");
		menu.addActionListener(this);
		menu.setVisible(false);
		
		label = new JLabel("Enter name");
		label.setVisible(false);
		
		
		printedList = new JTextArea("Enter name");
		printedList.setVisible(false);
		printedList.setLineWrap(true);
		printedList.setEditable(false);
		printedList.setSize(1000, 1000);
		
		
		
		print = new JButton("Print all");
		print.addActionListener(this);
		
		save = new JButton("save to file");
		save.addActionListener(this);
		
		remove = new JButton("remove");
		remove.addActionListener(this);
		
		update = new JButton("update");
		
		assignDoctor = new JButton("Assign Doctor to patient");
		assignDoctor.addActionListener(this);
		
		addDoctor = new JButton("add Doctor");
		addDoctor.addActionListener(this);
		addDoctor.setVisible(false);
		

		
		setRoom = new JButton("Set Room Number");
		setRoom.addActionListener(this);
		
		submitAdmittance = new JButton("Submit Admittance Reason");
		submitAdmittance.addActionListener(this);
		submitAdmittance.setVisible(false);
		
		submitDateAdmitted = new JButton("Submit Date Admitted(dd/mm/yyyy)");
		submitDateAdmitted.addActionListener(this);
		submitDateAdmitted.setVisible(false);
		
		submitNumber = new JButton("Select Patient");
		submitNumber.addActionListener(this);
		submitNumber.setVisible(false);
		
		submitRoom = new JButton("Assign Patient to room");
		submitRoom.addActionListener(this);
		submitRoom.setVisible(false);
		
		removeDoctor = new JButton("Remove Doctor");
		removeDoctor.addActionListener(this);
		removeDoctor.setVisible(false);
		
		
		removePatient = new JButton("Remove Patient");
		removePatient.addActionListener(this);
		removePatient.setVisible(false);
		
		
		submitDoctorInt = new JButton("Remove Doctor");
		submitDoctorInt.addActionListener(this);
		submitDoctorInt.setVisible(false);
		
		submitPatientInt = new JButton("Remove Patient");
		submitPatientInt.addActionListener(this);
		submitPatientInt.setVisible(false);
		
		submitPatient = new JButton("Select Patient");
		submitPatient.addActionListener(this);
		submitPatient.setVisible(false);
		
		submitDoctor = new JButton("Select docotr");
		submitDoctor.addActionListener(this);
		submitDoctor.setVisible(false);
		
		
		
		this.add(addPatient);
		this.add(addDoctor);
	
		this.add(removeDoctor);
		this.add(removePatient);
		this.add(printedList);
		this.add(label);
		this.add(submitGender);
		this.add(submitName);
		this.add(submitBirthday);
		this.add(submitAdmittance);
		this.add(submitDateAdmitted);
		this.add(submitDoctorInt);
		this.add(submitPatientInt);
		this.add(submitPatient);
		this.add(submitDoctor);
		
		this.add(userInput);
		
		this.add(submitRoom);
		this.add(submitDoctorName);
		this.add(submitDoctorBirthday);
		this.add(submitDoctorGender);
		this.add(submitNumber);
		this.add(add);
		this.add(remove);
		this.add(assignDoctor);
		this.add(setRoom);
		this.add(print);
		this.add(menu);
		this.add(save);
		
		

		this.pack();
		this.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==assignDoctor) {
			add.setVisible(false);
			remove.setVisible(false);
			update.setVisible(false);
			assignDoctor.setVisible(false);
			print.setVisible(false);
			save.setVisible(false);
			setRoom.setVisible(false);
			menu.setVisible(true);
			submitPatient.setVisible(true);
			String g  = "";
			for(int i = 0; i < patients.size(); i ++) {
				
				g = g + i + ": " + patients.get(i).getFullName() + " ";
				
			}
			label.setText(g);
			label.setVisible(true);
			userInput.setVisible(true);
			userInput.setText("Enter Patient Number");
			
			
		}
		if(e.getSource()==submitPatient) {
			submitPatient.setVisible(false);
			submitDoctor.setVisible(true);
			String g  = "";
			for(int i = 0; i < doctors.size(); i ++) {
				
				g = g + i + ": " + doctors.get(i).getFullName() + " ";
				
			}
			label.setText(g);
			label.setVisible(true);
			userInput.setText("Enter Doctor Number");
			int patientIndex = Integer.parseInt(userInput.getText());
		}
		if(e.getSource()==submitDoctor) {
			int doctorIndex = Integer.parseInt(userInput.getText());
			patients.get(patientIndex).setDoctorName(doctors.get(doctorIndex));
			add.setVisible(true);
			remove.setVisible(true);
			update.setVisible(true);
			assignDoctor.setVisible(true);
			print.setVisible(true);
			save.setVisible(true);
			setRoom.setVisible(true);
			menu.setVisible(false);
			submitDateAdmitted.setVisible(false);
			submitAdmittance.setVisible(false);
			submitBirthday.setVisible(false);
			submitGender.setVisible(false);
			submitName.setVisible(false);
			addDoctor.setVisible(false);
			label.setVisible(false);
			label.setText("Enter name");
			userInput.setText(null);
			userInput.setVisible(false);
			submitDoctorBirthday.setVisible(false);
			submitDoctorGender.setVisible(false);
			submitDoctorName.setVisible(false);
			removePatient.setVisible(false);
			removeDoctor.setVisible(false);
			addPatient.setVisible(false);
			printedList.setVisible(false);
			submitDoctorInt.setVisible(false);
			submitPatientInt.setVisible(false);
			submitPatient.setVisible(false);
			submitDoctor.setVisible(false);
			
		}
		if(e.getSource()==remove) {
			add.setVisible(false);
			remove.setVisible(false);
			update.setVisible(false);
			assignDoctor.setVisible(false);
			print.setVisible(false);
			save.setVisible(false);
			setRoom.setVisible(false);
			removeDoctor.setVisible(true);
			removePatient.setVisible(true);
			menu.setVisible(true);
			
		}
		if(e.getSource()==removeDoctor) {
			String g  = "";
			for(int i = 0; i < doctors.size(); i ++) {
				
				g = g + i + ": " + doctors.get(i).getFullName() + " ";
				
			}
			label.setText(g);
			label.setVisible(true);
			userInput.setVisible(true);
			userInput.setText("enter doctor number to remove");
			removeDoctor.setVisible(false);
			removePatient.setVisible(false);
			submitDoctorInt.setVisible(true);
			
		}
		if(e.getSource()==submitDoctorInt) {
			int index = Integer.parseInt(userInput.getText());
			doctors.remove(index);
			add.setVisible(true);
			remove.setVisible(true);
			update.setVisible(true);
			assignDoctor.setVisible(true);
			print.setVisible(true);
			save.setVisible(true);
			setRoom.setVisible(true);
			menu.setVisible(false);
			submitDateAdmitted.setVisible(false);
			submitAdmittance.setVisible(false);
			submitBirthday.setVisible(false);
			submitGender.setVisible(false);
			submitName.setVisible(false);
			addDoctor.setVisible(false);
			label.setVisible(false);
			label.setText("Enter name");
			userInput.setText(null);
			userInput.setVisible(false);
			submitDoctorBirthday.setVisible(false);
			submitDoctorGender.setVisible(false);
			submitDoctorName.setVisible(false);
			removePatient.setVisible(false);
			removeDoctor.setVisible(false);
			addPatient.setVisible(false);
			submitDoctorInt.setVisible(false);
			submitPatientInt.setVisible(false);
		}
		if(e.getSource()==removePatient) {
			String g  = "";
			for(int i = 0; i < patients.size(); i ++) {
				
				g = g + i + ": " + patients.get(i).getFullName() + " ";
				
			}
			label.setText(g);
			label.setVisible(true);
			userInput.setVisible(true);
			removeDoctor.setVisible(false);
			userInput.setText("enter patient number to remove");
			removePatient.setVisible(false);
			submitPatientInt.setVisible(true);
			
		}
		if(e.getSource()==submitPatientInt) {
			int index = Integer.parseInt(userInput.getText());
			patients.remove(index);
			add.setVisible(true);
			remove.setVisible(true);
			update.setVisible(true);
			assignDoctor.setVisible(true);
			print.setVisible(true);
			save.setVisible(true);
			setRoom.setVisible(true);
			menu.setVisible(false);
			submitDateAdmitted.setVisible(false);
			submitAdmittance.setVisible(false);
			submitBirthday.setVisible(false);
			submitGender.setVisible(false);
			submitName.setVisible(false);
			addDoctor.setVisible(false);
			label.setVisible(false);
			label.setText("Enter name");
			userInput.setText(null);
			userInput.setVisible(false);
			submitDoctorBirthday.setVisible(false);
			submitDoctorGender.setVisible(false);
			submitDoctorName.setVisible(false);
			removePatient.setVisible(false);
			removeDoctor.setVisible(false);
			addPatient.setVisible(false);
			submitDoctorInt.setVisible(false);
			submitPatientInt.setVisible(false);
		}
		
		if(e.getSource() == add) {
			add.setVisible(false);
			remove.setVisible(false);
			update.setVisible(false);
			assignDoctor.setVisible(false);
			print.setVisible(false);
			save.setVisible(false);
			setRoom.setVisible(false);
			addPatient.setVisible(true);
			addDoctor.setVisible(true);
			menu.setVisible(true);
			
		}
		if(e.getSource()==addDoctor) {
		    addPatient.setVisible(false);
            userInput.setVisible(true);
            submitDoctorName.setVisible(true);
            label.setVisible(true);
            print.setVisible(false);
            addDoctor.setVisible(false);
		}
		
		if(e.getSource()==submitDoctorName) {
			 doctorName = userInput.getText();
		     userInput.setText(null);
		     submitDoctorName.setVisible(false);
		     submitDoctorGender.setVisible(true);
		     label.setText("Enter Gender");

		}
		if(e.getSource()==submitDoctorGender) {
			doctorGender = userInput.getText();
			 submitDoctorGender.setVisible(false);
		     userInput.setText(null);
		     label.setText("Enter Birthday");
		     submitDoctorBirthday.setVisible(true);

		}
		if(e.getSource()==submitDoctorBirthday) {
			doctorBirthday = userInput.getText();
			label.setText("Enter Name");
			submitDoctorBirthday.setVisible(false);
			doctors.add(new Doctor(doctorName, doctorGender, doctorBirthday));
			label.setVisible(false);
			userInput.setText(null);
			userInput.setVisible(false);
			submitDateAdmitted.setVisible(false);
			add.setVisible(true);
			remove.setVisible(true);
			update.setVisible(true);
			assignDoctor.setVisible(true);
			print.setVisible(true);
			save.setVisible(true);
			setRoom.setVisible(true);
			menu.setVisible(false);
			addPatient.setVisible(false);


		}
		
		if(e.getSource()==addPatient) {
		    addPatient.setVisible(false);
            userInput.setVisible(true);
            submitName.setVisible(true);
            label.setVisible(true);
            menu.setVisible(true);
            print.setVisible(false);
            addDoctor.setVisible(false);
            
            
		}
		if(e.getSource()==submitName) {
			 name = userInput.getText();
		     userInput.setText(null);
		     submitName.setVisible(false);
		     submitGender.setVisible(true);
		     label.setText("Enter Gender");

		}
		if(e.getSource()==submitGender) {
			 gender = userInput.getText();
			 submitGender.setVisible(false);
		     userInput.setText(null);
		     label.setText("Enter Birthday");
		     submitBirthday.setVisible(true);

		}
		if(e.getSource()==submitBirthday) {
			birthday = userInput.getText();
			userInput.setText(null);
			label.setText("Enter Reason For admittance");
			submitAdmittance.setVisible(true);
			submitBirthday.setVisible(false);


		}
		if(e.getSource()==submitAdmittance) {
			admittanceReason = userInput.getText();
			userInput.setText(null);
			label.setText("Enter Date Admitted");
			submitAdmittance.setVisible(false);
			submitDateAdmitted.setVisible(true);


		}
		if(e.getSource()==submitDateAdmitted) {
			dateAdmitted = userInput.getText();
			patients.add(new Patient(name, gender, birthday, admittanceReason, dateAdmitted));
			label.setText("Enter name");
			label.setVisible(false);
			userInput.setText(null);
			userInput.setVisible(false);
			submitDateAdmitted.setVisible(false);
			add.setVisible(true);
			remove.setVisible(true);
			update.setVisible(true);
			assignDoctor.setVisible(true);
			print.setVisible(true);
			save.setVisible(true);
			setRoom.setVisible(true);
			menu.setVisible(false);
			addPatient.setVisible(false);



		}
		if(e.getSource()==setRoom) {
			menu.setVisible(true);
			label.setVisible(true);
			submitNumber.setVisible(true);
			String g  = "";
			for(int i = 0; i < patients.size(); i ++) {
				
				g = g + i + ": " + patients.get(i).getFullName() + " ";
				
			}
			label.setText(g);
			add.setVisible(false);
			remove.setVisible(false);
			update.setVisible(false);
			assignDoctor.setVisible(false);
			print.setVisible(false);
			save.setVisible(false);
			setRoom.setVisible(false);
            userInput.setVisible(true);
            userInput.setText("Enter Number next to patient you wish to select");

		}
		if(e.getSource()==submitNumber) {
			submitNumber.setVisible(false);
			interger = Integer.parseInt(userInput.getText());
			userInput.setText("Enter Room Number");
			label.setVisible(false);
			submitRoom.setVisible(true);
		}
		if(e.getSource() == submitRoom) {
			int g = Integer.parseInt(userInput.getText());
			patients.get(interger).setRoomNumber(g);
			submitRoom.setVisible(false);
			add.setVisible(true);
			remove.setVisible(true);
			update.setVisible(true);
			assignDoctor.setVisible(true);
			print.setVisible(true);
			save.setVisible(true);
			setRoom.setVisible(true);
			userInput.setVisible(false);
			userInput.setText(null);
			menu.setVisible(false);
			
		}
		
		if(e.getSource()==menu) {
			 //TODO needs updating
			add.setVisible(true);
			remove.setVisible(true);
			update.setVisible(true);
			assignDoctor.setVisible(true);
			print.setVisible(true);
			save.setVisible(true);
			setRoom.setVisible(true);
			menu.setVisible(false);
			submitDateAdmitted.setVisible(false);
			submitAdmittance.setVisible(false);
			submitBirthday.setVisible(false);
			submitGender.setVisible(false);
			submitName.setVisible(false);
			addDoctor.setVisible(false);
			label.setVisible(false);
			label.setText("Enter name");
			userInput.setText(null);
			userInput.setVisible(false);
			submitDoctorBirthday.setVisible(false);
			submitDoctorGender.setVisible(false);
			submitDoctorName.setVisible(false);
			removePatient.setVisible(false);
			removeDoctor.setVisible(false);
			addPatient.setVisible(false);
			printedList.setVisible(false);
			submitDoctorInt.setVisible(false);
			submitPatientInt.setVisible(false);
			submitPatient.setVisible(false);
			submitDoctor.setVisible(false);
			submitPatient.setVisible(false);		     
			
		}
		if(e.getSource()==print) {
			printedList.setText("Patients"+ patients.toString() + "\nDoctors" + doctors.toString());
			printedList.setVisible(true);
		    menu.setVisible(true);
			add.setVisible(false);
			remove.setVisible(false);
			update.setVisible(false);
			assignDoctor.setVisible(false);
			print.setVisible(false);
			save.setVisible(false);
			setRoom.setVisible(false);
			submitDateAdmitted.setVisible(false);
			submitAdmittance.setVisible(false);
			submitBirthday.setVisible(false);
			submitGender.setVisible(false);
			submitName.setVisible(false);
			addDoctor.setVisible(false);
			userInput.setText(null);
			userInput.setVisible(false);
			submitNumber.setVisible(false);
			submitRoom.setVisible(false);

			
			
			
		}
		if(e.getSource()==save) {
			JDialog save = new JDialog(this, "save");
			JLabel saveLabel = new JLabel("Saved to filename.txt");
			save.add(saveLabel);
			save.setSize(150, 80);
			save.setVisible(true);
			 try {
			      FileWriter myWriter = new FileWriter("filename.txt");
			      myWriter.write(patients.toString());
			      myWriter.write(doctors.toString());
			      myWriter.close();
			      System.out.println("Successfully wrote to the file.");
			    } catch (IOException e2) {
			      System.out.println("An error occurred.");
			      e2.printStackTrace();
			    }
			
		}
		
	}

}
