// pass by value
class IncrementDecrement{
	
	static int increment(int num) {
		return ++num;
	}
	
	
	static int decrement(int num) {
		return --num;
	}
	
}

public class java15{
	
	static void squareOfNumber(int number) {
		
		number = IncrementDecrement.increment(number);
		
		System.out.println("[SqON] started");
		
		System.out.println("[SqON] number before is: "+number); // 11
	
		number *= number; // same as above :) // 121
		
		System.out.println("[SqON] number after is: "+number); // 121
		
		System.out.println("[SqON] finished");
	}

	public static void main(String[] args) {

		int data = 10;
		System.out.println("[main] data before is: "+data);
		
		squareOfNumber(data); // Value Copy Operation :)
		
		System.out.println("[main] data after is: "+data);

		System.out.println("[main] finished");

	}

}