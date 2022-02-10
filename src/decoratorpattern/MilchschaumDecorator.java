package decoratorpattern;

public class MilchschaumDecorator extends AbstractDecorator{

	public MilchschaumDecorator(AbstractGetraenkComponent agc) {
		super(agc);
		this.beschreibung = "Milchschaum";
		this.preis = 3;
	}
	
	
	
	
}
