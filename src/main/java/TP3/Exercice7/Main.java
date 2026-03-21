package TP3.Exercice7;

public class Main {
    public static void main(String[] args) {
        Doyen d1 = Doyen.getInstance("Alaoui", "Mohammed", "Bureau 1", 20000, 5000);
        Doyen d2 = Doyen.getInstance("Fahmi", "Said", "Bureau 2", 15000, 3000);

        Enseignant e1 = new Enseignant("Naciri", "Youssef", "Bureau 10", "PES", 12000, 10);
        Administratif a1 = new Administratif("Sabir", "Ali", "Bureau 5", "Secretaire", 6000, 1000);
        Etudiant et1 = new Etudiant("Zaid", "Omar", 14.5);

        e1.ajouterEtudiant(et1);

        ListeObjet liste = new ListeObjet();
        liste.ajouterPersonne(d1);
        liste.ajouterPersonne(e1);
        liste.ajouterPersonne(a1);
        liste.ajouterPersonne(et1);

        System.out.println("--- Tous les enseignants ---");
        liste.afficherEnseignants();
    }
}
