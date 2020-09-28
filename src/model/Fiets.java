package model;

/**
 * @author Stefan van Tilburg
 *
 *         Subclass Fiets
 */
public class Fiets extends Voertuig {
    protected static final int AANTAL_WIELEN = 2;

    public Fiets(String merk, String type, int gewicht) {
        super(merk, type, AANTAL_WIELEN, gewicht);

    }

    @Override
    public String geefAandrijfKracht() {
        return "menskracht";
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " aangedreven door %s", this.geefAandrijfKracht());
    }
}
