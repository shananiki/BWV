package compositepattern;

import java.util.ArrayList;

public class LegoGebäude {

	private ArrayList<LegoBauteil> einzelTeile;
	private ArrayList<LegoKomposition> fertigBauteile;
	
	public LegoGebäude() {
		this.einzelTeile = new ArrayList<LegoBauteil>();
		this.fertigBauteile = new ArrayList<LegoKomposition>();
	}
	
	public LegoGebäude(ArrayList<LegoBauteil> einzelTeile, ArrayList<LegoKomposition> fertigBauteile) {
		this.einzelTeile = einzelTeile;
		this.fertigBauteile = fertigBauteile;
	}
	
	public double calcPreis() {
		double preis = 0; 
		for(LegoBauteil ls : einzelTeile) {
			preis += ls.getPreis();
		}
		for(LegoKomposition fb : fertigBauteile) {
			preis += fb.calcPreis();
		}
		return preis;
	}
	
	public boolean addStein(LegoBauteil l) {
		if(l != null) {
			this.einzelTeile.add(l);
			return true;
		}
		return false;
	}
	
	public boolean addBauteile(LegoKomposition fb) {
		if(fb != null) {
			this.fertigBauteile.add(fb);
			return true;
		}
		return false;
	}
	
	
}
