package model;

/**
 * @author Stefan van Tilburg
 *
 *         Subclass Voertuig
 */
public class Auto extends Voertuig implements Belastbaar {
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

    @Override
    public double getVervoerBelasting() {
        final int GEWICHT_SCHAAL_1 = 1000;
        final int GEWICHT_SCHAAL_2 = 1450;
        final double PRIJS_SCHAAL_1 = 85;
        final double PRIJS_SCHAAL_2 = 104;
        final double PRIJS_SCHAAL_3 = 122;
        final int DIESEL_OPSLAG_PERCENTAGE = 30;
        final int ELEKTRISCH_KORTING_PERCENTAGE = 50;

        double bedrag;
        if (super.getGewicht() < GEWICHT_SCHAAL_1) {
            bedrag = PRIJS_SCHAAL_1;
        } else if (super.getGewicht() < GEWICHT_SCHAAL_2) {
            bedrag = PRIJS_SCHAAL_2;
        } else {
            bedrag = PRIJS_SCHAAL_3;
        }

        if (this.getSoortBrandstof().equals("diesel")) {
            bedrag *= ((double) DIESEL_OPSLAG_PERCENTAGE / 100 + 1);
        }

        if (this.getSoortBrandstof().equals("elektrisch")) {
            bedrag *= (double) ELEKTRISCH_KORTING_PERCENTAGE / 100;
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
