package decoratorpattern;

public class HausmischungComponent extends AbstractGetraenkComponent{

	//Konkrete Komponente
	public HausmischungComponent() {
		this.preis = 10;
		this.beschreibung = "Hausmischung";
	}
	
}
