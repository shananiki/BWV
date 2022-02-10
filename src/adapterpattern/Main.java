package adapterpattern;

public class Main
{

    public static void main(String[] args) {
        CelciusAdapter tempInC = new CelciusAdapter();
        tempInC.setTemperatur(10);
        FahrenheitAdapter tempInF = new FahrenheitAdapter();
        tempInF.setTemperatur(10);

        System.out.println("Temp in C:" + tempInC.getTemperatur());
        System.out.println("Temp in F:" + tempInF.getTemperatur());


    }

}
