package TP3.Exercice7;

import java.util.ArrayList;
import java.util.List;

public class Enseignant extends Personnel {
    private String grade;
    private double salaireBase;
    private int heuresSupp;
    private static final double PRIX_HEURE = 150.0;
    private List<Etudiant> etudiants;

    public Enseignant(String nom, String prenom, String bureau, String grade, double salaireBase, int heuresSupp) {
        super(nom, prenom, bureau);
        this.grade = grade;
        this.salaireBase = salaireBase;
        this.heuresSupp = heuresSupp;
        this.etudiants = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    @Override
    public double Calculer_Salaire() {
        return salaireBase + (heuresSupp * PRIX_HEURE);
    }

    @Override
    public void afficher() {
        System.out.println("Enseignant: " + nom + " " + prenom + " - Grade: " + grade + " - Salaire: " + Calculer_Salaire());
    }
}
