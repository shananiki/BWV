package abstractfactory;

public class AbstractPflanzen {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AbstractTiere createTiere() {
		return null;
	}
}
