package model;

/**
 * @author Stefan van Tilburg
 *
 *         Subclass Koets
 */
public class Koets extends Voertuig {
    protected static final int AANTAL_WIELEN = 4;

    private int aantalPaarden;

    public Koets(String merk, String type, int gewicht, int aantalPaarden) {
        super(merk, type, AANTAL_WIELEN, gewicht);
        this.setAantalPaarden(aantalPaarden);
    }

    @Override
    public String geefAandrijfKracht() {
        return "paarden";
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " aangedreven door %s %s",
                this.getAantalPaarden(), this.geefAandrijfKracht());
    }

    public void setAantalPaarden(int aantalPaarden) {
        this.aantalPaarden = aantalPaarden;
    }

    public int getAantalPaarden() {
        return aantalPaarden;
    }
}
