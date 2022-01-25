public class java19 {

	public static void main(String[] args) {
		
		String name = new String("John");
		String fullName = name + " Watson"; //name.concat(" Watson");
		
		System.out.println("name is "+name); // John
		System.out.println("fullName is: "+fullName); // John Watson
		System.out.println();

		// Mutable Version of String in Java
		// If we wish to perform some manipulation on Strings, -> USE StringBuffer :)
		// StringBuffer is thread-safe
		// StringBuffer will always be created as an Object
        System.out.println("String Buffer");
		StringBuffer buffer = new StringBuffer("Hi! I am Aditya");
		
        buffer.append(" Raj");
		System.out.println("Append: "+buffer);
        
        int bufferLength=buffer.length();
		System.out.println("Length: "+bufferLength);
        
        int bufferCapacity=buffer.capacity();
		System.out.println("Capacity: "+bufferCapacity);
        
        buffer.insert(2," everyone");
		System.out.println("Insert: "+buffer);
        
        buffer.reverse();
		System.out.println("Reverse: "+buffer);
        
        
		
		System.out.println();
        System.out.println();
		// Mutable Version of String in Java 
		// A bit faster as compared to StringBuffer
		// StringBuilder is not thread-safe
        System.out.println("String Builder");
		StringBuilder builder = new StringBuilder("Currently i am pursuing Bachelor of Technology in");
		builder.append(" CSE");
		System.out.println("Append: "+builder);
		
        int builderLength=builder.length();
		System.out.println("Length: "+builderLength);
        
        int builderCapacity= builder.capacity();
		System.out.println("Capacity: "+builderCapacity);
        
        builder.insert(53," from LPU");
        System.out.println("Insert: "+builder);
        
        builder.reverse();
		System.out.println("Reverse: "+builder);
		
		
		
	}
    
}