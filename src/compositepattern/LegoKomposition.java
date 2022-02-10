package compositepattern;

import java.util.ArrayList;

public class LegoKomposition extends LegoBauteil{

	private ArrayList<LegoBauteil> teile;
	
	public LegoKomposition() {
		teile = new ArrayList<LegoBauteil>();
	}
	
	public LegoKomposition(ArrayList<LegoBauteil> teile) {
		this.teile = teile;
	}
	
	public void addLegoBauteil(LegoBauteil l) {
		this.teile.add(l);
	}
	
	public double calcPreis() {
		double preis = 0;
		for(LegoBauteil ls : this.teile) {
			preis += ls.getPreis();
		}
		return preis;
	}

	@Override
	public double getPreis() {
		return this.calcPreis();
	}
	
}
