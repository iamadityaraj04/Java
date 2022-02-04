class Car{
   
    public void vehicleType()
    {
     System.out.println("Vehicle Type: Car");
    }
 }
 class Ford extends Car{
   
    public void brand()
    {
     System.out.println("Brand: Ford");
    }
 }
 class model extends Ford{
    
 
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