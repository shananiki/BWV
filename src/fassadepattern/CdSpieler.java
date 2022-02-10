package fassadepattern;

public class CdSpieler implements EinAusSchaltbar {

    private Verstärker verstärker;

    public CdSpieler(Verstärker verstärker){
        this.verstärker = verstärker;
    }


    @Override
    public void ein() {
        System.out.println("CD-Spieler eingeschalten.");
    }

    @Override
    public void aus() {
        System.out.println("CD-Spieler ausgeschalten.");
    }
}
