package TP3.Exercice7;

public class Etudiant extends Personne {
    private double moyenneAnnuelle;

    public Etudiant(String nom, String prenom, double moyenneAnnuelle) {
        super(nom, prenom);
        this.moyenneAnnuelle = moyenneAnnuelle;
    }

    @Override
    public void afficher() {
        System.out.println("Etudiant: " + nom + " " + prenom + " - Moyenne: " + moyenneAnnuelle);
    }
}
