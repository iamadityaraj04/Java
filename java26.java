// this is a reference variable which refers to the Current Object
class Student{
	
	// Attributes
	int roll;
	String name;
	
	Student(){
		System.out.println("this is: "+this);
	}
	
	// here as of now, attributes of object are same as that of inputs for constructor
	// so we cannot distinguish between lhs and rhs
	
	// for the solution:
	Student(int roll, String name){
		// now here LHS this.roll belongs to the object's attribute and rhs is of Student Constructor
		this.roll = roll;
		this.name = name;
    }
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Roll: "+ roll);
    }
	
}
public class java26 {

	public static void main(String[] args) {

		Student s1 = new Student(101, "John");
		System.out.println("s1 is: "+s1);
		s1.display();

		
		System.out.println();
		
		Student s2 = new Student();
		System.out.println("s2 is: "+s2);

	}

}