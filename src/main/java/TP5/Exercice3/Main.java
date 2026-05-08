package TP5.Exercice3;

public class Main {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire(1000.0);

        System.out.println("Solde initial: " + compte.getSolde());

        try {
            System.out.println("Depot de 500");
            compte.deposer(500);
            System.out.println("Nouveau solde: " + compte.getSolde());

            System.out.println("Tentative de depot de -200");
            compte.deposer(-200);
        } catch (MontantInvalideException e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        try {
            System.out.println("Retrait de 2000");
            compte.retirer(2000);
        } catch (SoldeInsuffisantException e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        try {
            System.out.println("Retrait de 300");
            compte.retirer(300);
            System.out.println("Nouveau solde: " + compte.getSolde());
        } catch (SoldeInsuffisantException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
