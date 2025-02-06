package coursOC;

public class Wall extends Block {
	
	private boolean bearingWall;
	
	Wall(final boolean bearingWall, final int length, final int width, final int height) {
		//took the valor of Block --> inherit from Block
		super(length, width, height);
		this.color = Color.GREY;
		this.bearingWall =  bearingWall;
	}
	
	
	public boolean isPassable() {
		//return !bearingWall;
		if(this.bearingWall) {
			return false;
		} 
		return true;
	}
}
