package model;

/**
 * @author Stefan van Tilburg
 *
 *         Superclass Vervoermiddel, heeft als subclasses Vaartuig en Voertuig.
 */
public abstract class Vervoermiddel {
    private int id;
    private static int aantalVervoermiddelen;
    private String merk;
    private String type;

    protected Vervoermiddel(String merk, String type) {
        this.setMerk(merk);
        this.setType(type);
        this.id = ++aantalVervoermiddelen;
    }

    public abstract String geefAandrijfKracht();

    @Override
    public String toString() {
        return String.format("Vervoermiddel #%d %s %s", this.getId(), this.getMerk(), this.getType());
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getMerk() {
        return merk;
    }

    public String getType() {
        return type;
    }
}
