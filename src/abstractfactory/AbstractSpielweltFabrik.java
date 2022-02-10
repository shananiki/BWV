package abstractfactory;

public abstract class AbstractSpielweltFabrik {

	public abstract AbstractWorld createWorld();
	
	public abstract AbstractTiere createTiere();
	
	public  abstract AbstractPflanzen createPflanzen();
}
