
import java.io.File;
//import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Patient{
	
	String name;
	int age;
    char gender;
	int diabities;
	int heartRate;
	
	Patient(){
		
	}

	Patient(String name, int age, char gender, int diabities, int heartRate) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.diabities =diabities;
		this.heartRate = heartRate;
	}

	@Override
	public String toString() {
		return name + "," + age + "," + gender + ","
				+ diabities +","+ heartRate +"\n";
	}
	
}

class HealthManagerApp{
	
	FileIOOperations operations;

	HealthManagerApp(){
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Health Manager App");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		operations = new FileIOOperations();
	}
	
	void markEntryForPatient() {
		Scanner scanner = new Scanner(System.in);
		Patient cRef = new Patient();
		
		System.out.print("Enter Patient Name: ");
		cRef.name = scanner.nextLine();
		
		System.out.print("Enter Patient Age: ");
		cRef.age = scanner.nextInt();
		
		System.out.print("Enter Patient Gender: ");
		cRef.gender = scanner.next().charAt(0);

        System.out.print("Enter Diabities Reading: ");
		cRef.diabities = scanner.nextInt();
		
        System.out.print("Enter HeartRate Reading: ");
		cRef.heartRate = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(cRef);
		
		operations.writeInFile(cRef.toString());
		//operations.writeInFileAsBinary(cRef.toString());
	}
	
}

class FileIOOperations{
	
	void writeInFile(String Write) {
		System.out.println("Data to Write: "+Write);
		
		try {
			File file1 = new File("Patient.csv");
			//FileWriter writer = new FileWriter(file);
			FileWriter writer = new FileWriter(file1, true); // true -> enable append mode
			writer.write(Write);
			writer.close();
			System.out.println("Patient Details Saved Successfully:)");
		}catch(Exception e) {
			System.out.println("Something went wrong: "+e);
		}
		
	}	
}


class javaPractice5{

	public static void main(String[] args) {
		
		HealthManagerApp app = new HealthManagerApp();
		app.markEntryForPatient();
	}

}