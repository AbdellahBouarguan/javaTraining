package TP3.GestionEmployes;

public class Main {
    public static void main(String[] args) {
        Commercial c1 = new Commercial("Ali", "Othman", 30, 5, 10000.0);
        Technicien t1 = new Technicien("Sami", "Rami", 28, 2, 50);
        Manutentionnaire m1 = new Manutentionnaire("Omar", "Zaid", 35, 10, 160);

        System.out.println("--- Ex 3 & 4 ---");
        Vendeur v1 = new Vendeur("Ahmed", "Ali", 40, 8, 15000.0);
        Representant r1 = new Representant("Kamal", "Fahmi", 45, 12, 20000.0, 180);
        ManutentionnaireARisque mar1 = new ManutentionnaireARisque("Hassan", "Nour", 38, 7, 150);
        TechnicienARisque tar1 = new TechnicienARisque("Karim", "Said", 33, 4, 60);

        System.out.println("--- Ex 5: Personnel ---");
        Personnel p = new Personnel();
        p.embaucher(c1);
        p.embaucher(t1);
        p.embaucher(mar1);
        p.afficherSalaires();
        System.out.println("Salaire Moyen: " + p.salaireMoyen());
        System.out.println("Est t1 dans la liste? " + p.estDansListe(t1));

        System.out.println("--- Ex 6: Reference Bancaire ---");
        ReferenceBancaire ref = new ReferenceBancaire(12345, "Ali", "Othman", "BMCE");
        c1.setCompteBancaire(ref);
        c1.afficher();
    }
}
