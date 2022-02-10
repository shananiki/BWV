package decoratorpattern;

public abstract class AbstractGetraenkComponent {
	
	protected String beschreibung;
	protected int preis;

	public AbstractGetraenkComponent() {
		this.preis = 5;
		this.beschreibung = "Basis Getraenk";
	}
	
	public int getPreis() {
		return this.preis;
	}
	
	public String getBeschreibung() {
		return this.beschreibung; 
	}

	
}
