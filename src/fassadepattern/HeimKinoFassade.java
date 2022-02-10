package fassadepattern;

public class HeimKinoFassade implements  EinAusSchaltbar{

    private CdSpieler cdSpieler;
    private Verstaerker verstärker;

    public HeimKinoFassade(){
        this.verstärker = new Verstaerker();
        this.cdSpieler = new CdSpieler(this.verstärker);
    }

    @Override
    public void ein() {
        System.out.println("HeimKinoFassade sagt: EIN");
        this.verstärker.ein();
        this.verstärker.setLautstärke(10);
        this.cdSpieler.ein();
    }

    @Override
    public void aus() {
        System.out.println("HeimKinoFassade sagt: AUS");
        this.verstärker.setLautstärke(0);
        this.verstärker.aus();
        this.cdSpieler.aus();
    }
}
