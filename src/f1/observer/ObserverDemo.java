package f1.observer;


public class ObserverDemo {

	public static void main(String[] args) {		
		Channel channel = new Channel();
		User TyrionL = new User(channel, "Tyrion Lannister", "603987465");
		User JaimieL = new User(channel, "Jaimie Lannister", "606567678");
		channel.attach(TyrionL);
		channel.attach(JaimieL);
		channel.publishChanelInfo("new info about F1");
		channel.detach(TyrionL);
	}

}
