import java.util.*;
public class AddressBook {
	private ArrayList<BuddyInfo> friends;
	
	public AddressBook() {
		friends = new ArrayList<BuddyInfo>();		
	}
	public void addBuddy(BuddyInfo b) {
		friends.add(b);
	}
	public void removeBuddy(BuddyInfo b) {
		friends.remove(b);
	}
	public void printBook() {
		System.out.println("Address book contains " + friends.size() + " friend(s).");
		for (int i = 0; i < friends.size(); i++) {
			BuddyInfo buddy = friends.get(i);
			System.out.println(buddy.getBuddyName() + "  " + buddy.getBuddyAddress() + "  " + buddy.getPhoneNumber());
		}
	}
	public static void main(String[] args) {
		BuddyInfo homer = new BuddyInfo();
		homer.setBuddyName("Homer");
		homer.setBuddyAddress("123 Springfield Drive");
		homer.setPhoneNumber("613-888-7667");
		AddressBook book = new AddressBook();
		book.addBuddy(homer);
		book.printBook();
		book.removeBuddy(homer);
		System.out.println("Removed friend. Book should now be empty.");
		book.printBook();
		System.out.println("Test Complete.");
	}
}
