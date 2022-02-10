package abstractfactory;

public class RegenwaldWorld extends AbstractWorld{

	AbstractSpielweltFabrik fk;
	
	public RegenwaldWorld(AbstractSpielweltFabrik fk) {
		super(fk);
		this.fk = fk;
	}
	
}
