package TP1.Exercice2;

public class Etudiant {
    private String cne,nom,prenom, adresse;
    private double moyenne;

    public static int nbTotalEtudiant = 0;

    public Etudiant() {
        nbTotalEtudiant++;
    }
    public Etudiant(String cne, String nom, String prenom) {
        this.cne = cne;
        this.nom = nom;
        this.prenom = prenom;
        nbTotalEtudiant++;
    }
    public Etudiant(String cne, String nom, String prenom, String adresse) {
        this.cne = cne;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        nbTotalEtudiant++;
    }
    public Etudiant(String cne, String nom, String prenom, String adresse, double moyenne) {
        this.cne = cne;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.moyenne = moyenne;
        nbTotalEtudiant++;
    }
    public  Etudiant(Etudiant etudiant){
        this.cne = etudiant.cne;
        this.nom = etudiant.nom;
        this.prenom = etudiant.prenom;
        this.adresse = etudiant.adresse;
        this.moyenne = etudiant.moyenne;
        nbTotalEtudiant++;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public void afficher() {
        System.out.println("Etudiant{" +
                "cne='" + cne + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", moyenne=" + moyenne +
                '}');
    }

}
