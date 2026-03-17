package TP3.Exercice1;

import java.util.ArrayList;

public class Bibliotheque {
    private ArrayList<Document> documents;

    public Bibliotheque() {
        this.documents = new ArrayList<>();
    }

    public void ajouterDocument(Document d) {
        documents.add(d);
    }

    public int calculerNbrLivres() {
        int count = 0;
        for (Document d : documents) {
            if (d instanceof Livre) {
                count++;
            }
        }
        return count;
    }

    public void afficherDictionnaires() {
        for (Document d : documents) {
            if (d instanceof Dictionnaire) {
                d.afficher();
            }
        }
    }
}
