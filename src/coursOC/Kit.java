package coursOC;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Kit {
	private List<Block> blocks = new ArrayList<Block>();
	private Set<String> keywords = new LinkedHashSet<String>();
	
	public Kit() {

	}
	
	public void showKit() {
		System.out.println("Nombre de blocs dans le kit :" + blocks.size());
		for(String keyword : keywords) {
			System.out.println(keyword);
		}
	}
	
	public Set<String> getKeywords() {
		return keywords;
	}
	
	public List<Block> getBlocks() {
		return blocks;
	}
	
}
