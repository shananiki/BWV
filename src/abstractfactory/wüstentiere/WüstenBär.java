package abstractfactory.w�stentiere;

import abstractfactory.AbstractTiere;

public class W�stenB�r extends AbstractTiere{
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public W�stenB�r() {
		this.name = "W�stenb�r";
	}
	
	
	
}
