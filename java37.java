

interface Notification{
	void notifyUser();
	void sayHello(String name);
}


public class java37 {

	public static void main(String[] args) {
		// Anonymous class
		// When we wish to have a single object for a class which implements interface
		Notification notification = new Notification() {
			
			public void notifyUser() {
				System.out.println("A new notification received");
			}
			
			public void sayHello(String name) {
				System.out.println("Hello, "+name);
			}
			
		};
		// Create an anonymous class, then create the object of anonymous class and return the hashcode to the reference variable
		System.out.println("notification is: "+notification);
		notification.notifyUser();

	}

}