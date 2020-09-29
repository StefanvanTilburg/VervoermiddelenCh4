package model;

/**
 * @author Stefan van Tilburg
 *
 *         Subclass Motorboot
 */
public class Motorboot extends Vaartuig implements Belastbaar {
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

    @Override
    public double getVervoerBelasting() {
        final int LENGTE_SCHAAL_1 = 12;
        final int DIESEL_OPSLAG_PERCENTAGE = 50;
        final double BEDRAG_SCHAAL_1 = 60;
        final double BEDRAG_SCHAAL_2 = 100;

        double bedrag;
        if (super.getLengteInMeter() < LENGTE_SCHAAL_1) {
            bedrag = BEDRAG_SCHAAL_1;
        } else {
            bedrag = BEDRAG_SCHAAL_2;
        }

        if (this.getSoortBrandstof().equals("diesel")) {
            bedrag *= ((double) DIESEL_OPSLAG_PERCENTAGE / 100 + 1);
        }

        return bedrag;
    }

    public void setSoortBrandstof(String soortBrandstof) {
        this.soortBrandstof = soortBrandstof;
    }

    public String getSoortBrandstof() {
        return soortBrandstof;
    }
}
