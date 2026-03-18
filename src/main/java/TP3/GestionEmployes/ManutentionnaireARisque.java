package TP3.GestionEmployes;

public class ManutentionnaireARisque extends Manutentionnaire implements PrimeRisque {
    public ManutentionnaireARisque(String nom, String prenom, int age, int anciennete, int nbHeures) {
        super(nom, prenom, age, anciennete, nbHeures);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + PRIME;
    }

    @Override
    public void afficher() {
        System.out.println("Nom: " + nom + " " + prenom + ", Age: " + age + ", Anciennete: " + anciennete + " ans");
        System.out.println("Type: Manutentionnaire A Risque, Heures: " + nbHeures + ", Salaire: " + calculerSalaire());
    }
}
