class Building
{  
      String printDetails()
      {
          return null;
      }  
}  
  
class FirstBuilding extends Building
{  
    String printName()
      {
          return "Cyient Limited";
      } 

    int printNumOfFloors()
      {
          return 3;
      }   

    String printLocation()
      {
          return "Auto Nagar";
      } 
}  
  
class SecondBuilding extends Building
{  
    String printName()
      {
          return "Wipro Technologies Limited";
      } 

    int printNumOfFloors()
      {
          return 4;
      }   

    String printLocation()
      {
          return "It Park";
      } 
}  

class ThirdBuilding extends Building
{  
    String printName()
      {
          return "DMHO office";
      } 

    int printNumOfFloors()
      {
          return 5;
      }   

    String printLocation()
      {
          return "Main Road";
      } 
}  


public class Assignment2
{
    public static void main(String [] args) 
    {
          FirstBuilding bldg1 = new FirstBuilding();  
          SecondBuilding bldg2 = new SecondBuilding();  
          ThirdBuilding bldg3 = new ThirdBuilding();  

          System.out.println("The name of the first building is : "+bldg1.printName());  
          System.out.println("The first building is at location: "+bldg1.printLocation());  
          System.out.println("The no. of floors in first building is : "+bldg1.printNumOfFloors());  

          System.out.println("The name of the second building is : "+bldg2.printName());  
          System.out.println("The second building is at location: "+bldg2.printLocation());  
          System.out.println("The no. of floors in second building is : "+bldg2.printNumOfFloors()); 

          System.out.println("The name of the third building is : "+bldg3.printName());  
          System.out.println("The third building is at location: "+bldg3.printLocation());  
          System.out.println("The no. of floors in third building is : "+bldg3.printNumOfFloors()); 
          System.out.println("The details of third building is : "+bldg3.printDetails());
   }
}