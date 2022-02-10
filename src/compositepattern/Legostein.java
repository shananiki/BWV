package compositepattern;

public class Legostein extends LegoBauteil{

	private String farbe;
	private int groesse;
	private double price;
	
	
	public Legostein() {
		
	}
	
	public Legostein(double preis) {
		this.setPreis(preis);
	}
	
	public void setPreis(double d) {
		if(d > 0 && d < 100000)
			this.price = d;
	}
	
	@Override
	public double getPreis() {
		return this.price;
	}


	
	
}
