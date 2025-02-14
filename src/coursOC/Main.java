package coursOC;


public class Main {

	public static void main(String[] args) {
		try { 
			Wall newWall = new Wall(true, 0,0,3);
			System.out.println(newWall);
		} catch(IllegalArgumentException exception) {
			System.out.println("longueur, hauteur ou largeur d'un bloc doivent être supérieure à 1");
		}
		
		Kit kit = new Kit();
		try {
			int numberBlocks = kit.getBlocks().size();
			System.out.println("il y a " + numberBlocks + " blocks dans le kit");
		} catch(NullPointerException exception) {
			System.out.println("pas de blocks trouvé ans le kit");
		}
	}
	
}
