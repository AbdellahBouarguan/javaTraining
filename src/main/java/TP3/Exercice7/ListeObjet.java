package TP3.Exercice7;

import java.util.ArrayList;
import java.util.List;

public class ListeObjet {
    private List<Personne> personnes;

    public ListeObjet() {
        personnes = new ArrayList<>();
    }

    public void ajouterPersonne(Personne p) {
        personnes.add(p);
    }

    public void afficherEnseignants() {
        for (Personne p : personnes) {
            if (p instanceof Enseignant) {
                p.afficher();
            }
        }
    }
}
