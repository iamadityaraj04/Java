public class java6{

	public static void main(String[] args) {

		char whiteSquare = '\u25A1';
		char blackSquare = '\u25A0';
		
		// Loops or Iterations
		// When in the code we need to do the same thing n-number of times

		
		int idx1= 1; // starting point
		
		// checks condition at entry
		while(idx1<=4) { // ending point
			System.out.print(whiteSquare+" "+blackSquare+" "); // the statement to be repeated again and again i.e. n number of times
			idx1++; // expression with which we will move from starting point to the ending point
		}
        System.out.println();
		
		// whenever the condition is wrong, the loop will be executed on a min of once :)
        int idx2=1;
		do {
			System.out.print(blackSquare+" "+whiteSquare+" ");
			idx2++;
		}while(idx2<=4); // check condition at exit 
		
        System.out.println();
		
        //for loop
		for(int i=1;i<=4;i++) {
			System.out.print(whiteSquare+" "+blackSquare+" ");
		}
	}

}