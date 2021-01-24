package f1.app;

import f1.user.User;

public class App {
	
	private static App instance;
	
	private App() {
	}

	public static App register(User user) {
		if (instance == null) {
			instance = new App();
			System.out.println(user.getName() + " You have just been registered");
		} else {
			System.out.println(user.getName() + " You were already registered");
		}		
		return instance;
	}

	public static App deregister(User user) {
		if (instance != null) {
			instance = null;
			System.out.println(user.getName() + " You have been checked out");
		} else {
			System.out.println(user.getName() + " You are not registered");
		}
		return instance;
	}

//	public static void main(String[] args) {
//		App app = App.register();
//		App app2 = App.deregister();
//	}

}
