package decoratorpattern;

public class AbstractDecorator extends AbstractGetraenkComponent{
	
	protected AbstractGetraenkComponent getraenk;
	
	public AbstractDecorator(AbstractGetraenkComponent getraenk) {
		this.getraenk = getraenk;
	}
	
	@Override
	public int getPreis() {
		if(this.getraenk != null) {
			return super.getPreis() + this.getraenk.getPreis();
		}
		return super.getPreis();
	}
	
}
