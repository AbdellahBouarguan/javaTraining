package TP7.Exercice3;

public class MainTest {
    public static void main(String[] args) {
        try {
            Ensemble<Integer> e1 = new Ensemble<>(10);
            e1.ajouter(5);
            e1.ajouter(2);
            e1.ajouter(8);
            e1.ajouter(1);
            e1.ajouter(9);
            System.out.print("E1: ");
            e1.afficher();

            Ensemble<Integer> e2 = new Ensemble<>(10);
            e2.ajouter(5);
            e2.ajouter(10);
            e2.ajouter(8);
            System.out.print("E2: ");
            e2.afficher();

            e1.intersection(e2);
            System.out.print("E1 intersection E2: ");
            e1.afficher();

            e1.union(e2);
            System.out.print("E1 union E2: ");
            e1.afficher();

            Ensemble<Integer> e3 = e1.scinder();
            System.out.print("E1 apres scinder: ");
            e1.afficher();
            System.out.print("Nouvel ensemble (E3): ");
            e3.afficher();

            System.out.println("Comparaison E1 et E3: " + e1.compareTo(e3));

        } catch (CapaciteDepasseeException ex) {
            System.err.println("Erreur: " + ex.getMessage());
        }
    }
}
