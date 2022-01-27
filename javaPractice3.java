// Assignment: Create an Object either Restraunt Object or Product from Amazon
//			 list all the attributes and then create objects :)

class restraunt{

    private String restrauntName;
    private String restrauntType;
    private String restrauntLocation;

    /*void setrestrauntName(String name){
        this.restrauntName=name;
    }
    void setrestrauntType(String type){
        this.restrauntType=type;
    }
    void setrestrauntLocation(String location){
        this.restrauntLocation=location;
    }*/
    
    restraunt(String name, String type, String location ){
        this.restrauntName=name;
        this.restrauntType=type;
        this.restrauntLocation=location;

    }

    String getRestrauntName() {
        return restrauntName;
    }
    String getRestrauntType() {
        return restrauntType;
    }
    String getRestrauntLocation() {
        return restrauntLocation;
    }
}

public class javaPractice3 {
    public static void main(String[] args) {
        
        restraunt r1=new restraunt("Sonotel", "Vegitarian", "Ozone Galleria Mall, Dhanbad");
        // r1.setrestrauntName("Sonotel");
        // r1.setrestrauntType("Vegitarian");
        // r1.setrestrauntLocation("Ozone Galleria Mall, Dhanbad");
        System.out.println("Name: "+r1.getRestrauntName());
        System.out.println("Type: "+r1.getRestrauntType());
        System.out.println("Location: "+r1.getRestrauntLocation());
    }
}
