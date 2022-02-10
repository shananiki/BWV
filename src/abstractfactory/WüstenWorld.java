package abstractfactory;

public class WüstenWorld extends AbstractWorld{

	AbstractSpielweltFabrik fk;
	
	public WüstenWorld(AbstractSpielweltFabrik fk) {
		super(fk);
		this.fk = fk;
	}

}
