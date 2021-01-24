package f1.app;

import f1.user.User;

public class AppOnline {

	public static AppOnline instance;
	private String onlineBroadcast = "Let's watch the online broadcast";

	private AppOnline() {
		this.onlineBroadcast = onlineBroadcast;
	}

	public static AppOnline register(User user) {
		if (instance == null) {
			instance = new AppOnline();
			System.out.println(user.getName() + " You have just been registered for online broadcast");
		} else {
			System.out.println(user.getName() + " You were already registered  for online broadcast");
		}
		return instance;
	}

	public static AppOnline deregister(User user) {
		if (instance != null) {
			instance = null;
			System.out.println(user.getName() + " You have been checked out from online broadcast");
		} else {
			System.out.println(user.getName() + " You are not registered for online broadcast");
		}
		return instance;
	}

	public String getOnlineBroadcast() {
		return onlineBroadcast;
	}
}
