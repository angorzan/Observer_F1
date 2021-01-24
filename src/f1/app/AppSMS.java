package f1.app;

import f1.user.User;

public class AppSMS {
	
	private static AppSMS instance;
	private String infoSMS = "SMS: F1 is the best";
	
	private AppSMS() {
		this.infoSMS = infoSMS;
	}
	
	public String getInfoSMS() {
		return infoSMS;
	}
	
	public static AppSMS register(User user) {
		if (instance == null) {
			instance = new AppSMS();
			System.out.println(user.getName() + " You have just been registered for SMS notifications to the phone number: " + user.getPhone());
		} else {
			System.out.println(user.getName() + " You were already registered  for SMS notifications to the phone number: " + user.getPhone());
		}
		return instance;
	}

	public static AppSMS deregister(User user) {
		if (instance != null) {
			instance = null;
			System.out.println(user.getName() + " You have been checked out from SMS notifications");
		} else {
			System.out.println(user.getName() + " You are not registered for SMS notifications");
		}
		return instance;
	}
}
