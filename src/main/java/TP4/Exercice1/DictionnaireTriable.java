package TP4.Exercice1;

import java.util.Arrays;

public class DictionnaireTriable implements Triable {
    private String[] mots;

    public DictionnaireTriable(String[] mots) {
        this.mots = mots;
    }

    @Override
    public void echange(int i, int j) {
        String tmp = mots[i];
        mots[i] = mots[j];
        mots[j] = tmp;
    }

    @Override
    public boolean plusGrand(int i, int j) {
        return mots[i].compareTo(mots[j]) > 0;
    }

    @Override
    public int taille() {
        return mots.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(mots);
    }
}
