package abstractfactory;

public class Main {

	public static void main(String[] args) {
		AbstractWorld world1 = new WüstenWorldFactory().createWorld();
		
		AbstractWorld world2 = new RegenwaldWorldFactory().createWorld();
		
		world1.prepareWorld();
		world2.prepareWorld();
		
		System.out.println("Welt 1: " + world1.getTiere().getName());
		System.out.println("Welt 1: " + world1.getPflanzen().getName());
		
		System.out.println("Welt 2: " + world2.getTiere().getName());
		System.out.println("Welt 2: " + world2.getPflanzen().getName());
		
		
	}

}
