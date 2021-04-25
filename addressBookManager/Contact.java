package addressBookManager;

public class Contact {
	public String first_Name,  last_Name,  address,  city,  pincode,  phoneNo;
	public String email;

	public Contact(String first_Name, String last_Name, String address, String city, String pincode, String phoneNo,
			String email) {
		
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contact [first_Name=" + first_Name + ", last_Name=" + last_Name + ", address=" + address + ", city="
				+ city + ", pincode=" + pincode + ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}
	 
	

}
