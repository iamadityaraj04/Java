public class java41 {
	
	String currentLocation;
	String sourceLocation;
	String destinitionLocation;

	java41(){
		System.out.println("3. Block Constructor");
		
		if(currentLocation.equals("delhi")) {
			sourceLocation = "delhi";
			destinitionLocation = "bangalore";
		}else if(currentLocation.equals("bangalore")) {
			sourceLocation = "bangalore";
			destinitionLocation = "delhi";
		}else {
			sourceLocation = "mumbai";
			destinitionLocation = "chennai";
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("1. main");
		java41 bRef = new java41();
		System.out.println("bRef data: "+bRef);

	}
	
	// Create initialization block
	// Pre-Processing of Data
    //initializer block: it will execute every time a object is created
	{
		System.out.println("2. Initialization Block");
		currentLocation = "mumbai";
	}

	@Override
	public String toString() {
		return "Blocks [currentLocation=" + currentLocation + ", sourceLocation=" + sourceLocation
				+ ", destinitionLocation=" + destinitionLocation + "]";
	}
	
	// In order to initialize something before program starts :)
	static {
		System.out.println("0. Static Block");
	}
	
	

}