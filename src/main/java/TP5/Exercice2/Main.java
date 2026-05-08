package TP5.Exercice2;

public class Main {
    public static void afficherEntreprises(Entreprise[] entreprises) {
        for (Entreprise e : entreprises) {
            System.out.println("Entreprise: " + e.nom);
            try {
                System.out.println("Mission: " + e.mission());
            } catch (SecretMissionException ex) {
                System.out.println("Erreur: " + ex.getMessage());
            }

            try {
                System.out.println("Capital: " + e.capital());
            } catch (NonProfitException ex) {
                System.out.println("Erreur: " + ex.getMessage());
            }
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        Entreprise[] tab = new Entreprise[6];
        tab[0] = new Entreprise(1000, 5000000, "RAM", "Transport aerien");
        tab[1] = new EntrepriseSecrete(500, 10000000, "CIA", "Inconnu");
        tab[2] = new EntrepriseSecrete(200, 2000000, "DGED", "Inconnu");
        tab[3] = new EntrepriseSansProfit(100, "Croix-RougeMarocaine", "Aide humanitaire");
        tab[4] = new Entreprise(5000, 50000000, "Attijariwafa_Bank", "Banque");
        tab[5] = new EntrepriseSansProfit(50, "FMV_pour_la_Solidarité", "Action sociale");

        afficherEntreprises(tab);
    }
}
