package templatemethod;

import templatemethod.IWaffenverhalten.Waffenverhalten;

public class Ritter extends Character{

	public Ritter(Waffenverhalten waffe)
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
