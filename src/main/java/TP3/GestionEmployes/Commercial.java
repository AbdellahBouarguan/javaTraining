package TP3.GestionEmployes;

public class Commercial extends Employe {
    protected double chiffreAffaire;
    public static final double BASE = 2000.0;
    public static final double PART = 0.2;

    public Commercial(String nom, String prenom, int age, int anciennete, double chiffreAffaire) {
        super(nom, prenom, age, anciennete);
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public double calculerBaseSalaire() {
        return BASE + (chiffreAffaire * PART);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Type: Commercial, CA: " + chiffreAffaire + ", Salaire: " + calculerSalaire());
    }
}
