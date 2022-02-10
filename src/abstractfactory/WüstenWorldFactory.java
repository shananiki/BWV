package abstractfactory;

import abstractfactory.w�stentiere.Kaktus;
import abstractfactory.w�stentiere.W�stenB�r;

public class W�stenWorldFactory extends AbstractSpielweltFabrik{

	@Override
	public AbstractWorld createWorld() {
		return new W�stenWorld(this);
	}

	@Override
	public AbstractTiere createTiere() {
		return new W�stenB�r();
	}

	@Override
	public AbstractPflanzen createPflanzen() {
		return new Kaktus();
	}

}
