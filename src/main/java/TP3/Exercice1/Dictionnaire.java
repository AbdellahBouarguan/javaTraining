package TP3.Exercice1;

public class Dictionnaire extends Document {
    private int nbrDefinitions;

    public Dictionnaire(String reference, String titre, int nbrDefinitions) {
        super(reference, titre);
        this.nbrDefinitions = nbrDefinitions;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Definitions: " + nbrDefinitions);
    }
}
