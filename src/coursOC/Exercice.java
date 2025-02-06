package coursOC;

public class Exercice {

	public static void main(String[] args) {
		
		int num;
		num = 5;
		
		final int immutable = 20;
		
		String language = "Français";
		String phrase = "La langue choisie est : " + language;
		//System.out.println(phrase);
		
		int[] arrayInt = {1,3,5};
		arrayInt[0] = 10;
		
		//Main.display("Tatiana");
		
		//Main.meteoComment("brouillard");
		
		//System.out.println(Main.filmCategory("Indiana Jones"));
		
		int[] arrayNumber = {0, 1, 2, 3, 4, 5, 6};
		int numberOf0 = 0;
		for (int number : arrayNumber) {
			if (number == 0) {
				numberOf0++;
			}
		}
		System.out.println(numberOf0);
	}
	
	//my first function
	public static void firstFunction(String text) {
		System.out.println(text);
	};
	public static int addition(final int integer1, final int integer2) {
		return integer1 + integer2;
	};
	
	
	public static void display(final String text) {
		System.out.println("Bonjour " + text);
	}

	public static void meteoComment(final String meteo) {
		//use of switch in Java instead of if/else if/else
		switch(meteo) {
		case "soleil" -> System.out.println("il fait beau");
		case "nuage" -> System.out.println("c'est couvert");
		case "brouillard" -> System.out.println("On y voit comme à travers une pelle");
		default -> System.out.println("information non communiquée");
		}
	}
	
	public static String filmCategory(final String film) {
		var filmResults = switch(film) {
		case "Dune" -> "SF";
		case "La petite sirène", "Chihiro" -> "Dessin animé";
		case "Indiana Jones" -> {
			String category = "aventure";
			yield category;
		}
		default -> "Non renseigné";
		};
		return filmResults;
	}
}
