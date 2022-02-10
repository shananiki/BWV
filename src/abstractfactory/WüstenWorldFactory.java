package abstractfactory;

import abstractfactory.wüstentiere.Kaktus;
import abstractfactory.wüstentiere.WüstenBär;

public class WüstenWorldFactory extends AbstractSpielweltFabrik{

	@Override
	public AbstractWorld createWorld() {
		return new WüstenWorld(this);
	}

	@Override
	public AbstractTiere createTiere() {
		return new WüstenBär();
	}

	@Override
	public AbstractPflanzen createPflanzen() {
		return new Kaktus();
	}

}
