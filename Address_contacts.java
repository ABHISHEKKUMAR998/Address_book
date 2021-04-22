import java.util.Scanner;

class Address {
	private String firstName;
	private String lastName;
    private String street;
    private String city;
    private String phoneNo;
    private String postalCode;
    private String email;
     Address(){
    	 
     }
     
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getlastName() {
	return lastName;
}
public void setlastName(String lastName) {
	this.lastName = lastName;
}
public String getstreet() {
	return street;
}
public void setstreet(String street) {
	this.street = street;
}
public String getcity() {
	return city;
}
public void setcity(String city) {
	this.city = city;
}
public String getphoneNo() {
	return phoneNo;
}
public void setphoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
public String getpostalCode() {
	return postalCode;
}
public void setpostalCode(String postalCode) {
	this.postalCode = postalCode;
}
public String getemail() {
	return email;
}
public void setemail(String email) {
	this.email = email;
}
public void printAdress() {
	 System.out.println(getFirstName());
	 System.out.println(getlastName());
	 System.out.println(getstreet());
	 System.out.println(getcity());
	 System.out.println(getphoneNo());
	 System.out.println(getpostalCode());
	 System.out.println(getemail());
}
 }

public class Address_contacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO ADDRESS BOOK");
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter name");
		 String name = myObj.nextLine();
		 System.out.println("Enter lstname");
		 String last = myObj.nextLine();
		 System.out.println("Enter city");
		 String city = myObj.nextLine();
		 System.out.println("Enter email");
		 String email = myObj.nextLine();
		 System.out.println("Enter street");
		 String street = myObj.nextLine();
		 System.out.println("Enter zipcode");
		 String pin = myObj.nextLine();
		 System.out.println("Enter contactno");
		 String phno = myObj.nextLine();
		Address d=new Address();
		d.setFirstName(name);
		d.setcity(city);
		d.setemail(email);
		d.setlastName(last);
		d.setphoneNo(phno);
		d.setpostalCode(pin);
		d.setstreet(street);
		d.printAdress();
		
		
	}

}
