
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
		
		// Syntax1
		int array1[] = {10, 20, 30, 40, 50};
		
		// Syntax2
		int[] array2 = {10, 20, 30, 40, 50};
		
		// Explicit Array Creation
		// Synatx3
		int array3[] = new int[]{10, 20, 30, 40, 50};
				
		// Syntax4
		int[] array4 = new int[]{10, 20, 30, 40, 50};
		
		System.out.println("array1 is: "+array1); // HashCode
		System.out.println("array2 is: "+array2); // HashCode
		System.out.println("array3 is: "+array3); // HashCode
		System.out.println("array4 is: "+array4); // HashCode
		
		// array1, array2, array3 and array4 are reference variables
		// they will contain the hashcode for array
		
		// Syntax5
		//int a1[], a2; // a1 is reference to array and a2 is a normal int
		int[] a3, a4; // a3 and a4 are both reference to an array
		
		
		a3 = new int[5];
		a4 = new int[10];
		
		// for a1, a3 and a4 -> size is on the basis of which array is created with default values as 0
		
		// update data in a4 1st index
		a4[1] = 9;
		a3[4]=8;
		for(int element: a4) {
			System.out.print(element+" ");
		}
		System.out.println();
		for(int element: a3) {
			System.out.print(element+" ");
		}

	}

}