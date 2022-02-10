package abstractfactory;

public class AbstractWorld {

	protected AbstractSpielweltFabrik fabrik;
	
	private AbstractPflanzen pflanzen;
	
	private AbstractTiere tiere;
	
	private int radius;
	
	public AbstractWorld(AbstractSpielweltFabrik fk) {
		this.fabrik = fk;
	}
	
	public void prepareWorld() {
		this.radius = 5;
		setPflanzen(this.fabrik.createPflanzen());
		setTiere(this.fabrik.createTiere());
	}
	
	public AbstractPflanzen getPflanzen() {
		return pflanzen;
	}

	public void setPflanzen(AbstractPflanzen pflanzen) {
		this.pflanzen = pflanzen;
	}

	public AbstractTiere getTiere() {
		return tiere;
	}

	public void setTiere(AbstractTiere tiere) {
		this.tiere = tiere;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
