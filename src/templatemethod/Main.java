package templatemethod;

import java.util.ArrayList;

import templatemethod.IWaffenverhalten.Axtschlagen;
import templatemethod.IWaffenverhalten.Bogenschiessen;
import templatemethod.IWaffenverhalten.Messerstechen;
import templatemethod.IWaffenverhalten.Schwertschwingen;

public class Main {

	public static void main(String[] args) 
	{
		ArrayList<Character> characters = new ArrayList<Character>();
		
		characters.add(new Troll(new Axtschlagen()));
		characters.add(new Koenig(new Axtschlagen()));
		characters.add(new Koenigin(new Axtschlagen()));

		
		for(Character c : characters) 
		{
			c.anzeigen();
			c.fight();
			c.setWaffe(new Schwertschwingen());
		}
		
		for(Character c : characters)
		{
			System.out.println("\nWir wechseln jetzt die Waffe zu einem Messer.\n");
			c.setWaffe(new Messerstechen());
			c.anzeigen();
			c.fight();
			System.out.println("\nWir wechseln jetzt die Waffe zu einem Bogen.\n");
			c.setWaffe(new Bogenschiessen());
			c.anzeigen();
			c.fight();
		}
	}

}
