package TP3.Exercice7;

public class Doyen extends Personnel {
    private static Doyen instance;
    private double salaireBase;
    private double primeDeplacement;

    private Doyen(String nom, String prenom, String bureau, double salaireBase, double primeDeplacement) {
        super(nom, prenom, bureau);
        this.salaireBase = salaireBase;
        this.primeDeplacement = primeDeplacement;
    }

    public static Doyen getInstance(String nom, String prenom, String bureau, double salaireBase, double primeDeplacement) {
        if (instance == null) {
            instance = new Doyen(nom, prenom, bureau, salaireBase, primeDeplacement);
        } else {
            System.err.println("Erreur: Le Doyen existe deja!");
        }
        return instance;
    }

    @Override
    public double Calculer_Salaire() {
        return salaireBase + primeDeplacement;
    }

    @Override
    public void afficher() {
        System.out.println("Doyen: " + nom + " " + prenom + " - Bureau: " + bureau + " - Salaire: " + Calculer_Salaire());
    }
}
