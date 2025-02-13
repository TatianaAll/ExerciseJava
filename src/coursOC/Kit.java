package coursOC;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Kit {
	private List<Block> blocks = new ArrayList<Block>();
	private Set<String> keywords = new LinkedHashSet<String>();
	
	public Kit() {
		blocks.add(0, new Wall(true, 3, 2, 2));
		blocks.add(1, new Wall(true, 3, 2, 2));
		blocks.add(2, new Wall(false, 2, 1, 2));
		blocks.add(3, new Wall(false, 2, 1, 2));
		blocks.add(4, new Door(true, 1, 2, 2));
		
		keywords.add("cabane");
		keywords.add("muraille");
	}
	
	public void showKit() {
		System.out.println("Nombre de blocs dans le kit :" + blocks.size());
		for(String keyword : keywords) {
			System.out.println(keyword);
		}
	}
	
}
