package templatemethod.IWaffenverhalten;

public abstract class Waffenverhalten {

	public final void benutzeWaffe() {
		vorbereiten();
		benutzen();
	}
	
	public abstract void vorbereiten();
	
	public abstract void benutzen();
	
}
