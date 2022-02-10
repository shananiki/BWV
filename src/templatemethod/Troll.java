package templatemethod;

import templatemethod.IWaffenverhalten.Waffenverhalten;

public class Troll extends Character{

	public Troll(Waffenverhalten waffe)
	{
		super(waffe);
	}
	
	@Override
	public void anzeigen()
	{
		super.anzeigen();
	}

	@Override
	public void fight()
	{
		this.waffe.benutzeWaffe();
	}

}
