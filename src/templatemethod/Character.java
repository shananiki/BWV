package templatemethod;

import templatemethod.IWaffenverhalten.Messerstechen;
import templatemethod.IWaffenverhalten.Waffenverhalten;

public abstract class Character {

	protected Waffenverhalten waffe;
	
	
	public Character(Waffenverhalten waffe)
	{
		this.setWaffe(waffe);
	}
	
	public void setWaffe(Waffenverhalten waffe)
	{
		if(waffe != null) {
			this.waffe = waffe;
		}else {
			this.setWaffe(new Messerstechen());
		}
	}
	
	public void anzeigen()
	{
		System.out.println("Ich bin: " + this.getClassName());
	}
	
	public abstract void fight();
	
    private String getClassName()
    {
        String name[] = this.getClass().getName().split("\\.");
        return name[name.length - 1];
    }
	
}
