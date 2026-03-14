package TP2.Exercice4;

public class Main {
    public static void main(String[] args) {
        MaDate d1 = new MaDate(28, 2, 2024);
        System.out.println("Date initiale: " + d1.toString());
        d1.ajouterUnJour();
        System.out.println("Apres un jour (bissextile): " + d1.toString());
        
        MaDate d2 = new MaDate(31, 12, 2024);
        System.out.println("Date initiale: " + d2.toString());
        d2.ajouterUnJour();
        System.out.println("Apres un jour (nouvel an): " + d2.toString());
        
        MaDate d3 = new MaDate(25, 2, 2023);
        d3.ajouterPlusieursJours(5);
        System.out.println("Apres 5 jours (25/2/2023): " + d3.toString());
        
        MaDate d4 = new MaDate(31, 1, 2024);
        d4.ajouterUnMois();
        System.out.println("Apres un mois (31/1/2024 -> fevrier): " + d4.toString());
        
        MaDate d5 = new MaDate(29, 2, 2024);
        d5.ajouterUnAn();
        System.out.println("Apres un an (29/2/2024 -> 2025): " + d5.toString());
    }
}
