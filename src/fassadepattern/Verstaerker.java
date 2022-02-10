package fassadepattern;

public class Verstaerker implements EinAusSchaltbar{

    private int lautstaerke;
    private boolean isEingeschalten;

    @Override
    public void ein(){
        isEingeschalten = true;
        System.out.println("Verstärker eingeschalten.");
    }

    @Override
    public void aus(){
        isEingeschalten = false;
        System.out.println("Verstärker ausgeschalten.");
    }

    public boolean getEingeschalten(){
        return this.isEingeschalten;
    }

    public void setLautstärke(int l){
        this.lautstaerke = l;
    }

}
