package TP6.Exercice3;

public class Etudiant {
    private String nom;
    private String filiere;
    private int promotion;
    private double moyenne;

    public Etudiant(String nom, String filiere, int promotion, double moyenne) {
        this.nom = nom;
        this.filiere = filiere;
        this.promotion = promotion;
        this.moyenne = moyenne;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    
    public String getFiliere() { return filiere; }
    public void setFiliere(String filiere) { this.filiere = filiere; }
    
    public int getPromotion() { return promotion; }
    public void setPromotion(int promotion) { this.promotion = promotion; }
    
    public double getMoyenne() { return moyenne; }
    public void setMoyenne(double moyenne) { this.moyenne = moyenne; }

    @Override
    public String toString() {
        return "Etudiant{nom='" + nom + "', filiere='" + filiere + "', promotion=" + promotion + ", moyenne=" + moyenne + "}";
    }
}
