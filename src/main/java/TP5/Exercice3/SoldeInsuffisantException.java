package TP5.Exercice3;

public class SoldeInsuffisantException extends Exception {
    public SoldeInsuffisantException() {
        super("Solde insuffisant pour effectuer le retrait.");
    }
}
