import java.util.Scanner;

public class java5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an Amount: ");
		double amount = scanner.nextDouble();
		
		System.out.println("Enter a Promo Code: ");
		int promoCode = scanner.nextInt();
		
		scanner.close(); // release the stream and make the memory clear :)
		
		System.out.println("You Entered: "+amount+" | "+promoCode);
		
		// Promo Codes
		final int JUMBO = 101;    // Flat 50% Off for orders value worth equal or more than 200
		//JUMBO = 1101; // error
		final int ZOMHELLO = 201; // Flat 40% Off upto 80 order value worth equal or more than 159
		double discount = 0;
		
		switch(promoCode) {
		
			case JUMBO:
				
				if(amount >= 200) {
					discount = 0.5 * amount;
					System.out.println("Discount is: \u20b9"+discount);
					System.out.println("JUMBO Applied Successfully");
				}else {
					System.out.println("Amount is Lesser. Please add items worth "+(200-amount)+" more");
				}
				
				break;
				
			case ZOMHELLO:
				
				if(amount >= 159) {
					discount = 0.4 * amount;
					
					if(discount > 80) {
						discount = 80; // upto condition :)
					}
					System.out.println("Discount is: \u20b9"+discount);
					System.out.println("ZOMHELLO Applied Successfully");
				}else {
					System.out.println("Amount is Lesser. Please add items worth "+(159-amount)+" more");
				}
				break;
				
			default:
				System.out.println("Invalid Promo Code");
		
		}
		amount -= discount;
		System.out.println("Please pay final amount: \u20b9"+amount);
	}

}
