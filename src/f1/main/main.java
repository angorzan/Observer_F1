package f1.main;

import f1.user.User;

public class main {

	public static void main(String[] args) {
		User user1 = new User("Tyrion Lannister", "761905692");

		user1.registerForOnlineApp(user1);
		user1.deregisterForOnlineApp(user1);
		user1.registerForSMS(user1);
		user1.deregisterForSMS(user1);

	}

}
