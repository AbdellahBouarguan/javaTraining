package TP3.Exercice1;

public class Document {
    protected String reference;
    protected String titre;

    public Document(String reference, String titre) {
        this.reference = reference;
        this.titre = titre;
    }

    public void afficher() {
        System.out.println("Reference: " + reference + " - Titre: " + titre);
    }
}
