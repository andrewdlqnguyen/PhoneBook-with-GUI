
public class BuddyInfo {
	
	String name;
	String address;
	int phoneNumber;

	BuddyInfo(String name,String address,int phoneNumber)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo buddy = new BuddyInfo("Tom","Carleton",1234);
		buddy.setName("Homer");
		System.out.println("Hello " + buddy.getName() + "!");
	}

}
