package model;

/**
 * @author Stefan van Tilburg
 *
 *         Superclass Vaartuig, heeft als subclasses Zeilboot en Motorboot.
 *         Heeft als superclass Vervoermiddel.
 */
public abstract class Vaartuig extends Vervoermiddel {
    private double lengteInMeter;

    protected Vaartuig(String merk, String type, double lengteInMeter) {
        super(merk, type);
        this.setLengteInMeter(lengteInMeter);
    }

    public void setLengteInMeter(double lengteInMeter) {
        this.lengteInMeter = lengteInMeter;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
