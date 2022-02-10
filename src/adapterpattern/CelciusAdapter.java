package adapterpattern;

public class CelciusAdapter  extends CelciusReporter implements CelciusReporterConverter{

    public double getTemperaturInC(){
        return this.temperaturInC;
    }

    @Override
    public double getTemperaturInF() {
        return (this.getTemperatur() * 1.8 + 32);
    }

}
