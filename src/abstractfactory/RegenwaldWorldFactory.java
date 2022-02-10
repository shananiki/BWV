package abstractfactory;

import abstractfactory.wüstentiere.JungleBaum;
import abstractfactory.wüstentiere.Urwaldmensch;

public class RegenwaldWorldFactory extends AbstractSpielweltFabrik{

	@Override
	public AbstractWorld createWorld() {
		return new RegenwaldWorld(this);
	}

	@Override
	public AbstractTiere createTiere() {
		return new Urwaldmensch();
	}

	@Override
	public AbstractPflanzen createPflanzen() {
		return new JungleBaum();
	}

}

