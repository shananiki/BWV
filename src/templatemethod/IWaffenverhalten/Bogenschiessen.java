package templatemethod.IWaffenverhalten;

public class Bogenschiessen extends Waffenverhalten{


	@Override
	public void vorbereiten() {
		System.out.println("Der Bogen wird gespannt.");
		
	}

	@Override
	public void benutzen() {
		System.out.println("Der Bogen wurde geschossen.");
	}
}
