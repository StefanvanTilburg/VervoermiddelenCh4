package model;

/**
 * @author Stefan van Tilburg
 *
 *         Superclass Voertuig, heeft als subclasses Koets, Auto, Fiets.
 *         Heeft als superclass Vervoermiddel.
 */
public abstract class Voertuig extends Vervoermiddel {
    private int aantalWielen;
    private int gewicht;

    protected Voertuig(String merk, String type, int aantalWielen, int gewicht) {
        super(merk, type);
        this.setAantalWielen(aantalWielen);
        this.setGewicht(gewicht);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setAantalWielen(int aantalWielen) {
        this.aantalWielen = aantalWielen;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
}
