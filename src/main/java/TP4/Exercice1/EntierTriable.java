package TP4.Exercice1;

import java.util.Arrays;

public class EntierTriable implements Triable {
    private int[] tab;

    public EntierTriable(int[] tab) {
        this.tab = tab;
    }

    @Override
    public void echange(int i, int j) {
        int tmp = tab[i];
        tab[i] = tab[j];
        tab[j] = tmp;
    }

    @Override
    public boolean plusGrand(int i, int j) {
        return tab[i] > tab[j];
    }

    @Override
    public int taille() {
        return tab.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(tab);
    }
}
