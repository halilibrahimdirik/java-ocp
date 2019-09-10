package chapter2;

//Lazy instantiation
public class VisitorTicketTracker {
	private final VisitorTicketTracker instance;

	private VisitorTicketTracker() {
		instance = new VisitorTicketTracker();
	}

	// public static VisitorTicketTracker getInstance() {
	// if (instance == null) {
	// instance = new VisitorTicketTracker(); // NOT THREAD-SAFE!
	// }
	// return instance;
	// }
	// Data access methods
}
