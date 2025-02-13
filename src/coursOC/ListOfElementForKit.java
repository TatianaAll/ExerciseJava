package coursOC;


//Generic type define with <T>
public class ListOfElementForKit<T> {
	private T[] list;
	
	//The constructor needs the quantity of block in the list
	public ListOfElementForKit(Class<T> chosenClass, int quantity) {
		this.list = (T[]) Array.newInstance(chosenClass, quantity);
	}
	
	//add a block in the list
	public void addElementInList(int indice, T value) {
		this.list[indice] = value;
	}
	//get a block in the list
	public T getSpecificElement(int indice) {
		return this.list[indice];
	}
}
