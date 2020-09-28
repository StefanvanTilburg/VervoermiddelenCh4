package controller;

import model.*;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 5.2 Vervoermiddellen
 * <p>
 * Doel     OOP applicatie maken dat verschillende vervoersmiddelen kan verwerken, waarbij gebruik wordt gemaakt van
 *          inheritance en abstract classes.
 */
public class VervoermiddelenLauncher {
    public static void main(String[] args) {
        Koets koets = new Koets("Glinkowski", "marathonwagen", 320,2);
        Auto auto = new Auto("Dacia", "Logan MPV", 1150, "benzine");
        Fiets fiets = new Fiets("Koga Mijata", "Colmaro Race Ultegra",9);
        Zeilboot zeilboot = new Zeilboot("Dufour 36", "Classic",11.5);
        Motorboot motorboot = new Motorboot("Broesder", "Kotter", 13.75, "diesel");

        Vervoermiddel[] vervoersmiddelen = new Vervoermiddel[5];
        vervoersmiddelen[0] = koets;
        vervoersmiddelen[1] = auto;
        vervoersmiddelen[2] = fiets;
        vervoersmiddelen[3] = zeilboot;
        vervoersmiddelen[4] = motorboot;

        for (Vervoermiddel vervoersmiddel : vervoersmiddelen) {
            System.out.println(vervoersmiddel);
        }
    }
}
