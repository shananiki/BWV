package adapterpattern;

public class FahrenheitAdapter extends CelciusReporter implements CelciusReporterConverter{

    @Override
    public double getTemperatur(){
        return getTemperaturInF();
    }

    @Override
    public double getTemperaturInC() {
        return this.temperaturInC;
    }

    public double getTemperaturInF(){
        return (super.getTemperatur() * 1.8 + 32);
    }
}
