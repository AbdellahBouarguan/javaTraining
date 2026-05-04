package TP5.Exercice1;

import java.util.ArrayList;
import java.util.Collections;

public class GestionExamen {
    private ArrayList<Examen> listeExamens;

    public GestionExamen() {
        this.listeExamens = new ArrayList<>();
    }

    public void ajouterExamen(Examen e) {
        listeExamens.add(e);
    }

    public void supprimerExamen(Examen e) {
        listeExamens.remove(e);
    }

    public void afficherListe() {
        for (Examen e : listeExamens) {
            e.afficher();
        }
    }

    public void trierFinauxParAnnee() {
        ArrayList<ExamenFinal> finaux = new ArrayList<>();
        for (Examen e : listeExamens) {
            if (e instanceof ExamenFinal) {
                finaux.add((ExamenFinal) e);
            }
        }
        Collections.sort(finaux);
        System.out.println("--- Examens finaux triés par année ---");
        for (ExamenFinal ef : finaux) {
            ef.afficher();
        }
    }
}
