package decoratorpattern;

public class Main {

	public static void main(String[] args) {
		
		//10€
		AbstractGetraenkComponent getraenk1 = new HausmischungComponent();
		System.out.println(getraenk1.getBeschreibung() + " " + getraenk1.getPreis() + "€");
		
		//10€ + 3€
		MilchschaumDecorator msd = new MilchschaumDecorator(new HausmischungComponent());
		System.out.println(msd.getBeschreibung() + " " + msd.getPreis() + "€");
		
		
		//10€ + 3€ + 2€
		SchokoDecorator sd = new SchokoDecorator(new MilchschaumDecorator(new HausmischungComponent()));
		System.out.println(sd.getBeschreibung() + " " + sd.getPreis() + "€");
	}

}
