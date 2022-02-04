// Assignment: Create an Object either Restraunt Object or Product from Amazon
//			 list all the attributes and then create objects :)
import java.util.Scanner;
class restaurant{

    private String restaurantName;
    private String restaurantType;
    private String restaurantLocation;

    /*void setrestaurantName(String name){
        this.restaurantName=name;
    }
    void setrestaurantType(String type){
        this.restaurantType=type;
    }
    void setrestaurantLocation(String location){
        this.restaurantLocation=location;
    }*/
    
    restaurant(String name, String type, String location ){
        this.restaurantName=name;
        this.restaurantType=type;
        this.restaurantLocation=location;

    }

    String getRestaurantName() {
        return restaurantName;
    }
    String getRestaurantType() {
        return restaurantType;
    }
    String getRestaurantLocation() {
        return restaurantLocation;
    }
}

public class javaPractice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter restaurant name : ");
        String name=sc.nextLine();
        
        System.out.print("Enter restaurant type : ");
        String type=sc.nextLine();
        
        System.out.print("Enter restaurant location : ");
        String location=sc.nextLine();
        
        sc.close();
        
        restaurant r1=new restaurant(name, type, location);
        // r1.setrestaurantName("Sonotel");
        // r1.setrestaurantType("Vegitarian");
        // r1.setrestaurantLocation("Ozone Galleria Mall, Dhanbad");
        System.out.println("Name: "+r1.getRestaurantName());
        System.out.println("Type: "+r1.getRestaurantType());
        System.out.println("Location: "+r1.getRestaurantLocation());
    }
}
