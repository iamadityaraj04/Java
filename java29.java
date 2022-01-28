class Car{
    Car(){
        System.out.println("Car Class");
    }
    public void vehicleType()
    {
     System.out.println("Vehicle Type: Car");
    }
 }
 class Ford extends Car{
    Ford(){
        System.out.println("Ford Class");
    }
    public void brand()
    {
     System.out.println("Brand: Ford");
    }
 }
 class model extends Ford{
    model(){
        System.out.println("Model Class");
    }
 
    public void carmodel()
    {
     System.out.println("Model: Platinum");
    }
    public void speed()
    {
     System.out.println("Max Speed: 160Kmph");
    }
}

public class java29 {
    public static void main(String args[])
    {
      model obj=new model();
      obj.vehicleType();
      obj.brand();
      obj.carmodel();
      obj.speed();
    
      
    }
    
}