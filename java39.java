public class java39 {

	public static void main(String[] args) {
		
		
		int i = 10; // Primitive Type
		
		// Convert Primitive to Reference type
		// i.e. we will have an object version of int through Integer class
		
		// BOXING: Converted primtive to Reference
		//Integer iRef = Integer.valueOf(i);
		// UNBOXING: Get the int value back from Object
		//int j = iRef.intValue(); 
		
		
		// AUTO BOXING: Automatically i will be converted to iRef1. No need to valueOf Method
		Integer iRef1 = i;
		
		// AUTO UNBOXING
		//int k = iRef1; // no need to execute intValue method
		
		// Same for every data type
		char ch = 'A';
		Character cRef = ch;
		
		System.out.println(iRef1+" "+iRef1.hashCode());
		System.out.println(cRef+" "+cRef.hashCode());
		
		/*
			int -> Integer
			byte -> Byte
			short -> Short
			long -> Long
			float -> Float
			double -> Double
			char -> Character
			boolean -> Boolean
		*/
		
		

	}

}