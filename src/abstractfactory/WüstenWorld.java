package abstractfactory;

public class W�stenWorld extends AbstractWorld{

	AbstractSpielweltFabrik fk;
	
	public W�stenWorld(AbstractSpielweltFabrik fk) {
		super(fk);
		this.fk = fk;
	}

}
