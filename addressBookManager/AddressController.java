package addressBookManager;

import java.util.List;
import java.util.Scanner;

public class AddressController {
	IAddressBookService addressBookService = new AdressService();
	Contact	contact;
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		new AddressController().userInput();

	}

	public void userInput() {
		System.out.println("Select the option to be performed:  Enter 1 to ADD the CONTACT, Enter 2 to EDIT, Enter 3 to DELETE the CONTACT, Enter 4 to EXIT ,Enter 5 to   ");
		int option =scanner.nextInt();
		switch (option)
		{
		case 1:

			scanner.nextLine();
			System.out.println("\t\t\t Enter the DETAILS");
			System.out.println("Enter the FirstName");
			String first_Name = scanner.nextLine();

			System.out.println("Enter the LastName");
			String last_Name = scanner.nextLine();

			System.out.println("Enter the Address");
			String address = scanner.nextLine();

			System.out.println("Enter the City");
			String city = scanner.nextLine();

			System.out.println("Enter the PinCode");
			String pincode = scanner.nextLine();

			System.out.println("Enter the PhoneNo");
			String phoneNo = scanner.nextLine();

			System.out.println("Enter the Email");
			String email = scanner.nextLine();

			contact = new Contact(first_Name,last_Name,address,city,pincode,phoneNo,email);
			addressBookService.addContact(contact);
			userInput();
			break;


		case 2:
			
			System.out.println("Enter the name ");
			String contactName = scanner.nextLine();
			scanner.nextLine();
			 System.out.println("Enter the FirstName");
			 String first_Name1 = scanner.nextLine();
			
			 System.out.println("Enter the LastName");
			 String last_Name1 = scanner.nextLine();
			
			 System.out.println("Enter the Address");
			 String address1 = scanner.nextLine();
			
			 System.out.println("Enter the City");
			 String city1 = scanner.nextLine();
			
			 System.out.println("Enter the PinCode");
			 String pincode1 = scanner.nextLine();
			
			 System.out.println("Enter the PhoneNo");
			 String phoneNo1 = scanner.nextLine();
			 
			 System.out.println("Enter the Email");
			 String email1 = scanner.nextLine();
			 
			addressBookService.editContact(contactName,first_Name1,last_Name1,address1,city1,pincode1,phoneNo1,email1);
				userInput();
			break;
		case 3:

			System.out.println("Enter the name ");
			String contactName1 = scanner.nextLine();
			
			
			addressBookService.deleteContact(contactName1);


			break;

		case 4:
			exit();

		case 5:

			List<Contact> contactlist=addressBookService.showData();
			for (int i = 0; i < contactlist.size(); i++) {
				System.out.println(contactlist);
			}
			userInput();
			
			break;
		default :
			System.out.println("Invalid Entry");
		}

	}




	private void exit() {

		System.exit(0);
	}


}
