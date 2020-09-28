package model;

/**
 * @author Stefan van Tilburg
 *
 *         Subclass Zeilboot
 */
public class Zeilboot extends Vaartuig {
    public Zeilboot(String merk, String type, double lengteInMeter) {
        super(merk, type, lengteInMeter);
    }

    @Override
    public String geefAandrijfKracht() {
        return "windkracht";
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " aangedreven door %s", this.geefAandrijfKracht());
    }
}
