package TP3.GestionEmployes;

public class Main {
    public static void main(String[] args) {
        Commercial c1 = new Commercial("Ali", "Othman", 30, 5, 10000.0);
        Technicien t1 = new Technicien("Sami", "Rami", 28, 2, 50);
        Manutentionnaire m1 = new Manutentionnaire("Omar", "Zaid", 35, 10, 160);

        c1.afficher();
        t1.afficher();
        m1.afficher();
    }
}
