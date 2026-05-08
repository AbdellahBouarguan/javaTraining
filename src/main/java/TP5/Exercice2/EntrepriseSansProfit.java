package TP5.Exercice2;

public class EntrepriseSansProfit extends Entreprise {
    public EntrepriseSansProfit(int nombreEmployes, String nom, String mission) {
        super(nombreEmployes, 0, nom, mission);
    }

    @Override
    public int capital() throws NonProfitException {
        throw new NonProfitException();
    }
}
