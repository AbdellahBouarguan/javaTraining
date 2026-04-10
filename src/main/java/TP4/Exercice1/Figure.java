package TP4.Exercice1;

public abstract class Figure {
    private int posX;
    private int posY;

    public Figure(int x, int y) {
        posX = x;
        posY = y;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public abstract void affiche();

    public double estDistantDe(Figure fig) {
        return Math.sqrt(Math.pow(this.posX - fig.getPosX(), 2) + Math.pow(this.posY - fig.getPosY(), 2));
    }

    public abstract double surface();

    public void deplacement(int x, int y) {
        this.posX += x;
        this.posY += y;
    }
}
