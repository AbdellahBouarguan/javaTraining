package org.example;


public class Employe
{
    private int matricule,anneeNais,annesEmbauche;
    private String nom,prenom;
    private double salaire;

    public int getMatricule() {
        return matricule;
    }

    public int getAnneeNais() {
        return anneeNais;
    }

    public int getAnnesEmbauche() {
        return annesEmbauche;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void setAnneeNais(int anneeNais) {
        this.anneeNais = anneeNais;
    }

    public void setAnnesEmbauche(int annesEmbauche) {
        this.annesEmbauche = annesEmbauche;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Employe(int matricule, int anneeNais, int annesEmbauche, String nom, String prenom, double salaire) {
        this.matricule = matricule;
        this.anneeNais = anneeNais;
        this.annesEmbauche = annesEmbauche;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public int getAge(){
        return 2026 - this.anneeNais;
    }
    public int getAnciennete(){
         return 2026 - this.annesEmbauche;
    }
    public void augmentationDuSalaire(){
        if (this.getAnciennete() > 10){
            this.salaire+=salaire*.1;
        } else if (this.getAnciennete() > 5) {
            this.salaire+=salaire*.05;
        }else {
            this.salaire+=salaire*.02;
        }
    }

    public void afficherEmploye(){
        System.out.println(
                "matricule=" + matricule +
                ", anneeNais=" + anneeNais +
                ", annesEmbauche=" + annesEmbauche +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire);
    }
}
