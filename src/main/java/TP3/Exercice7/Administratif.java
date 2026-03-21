package TP3.Exercice7;

public class Administratif extends Personnel {
    private String fonction;
    private double salaireBase;
    private double prime;

    public Administratif(String nom, String prenom, String bureau, String fonction, double salaireBase, double prime) {
        super(nom, prenom, bureau);
        this.fonction = fonction;
        this.salaireBase = salaireBase;
        this.prime = prime;
    }

    @Override
    public double Calculer_Salaire() {
        return salaireBase + prime;
    }

    @Override
    public void afficher() {
        System.out.println("Administratif: " + nom + " " + prenom + " - Fonction: " + fonction + " - Salaire: " + Calculer_Salaire());
    }
}
