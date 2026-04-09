package TP4.Exercice1;

public class Carre extends Figure implements Deformable {
    private double cote;

    public Carre(int x, int y, double cote) {
        super(x, y);
        this.cote = cote;
    }

    @Override
    public void affiche() {
        System.out.println("Carre au centre (" + getPosX() + "," + getPosY() + "), cote=" + cote);
    }

    @Override
    public Figure deformation(double coeffH, double coeffV) {
        return new Rectangle(getPosX(), getPosY(), cote * coeffH, cote * coeffV);
    }
}
