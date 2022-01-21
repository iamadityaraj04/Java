
public class java10 {

	public static void main(String[] args) {
		
		// initializing array
		int marks[] = {90, 80, 85, 72, 64};
		
		System.out.println("marks is: "+marks); // reference type will give hashcode as output
		
		// marks -> is a reference variable which stores the hashcode of the Array
		//			and Array will be created inside the heap memory at run time

		/*for(int idx=0;idx<marks.length;idx++) {
			System.out.println(marks[idx]);
		}*/
		
		// Enhanced For Loop / for-each loop | Read only loop
		for(int element : marks) {
			System.out.println(element);
		}
		
		
	}

}