package templatemethod.IWaffenverhalten;

public class Axtschlagen extends Waffenverhalten{


	@Override
	public void vorbereiten() {
		System.out.println("Es wird mit der Axt ausgeholt.");
		
	}

	@Override
	public void benutzen() {
		System.out.println("Die Axt wurde geschwungen.");
	}
}
