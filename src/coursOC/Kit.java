package coursOC;


public class Kit {
	private ListOfElementForKit<Block> blocks;
	private ListOfElementForKit<String> keywords;
	
	public Kit() {
		ListOfElementForKit<Block> blocks = new ListOfElementForKit<Block>(Block.class, 5);
		blocks.addElementInList(0, new Wall(true, 1, 1, 1));
		blocks.addElementInList(1, new Wall(true, 1, 1, 1));
		blocks.addElementInList(2, new Wall(true, 1, 1, 1));
		blocks.addElementInList(3, new Wall(true, 1, 1, 1));
		blocks.addElementInList(4, new Door(false, 1, 1, 1));
		
		ListOfElementForKit<String> keywords = new ListOfElementForKit<String>(String.class, 2);
		keywords.addElementInList(0, "cabane");
		keywords.addElementInList(1, "muraille");
	}
	
}
