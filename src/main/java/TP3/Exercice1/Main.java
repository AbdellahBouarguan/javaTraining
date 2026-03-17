package TP3.Exercice1;

public class Main {
    public static void main(String[] args) {
        Bibliotheque biblio = new Bibliotheque();
        Livre l1 = new Livre("L01", "Java Programming", "John Doe", 500);
        Livre l2 = new Livre("L02", "Design Patterns", "GoF", 350);
        Dictionnaire d1 = new Dictionnaire("D01", "Larousse", 60000);

        biblio.ajouterDocument(l1);
        biblio.ajouterDocument(l2);
        biblio.ajouterDocument(d1);

        System.out.println("Nombre de livres: " + biblio.calculerNbrLivres());
        System.out.println("--- Dictionnaires ---");
        biblio.afficherDictionnaires();
    }
}
