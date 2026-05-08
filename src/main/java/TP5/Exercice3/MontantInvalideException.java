package TP5.Exercice3;

public class MontantInvalideException extends Exception {
    public MontantInvalideException() {
        super("Le montant est invalide (negatif).");
    }
}
