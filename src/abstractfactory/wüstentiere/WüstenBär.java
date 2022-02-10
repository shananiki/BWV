package abstractfactory.wüstentiere;

import abstractfactory.AbstractTiere;

public class WüstenBär extends AbstractTiere{
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WüstenBär() {
		this.name = "Wüstenbär";
	}
	
	
	
}
