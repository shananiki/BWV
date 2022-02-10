package templatemethod.IWaffenverhalten;


public class Schwertschwingen extends Waffenverhalten{


	@Override
	public void vorbereiten() {
		System.out.println("Es wird mit dem Schwert ausgeholt.");
	}

	@Override
	public void benutzen() {
		System.out.println("Das Schwert wurde geschwungen.");
		
	}
}
