public class EnviroNotFriendly extends Exception {
	public EnviroNotFriendly(String message) {
		super("EnviroNotFriendly: " + message);
	}
	
	public EnviroNotFriendly() {
		super("EnviroNotFriendly: Should be less than 10 and not gas or diesel ");
	}
}
