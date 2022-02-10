package decoratorpattern;

public class SchokoDecorator extends AbstractDecorator{


	public SchokoDecorator(AbstractGetraenkComponent agc) {
		super(agc);
		this.beschreibung = "Schoko";
		this.preis = 2;
	}
	
	
}
