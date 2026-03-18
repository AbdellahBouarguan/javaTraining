package TP3.GestionEmployes;

public class Vendeur extends Commercial {
    public Vendeur(String nom, String prenom, int age, int anciennete, double chiffreAffaire) {
        super(nom, prenom, age, anciennete, chiffreAffaire);
    }

    @Override
    public void afficher() {
        System.out.println("Nom: " + nom + " " + prenom + ", Age: " + age + ", Anciennete: " + anciennete + " ans");
        System.out.println("Type: Vendeur, CA: " + chiffreAffaire + ", Salaire: " + calculerSalaire());
    }
}
