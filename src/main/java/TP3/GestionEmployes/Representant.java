package TP3.GestionEmployes;

public class Representant extends Commercial {
    protected int nbHeures;

    public Representant(String nom, String prenom, int age, int anciennete, double chiffreAffaire, int nbHeures) {
        super(nom, prenom, age, anciennete, chiffreAffaire);
        this.nbHeures = nbHeures;
    }

    @Override
    public double calculerBaseSalaire() {
        return Manutentionnaire.BASE_SALAIRE_HORAIRE * nbHeures;
    }

    @Override
    public void afficher() {
        System.out.println("Nom: " + nom + " " + prenom + ", Age: " + age + ", Anciennete: " + anciennete + " ans");
        System.out.println("Type: Representant, Heures: " + nbHeures + ", Salaire: " + calculerSalaire());
    }
}
