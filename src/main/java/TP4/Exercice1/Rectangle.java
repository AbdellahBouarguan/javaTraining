package TP4.Exercice1;

public class Rectangle extends Figure implements Deformable {
    private double largeur;
    private double hauteur;

    public Rectangle(int x, int y, double largeur, double hauteur) {
        super(x, y);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public void affiche() {
        System.out.println("Rectangle au centre (" + getPosX() + "," + getPosY() + "), largeur=" + largeur + ", hauteur=" + hauteur);
    }

    @Override
    public Figure deformation(double coeffH, double coeffV) {
        return new Rectangle(getPosX(), getPosY(), largeur * coeffH, hauteur * coeffV);
    }

    @Override
    public double surface() {
        return largeur * hauteur;
    }
}
