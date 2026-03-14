package TP2.Exercice4;

public class MaDate {
    private int jour;
    private int mois;
    private int annee;

    public MaDate(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return jour + "/" + mois + "/" + annee;
    }

    private boolean estBissextile(int a) {
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }

    private int getJoursMois(int m, int a) {
        if (m == 2) {
            return estBissextile(a) ? 29 : 28;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public void ajouterUnJour() {
        jour++;
        if (jour > getJoursMois(mois, annee)) {
            jour = 1;
            mois++;
            if (mois > 12) {
                mois = 1;
                annee++;
            }
        }
    }

    public void ajouterPlusieursJours(int n) {
        for (int i = 0; i < n; i++) {
            ajouterUnJour();
        }
    }

    public void ajouterUnMois() {
        mois++;
        if (mois > 12) {
            mois = 1;
            annee++;
        }
        int maxJours = getJoursMois(mois, annee);
        if (jour > maxJours) {
            jour = maxJours;
        }
    }

    public void ajouterUnAn() {
        annee++;
        int maxJours = getJoursMois(mois, annee);
        if (jour > maxJours) {
            jour = maxJours;
        }
    }
}
