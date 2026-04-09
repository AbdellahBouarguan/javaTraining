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
}
