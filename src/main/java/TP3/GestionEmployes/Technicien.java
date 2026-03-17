package TP3.GestionEmployes;

public class Technicien extends Employe {
    protected int nbUnitesProduites;
    public static final double BASE = 1500.0;
    public static final double PART = 5.0;
    public static final double GAIN_UNITE = 10.0;

    public Technicien(String nom, String prenom, int age, int anciennete, int nbUnitesProduites) {
        super(nom, prenom, age, anciennete);
        this.nbUnitesProduites = nbUnitesProduites;
    }

    @Override
    public double calculerBaseSalaire() {
        return BASE + (nbUnitesProduites * PART * GAIN_UNITE);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Type: Technicien, Unites: " + nbUnitesProduites + ", Salaire: " + calculerSalaire());
    }
}
