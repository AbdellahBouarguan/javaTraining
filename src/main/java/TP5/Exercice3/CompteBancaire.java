package TP5.Exercice3;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public void deposer(double montant) throws MontantInvalideException {
        if (montant < 0) {
            throw new MontantInvalideException();
        }
        solde += montant;
    }

    public void retirer(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException();
        }
        solde -= montant;
    }

    public double getSolde() {
        return solde;
    }
}
