import java.util.ArrayList;
import java.util.List;



public class AddressBook {
	private List<BuddyInfo> buddyInfo;
	
	public AddressBook() {
		this.buddyInfo = new ArrayList<>();
	}
	
	public void addBuddy(BuddyInfo aBuddyInfo) {
		if (aBuddyInfo != null) {
			this.buddyInfo.add(aBuddyInfo);
		}
	}
	
	public String getAddressBookList() {
		int count = 1;
		String result = "";
		for (BuddyInfo b: buddyInfo) {
			result += count + ": " + b.getName() + ", " + b.getAddress() + ", " + b.getPhoneNumber() + "\n";
			count++;
		}
		return result;
	}
	
	public BuddyInfo removeBuddy(int index) {
		if (index >= 0 && index < this.buddyInfo.size()) {
			return this.buddyInfo.remove(index);
		}
		return null;
	}
	
	public static void main(String args[]) {
		System.out.println("Address Book!");
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "647 999 1230");
		BuddyInfo buddy2 = new BuddyInfo("Andrew", "105 Arlington", "416 669 9668");
		BuddyInfo buddy3 = new BuddyInfo("Nick", "89 Turner", "905 670 2426");
		
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.addBuddy(buddy2);
		addressBook.addBuddy(buddy3);
		addressBook.getAddressBookList();
//		addressBook.removeBuddy(0);
		
		GUI gui = new GUI(addressBook);
	}
}

