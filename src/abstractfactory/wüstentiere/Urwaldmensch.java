package abstractfactory.wüstentiere;

import abstractfactory.AbstractTiere;

public class Urwaldmensch  extends AbstractTiere{
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Urwaldmensch() {
		this.name = "Urwaldmensch";
	}
	
	
}
