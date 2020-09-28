package model;

/**
 * @author Stefan van Tilburg
 *
 *         Subclass Motorboot
 */
public class Motorboot extends Vaartuig {
    private String soortBrandstof;

    public Motorboot(String merk, String type, double lengteInMeter, String soortBrandstof) {
        super(merk, type, lengteInMeter);
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
