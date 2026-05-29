package TP7.Exercice3;

public class CapaciteDepasseeException extends Exception {
    public CapaciteDepasseeException() {
        super("La capacite maximale de l'ensemble a ete depassee.");
    }
}
