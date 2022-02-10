package adapterpattern;

public class CelciusReporter {


    protected double temperaturInC;

    public CelciusReporter(){

    }

    public double getTemperatur(){
        return this.temperaturInC;
    }

    public void setTemperatur(double temperaturInC){
        this.temperaturInC = temperaturInC;
    }



}
