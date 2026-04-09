package TP4.Exercice1;

public class Triangle extends Figure implements Deformable {
    private double base;
    private double hauteur;

    public Triangle(int x, int y, double base, double hauteur) {
        super(x, y);
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public void affiche() {
        System.out.println("Triangle isocèle au centre (" + getPosX() + "," + getPosY() + "), base=" + base + ", hauteur=" + hauteur);
    }

    @Override
    public Figure deformation(double coeffH, double coeffV) {
        return new Triangle(getPosX(), getPosY(), base * coeffH, hauteur * coeffV);
    }
}
