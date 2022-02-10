package templatemethod;

import templatemethod.IWaffenverhalten.Waffenverhalten;

public class Koenigin extends Character{

	public Koenigin(Waffenverhalten waffe)
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
