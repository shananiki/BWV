package compositepattern;

public class Main {

	public static void main(String[] args) {
	
		//Alter weg das wollen wir besser machen:
		
		//Haus
		LegoGebäude haus = new LegoGebäude();
		
		//Fenster
		LegoKomposition fenster = new LegoKomposition();
		
		//Fensterteil 1: 10€
		fenster.addLegoBauteil(new Legostein(10));
		
		//Fensterteil 2: 25€
		fenster.addLegoBauteil(new Legostein(25));
		
		//Das Fenster kommt in das Haus
		haus.addBauteile(fenster);
		
		//Wir fügen noch einen einzelnen Stein hinzu
		haus.addStein(new Legostein(200));
		
		System.out.println(haus.calcPreis());
		
		//===========================================//
		// Die bessere Lösung mit einem shared parent
		//===========================================//
		
		LegoKomposition haus2 = new LegoKomposition();
		
		LegoKomposition fenster2 = new LegoKomposition();
		
		fenster2.addLegoBauteil(new Legostein(200));
		
		haus2.addLegoBauteil(fenster2);
		haus2.addLegoBauteil(new Legostein(300));
		
		System.out.println(haus2.calcPreis());
		
		
		
	}

}
