package TP2.Exercice1;

public class TroisPoint {
    private Point premier,deuxieme,troisieme;

    public Point getPremier() {
        return premier;
    }

    public void setPremier(Point premier) {
        this.premier = premier;
    }

    public Point getDeuxieme() {
        return deuxieme;
    }

    public void setDeuxieme(Point deuxieme) {
        this.deuxieme = deuxieme;
    }

    public Point getTroisieme() {
        return troisieme;
    }

    public void setTroisieme(Point troisieme) {
        this.troisieme = troisieme;
    }

    public TroisPoint(Point premier, Point deuxieme, Point troisieme) {
        this.premier = premier;
        this.deuxieme = deuxieme;
        this.troisieme = troisieme;
    }

    public boolean sontAlignes(){
        return (premier.calculerDistance(deuxieme) == (premier.calculerDistance(troisieme) + deuxieme.calculerDistance(troisieme))) ||
                (premier.calculerDistance(troisieme) == (premier.calculerDistance(deuxieme) + deuxieme.calculerDistance(troisieme))) ||
                ((deuxieme.calculerDistance(troisieme)) == (premier.calculerDistance(troisieme) + premier.calculerDistance(deuxieme)));
    }

    public boolean estIsocele() {
        return (premier.calculerDistance(deuxieme) == premier.calculerDistance(troisieme)) ||
                (premier.calculerDistance(deuxieme) == deuxieme.calculerDistance(troisieme))||
                (deuxieme.calculerDistance(troisieme) == premier.calculerDistance(troisieme));
    }
}
