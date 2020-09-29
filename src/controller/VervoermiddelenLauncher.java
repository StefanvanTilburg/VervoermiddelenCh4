package controller;

import model.*;

import java.util.ArrayList;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 5.2 Vervoermiddelen + 7.2 Vervoermiddelen
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
        Auto elektrisch = new Auto("Tesla", "type S 100D", 2200,"elektrisch");

        ArrayList<Vervoermiddel> vervoersmiddelen = new ArrayList<>();
        vervoersmiddelen.add(koets);
        vervoersmiddelen.add(auto);
        vervoersmiddelen.add(fiets);
        vervoersmiddelen.add(zeilboot);
        vervoersmiddelen.add(motorboot);
        vervoersmiddelen.add(elektrisch);

        for (Vervoermiddel vervoersmiddel : vervoersmiddelen) {
            System.out.println(vervoersmiddel);
            if (vervoersmiddel instanceof Auto) {
                System.out.printf("%.2f euro belasting per kwartaal\n",
                        ((Auto) vervoersmiddel).getVervoerBelasting());
            }

            if (vervoersmiddel instanceof Motorboot) {
                System.out.printf("%.2f euro belasting per kwartaal\n",
                        ((Motorboot) vervoersmiddel).getVervoerBelasting());
            }
        }

        // Belastbaar voertuig
        System.out.println();
        for (Vervoermiddel vervoermiddel : vervoersmiddelen) {
            if (vervoermiddel instanceof Auto || vervoermiddel instanceof Motorboot) {
                System.out.println(vervoermiddel);
            }
        }

        // Onbelastbaar voertuig
        System.out.println();
        for (Vervoermiddel vervoermiddel : vervoersmiddelen) {
            if (!(vervoermiddel instanceof Auto || vervoermiddel instanceof Motorboot)) {
                System.out.println(vervoermiddel);
            }
        }
    }
}
