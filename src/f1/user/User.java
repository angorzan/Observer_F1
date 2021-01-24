package f1.user;

import f1.app.App;

public class User {
	private String name;
	private String email;
	private String phone;
	
	public User(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static void register(User user) {
		App app = App.register(user);
	}
	
	public static void deregister(User user) {
		App app = App.deregister(user);
		
	}
	
	public static void main(String[] args) {
		User user1 = new User("Anna D", "ad@www.pl", "761905692");
		User user2 = new User("Jan K", "jk@www.pl", "679327890");
		user1.register(user1);
		user1.deregister(user1);
		user1.register(user2);
		
	}

}
