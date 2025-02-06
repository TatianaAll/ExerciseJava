package coursOC;

public class Door extends Block {

	private boolean locked;
	
	Door(final boolean locked, final int length, final int width, final int height) {
		//took the valor of Block --> inherit from Block
		super(length, width, height);
		this.locked =  locked;
		this.color = Color.BLUE;
		}
	
	protected boolean isLocked() {
		if(locked) {
			return true;
		} else return false;
	}
	
}
