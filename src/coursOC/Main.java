package coursOC;


public class Main {

	public static void main(String[] args) {
		Door doorLocked = new Door(true, 2,2,1);
		try {
			doorLocked.lockTheDoor();
		} catch(LockedDoorException exception) {
			System.out.println("la porte est déjà verouillée.");
		}
	}
}
