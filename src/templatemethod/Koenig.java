package templatemethod;

import templatemethod.IWaffenverhalten.Waffenverhalten;

public class Koenig extends Character{

	public Koenig(Waffenverhalten waffe)
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
