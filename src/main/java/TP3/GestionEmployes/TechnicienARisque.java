package TP3.GestionEmployes;

public class TechnicienARisque extends Technicien implements PrimeRisque {
    public TechnicienARisque(String nom, String prenom, int age, int anciennete, int nbUnitesProduites) {
        super(nom, prenom, age, anciennete, nbUnitesProduites);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + PRIME;
    }

    @Override
    public void afficher() {
        System.out.println("Nom: " + nom + " " + prenom + ", Age: " + age + ", Anciennete: " + anciennete + " ans");
        System.out.println("Type: Technicien A Risque, Unites: " + nbUnitesProduites + ", Salaire: " + calculerSalaire());
    }
}
