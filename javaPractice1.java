//Implement Conditional Constructs on the booking of a cab in ola/uber
import java.util.Scanner;
public class javaPractice1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Your Location: ");
        String srcLocation=sc.nextLine();
        
        System.out.print("Enter Your Destination: ");
        String desLocation=sc.nextLine();
        
        System.out.print("Enter Distance in Km: ");
        int dst=sc.nextInt();


        System.out.println("Choose your cab type:");
        System.out.println("Enter 1 for micro."); 
        System.out.println("Enter 2 for mini.");
        System.out.println("Enter 3 for sedan.");
        
        System.out.println("30% off on micro & mini rides.");
        System.out.println("10% off upto \u20b9 50 on sedan rides.");
        
        
        System.out.print("Enter Your Cab type:");
        int cab=sc.nextInt(); 
        sc.close();
        
        double costPerKmForMicroAndMini=30;
        double costPerKmForSedan=45;
        double cost;
        if(cab==1 || cab==2){
            double totalCost=costPerKmForMicroAndMini*dst;
            double discout=0.3*totalCost;
            
            cost=totalCost-discout;
            System.out.println("Booking Confirmed!");
            System.out.print("Your total price from "+srcLocation+" to "+desLocation+ " is: \u20b9"+cost);
        }
        else if(cab==3){
            double totalCost=costPerKmForSedan*dst;
            double discout=0.1*totalCost;
            if(discout<=50){
                cost=totalCost-discout;
                System.out.println("Booking Confirmed!");
                System.out.print("Your total price from "+srcLocation+" to "+desLocation+ " is: \u20b9"+cost);
            }
            else{
                discout=50;
                cost=totalCost-discout;
                System.out.println("Booking Confirmed!");
                System.out.print("Your total price from "+srcLocation+" to "+desLocation+ " is: \u20b9"+cost);
            }
        }
        else{
            System.out.println("Invalid cab type!");
        }        
    }
}