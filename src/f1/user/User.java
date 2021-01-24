package f1.user;

import f1.app.*;

public class User {
	private String name;
	private String phone;

	public User(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public void deregisterForSMS(User user) {
		AppSMS appSMS = AppSMS.deregister(user);

	}
	
	public void deregisterForOnlineApp(User user) {
		AppOnline app = AppOnline.deregister(user);

	}
	
	public void registerForSMS(User user) {
		AppSMS appSMS = AppSMS.register(user);
		System.out.println(appSMS.getInfoSMS());
	}

	public void registerForOnlineApp(User user) {
		AppOnline app = AppOnline.register(user);
		System.out.println(app.getOnlineBroadcast());
	}
}
