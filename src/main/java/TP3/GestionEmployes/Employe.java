package TP3.GestionEmployes;

public class Employe {
    protected String nom;
    protected String prenom;
    protected int age;
    protected int anciennete;

    public Employe(String nom, String prenom, int age, int anciennete) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.anciennete = anciennete;
    }

    public double calculerBaseSalaire() {
        return 0; // To be overridden
    }

    public double calculerSalaire() {
        return calculerBaseSalaire() + (calculerBaseSalaire() * 0.10 * anciennete);
    }

    public void afficher() {
        System.out.println("Nom: " + nom + " " + prenom + ", Age: " + age + ", Anciennete: " + anciennete + " ans");
    }
}
