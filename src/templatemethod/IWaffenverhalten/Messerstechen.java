package templatemethod.IWaffenverhalten;

public class Messerstechen extends Waffenverhalten{


	@Override
	public void vorbereiten() {
		System.out.println("Das Messer wurde gezogen.");
	}

	@Override
	public void benutzen() {
		System.out.println("Es wurde mit dem Messer zugestochen.");
	}
}
