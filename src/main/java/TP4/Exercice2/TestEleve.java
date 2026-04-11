package TP4.Exercice2;

import java.util.ArrayList;
import java.util.Collections;

public class TestEleve {
    public static void main(String[] args) {
        Eleve e1 = new Eleve("Zaid");
        e1.ajouterNote(15);
        e1.ajouterNote(12);

        Eleve e2 = new Eleve("Ahmed");
        e2.ajouterNote(18);
        e2.ajouterNote(16);

        Eleve e3 = new Eleve("Sara");
        e3.ajouterNote(10);
        e3.ajouterNote(14);

        ArrayList<Eleve> classe = new ArrayList<>();
        classe.add(e1);
        classe.add(e2);
        classe.add(e3);

        System.out.println("Avant tri: " + classe);

        Collections.sort(classe);
        System.out.println("Apres tri par moyenne (Comparable): " + classe);

        Collections.sort(classe, new ComparateurEleve());
        System.out.println("Apres tri par nom (Comparator): " + classe);
    }
}
