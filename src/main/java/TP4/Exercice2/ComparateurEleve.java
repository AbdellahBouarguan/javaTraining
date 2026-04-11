package TP4.Exercice2;

import java.util.Comparator;

public class ComparateurEleve implements Comparator<Eleve> {
    @Override
    public int compare(Eleve e1, Eleve e2) {
        return e1.getNom().compareTo(e2.getNom());
    }
}
