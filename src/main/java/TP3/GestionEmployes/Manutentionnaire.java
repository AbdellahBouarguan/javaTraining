package TP3.GestionEmployes;

public class Manutentionnaire extends Employe {
    protected int nbHeures;
    public static final double BASE_SALAIRE_HORAIRE = 50.0;

    public Manutentionnaire(String nom, String prenom, int age, int anciennete, int nbHeures) {
        super(nom, prenom, age, anciennete);
        this.nbHeures = nbHeures;
    }

    @Override
    public double calculerBaseSalaire() {
        return BASE_SALAIRE_HORAIRE * nbHeures;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Type: Manutentionnaire, Heures: " + nbHeures + ", Salaire: " + calculerSalaire());
    }
}
