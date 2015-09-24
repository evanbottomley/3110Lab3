
public class BuddyInfo {

	String buddyName;
	String buddyAddress;
	String phoneNumber;
	
	public String getBuddyName() {
		return buddyName;
	}

	public void setBuddyName(String buddyName) {
		this.buddyName = buddyName;
	}

	public String getBuddyAddress() {
		return buddyAddress;
	}

	public void setBuddyAddress(String buddyAddress) {
		this.buddyAddress = buddyAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo homer = new BuddyInfo();
		homer.setBuddyName("Homer");
		homer.setBuddyAddress("123 Springfield Drive");
		homer.setPhoneNumber("613-888-7667");
		System.out.println("Hello, " + homer.getBuddyName() + "!");
	}

}
