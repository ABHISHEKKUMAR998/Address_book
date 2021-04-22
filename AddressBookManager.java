import java.util.Scanner;



  public class AddressBookManager {
   static {
    System.out.println("\t \t \t\t"+"WELCOME TO THE ADDRESS BOOK MANAGER");
   }
   String first_Name, last_Name,address,city,pincode,phoneNo,email;//Variable declaration
   Scanner s1;
	
   public AddressBookManager(Scanner s) { //Constructor
    s1=s;
    }
  public static void main(String[] args) {
   Scanner s= new Scanner(System.in);
   AddressBookManager address = new AddressBookManager(s); //Object Creation
   address.options(); //Method calling
  }
  
  void deleteContact()      
  {
      System.out.println("Enter the Contact name you want to DELETE");
      s1.nextLine();
   String name =s1.nextLine();
     if(name.equalsIgnoreCase(first_Name))
       {
      first_Name=null;
      last_Name=null;
      address=null;
      city=null;
      pincode=null;
      phoneNo=null;
      email=null;
         System.out.println("Name : " +first_Name + " " +last_Name +"\n"+ "Address : " +address+"\n"+ "City : "+city+"\n"+ "PinCode : "+pincode+"\n"+ "PhoneNo :"+phoneNo+"\n"+ "Email : "+ email);
       }
      else {
     System.out.println("No Contact Found");
         }
  }


   void addContact()
       {
     s1.nextLine();
     System.out.println("\t\t\t Enter the DETAILS");
    System.out.println("Enter the FirstName");
    first_Name = s1.nextLine();
   
    System.out.println("Enter the LastName");
    last_Name = s1.nextLine();
   
    System.out.println("Enter the Address");
    address = s1.nextLine();
   
    System.out.println("Enter the City");
    city = s1.nextLine();
   
    System.out.println("Enter the PinCode");
    pincode = s1.nextLine();
   
    System.out.println("Enter the PhoneNo");
    phoneNo = s1.nextLine();
    
    System.out.println("Enter the Email");
    email = s1.nextLine();
   
    System.out.println("Name : " +first_Name + " " +last_Name +"\n"+ "Address : " +address+"\n"+ "City : "+city+"\n"+ "PinCode : "+pincode+"\n"+ "PhoneNo :"+phoneNo+"\n"+ "Email : "+ email);
     
    options();
      }
   void editContact()
      {
     System.out.println("Enter the Contact name to be Edit");
     s1.nextLine();
     String name =s1.nextLine();
     if(name.equalsIgnoreCase(first_Name))
     {
      System.out.println("Enter the FirstName");
      first_Name = s1.nextLine();
     
      System.out.println("Enter the LastName");
      last_Name = s1.nextLine();
     
      System.out.println("Enter the Address");
      address = s1.nextLine();
     
      System.out.println("Enter the City");
      city = s1.nextLine();
     
      System.out.println("Enter the PinCode");
      pincode = s1.nextLine();
     
      System.out.println("Enter the PhoneNo");
      phoneNo = s1.nextLine();
      
      System.out.println("Enter the Email");
      email = s1.nextLine();
     
      System.out.println("Updated Contact Details");
      System.out.println("Name : " +first_Name + " " +last_Name +"\n"+ "Address : " +address+"\n"+ "City : "+city+"\n"+ "PinCode : "+pincode+"\n"+ "PhoneNo :"+phoneNo+"\n"+ "Email : "+ email);
      options(); 
      
     }
      else {
      System.out.println("No contact found:!!!");
       }
   }
   void options()
      {
      System.out.println("Select the option to be performed: Enter 1 to ADD the CONTACT, Enter 2 to EDIT, Enter 3 to DELETE the CONTACT, Enter 4 to EXIT ");
      int option =s1.nextInt();
      switch (option)
      {
      case 1:
       
       addContact();
       break;
       
      
      case 2:
       editContact();
       break;
      case 3:
       deleteContact();
       break;
      case 4:
       exit();
      default :
       System.out.println("Invalid Entry");
      }
      
   }
   void exit()
   {
   System.exit(0);
   }
	
   
}