package coursOC;

//An abstract class is not implementable by its own, its need to have an heritage
//and this class implements an interface = the pattern of the class
public abstract class Block implements IBlock {
	protected int length;
	protected int width;
	protected int height;
	protected Color color;
	
	protected Block(final int length, final int width, final int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public int getLenght() {
		return this.length;
	}
	public int getWidth() {
		return this.width;
	}	
	public int getHeight() {
		return this.height;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
}
