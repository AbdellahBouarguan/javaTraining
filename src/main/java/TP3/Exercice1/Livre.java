package TP3.Exercice1;

public class Livre extends Document {
    private String auteur;
    private int nbrPages;

    public Livre(String reference, String titre, String auteur, int nbrPages) {
        super(reference, titre);
        this.auteur = auteur;
        this.nbrPages = nbrPages;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Auteur: " + auteur + " - Pages: " + nbrPages);
    }
}
