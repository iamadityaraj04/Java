public class java17 {
	
	static int staticMethod(int x, int y) {
		
		return (x*x + y*y + 2*x*y);
	}

    
	int nonStaticMethod(int a, int b) {
		
		return (a*a + b*b + 2*a*b);
	}

	public static void main(String[] args) {

		// Methods can be:
		// 1. non static
		// 2. static
		
		// Executing a non static method:
		// we need the object's reference for that class
		
        java17 refVar = new java17(); // Object :)
		int result1 = refVar.nonStaticMethod(10, 20);
		System.out.println("Result is: "+result1);
		
		// Executing a static method:
		//int result = Methods.f(10, 20);
		
		// in case static method and main belongs to the same class, we can skip the class name as well
		int result2 = staticMethod(10, 20);
		System.out.println("Result is: "+result2);
		

	}

}