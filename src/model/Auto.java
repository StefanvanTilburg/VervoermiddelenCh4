package model;

/**
 * @author Stefan van Tilburg
 *
 *         Subclass Voertuig
 */
public class Auto extends Voertuig {
    protected static final int AANTAL_WIELEN = 4;

    private String soortBrandstof;

    public Auto(String merk, String type, int gewicht, String soortBrandstof) {
        super(merk, type, AANTAL_WIELEN, gewicht);
        this.setSoortBrandstof(soortBrandstof);
    }

    @Override
    public String geefAandrijfKracht() {
        return "motor";
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " aangedreven door %s %s",
                this.getSoortBrandstof(), this.geefAandrijfKracht());
    }

    public void setSoortBrandstof(String soortBrandstof) {
        this.soortBrandstof = soortBrandstof;
    }

    public String getSoortBrandstof() {
        return soortBrandstof;
    }
}
