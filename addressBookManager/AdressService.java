package addressBookManager;

import java.util.ArrayList;
import java.util.List;


public  class AdressService implements  IAddressBookService {
	public List<Contact> list ;

	public AdressService() {
		list = new ArrayList<Contact>();

	}

	@Override
	public boolean addContact(Contact contact) {

		list.add(contact);

		return false;
	}


	public boolean deleteContact(String contactName1) {
		for (int i = 0; i < list.size(); i++) {
			if(contactName1.equalsIgnoreCase(list.get(i).first_Name));
			list.remove(i);
			return true;
		}

		return false;
	}



	@Override
	public  List<Contact> showData() {

		return list;


	}
	public boolean editContact(String contactName, String first_Name1, String last_Name1, String address1, String city1,
			String pincode1, String phoneNo1, String email1) {
		for (int i = 0; i < list.size(); i++) {
			boolean num = list.get(i).first_Name.equalsIgnoreCase(contactName);
			if(num)
			{


				return true;	
			}

		}
		return true;

	}


}
