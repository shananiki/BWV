package abstractfactory.wüstentiere;

import abstractfactory.AbstractPflanzen;

public class Kaktus  extends AbstractPflanzen{
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Kaktus() {
		this.name = "Kaktus";
	}
	
	

}
