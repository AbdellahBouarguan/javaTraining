package TP4.Exercice1;

import java.util.Arrays;

public class PersonneTriable implements Triable {
    private int[] ages;

    public PersonneTriable(int[] ages) {
        this.ages = ages;
    }

    @Override
    public void echange(int i, int j) {
        int tmp = ages[i];
        ages[i] = ages[j];
        ages[j] = tmp;
    }

    @Override
    public boolean plusGrand(int i, int j) {
        return ages[i] > ages[j];
    }

    @Override
    public int taille() {
        return ages.length;
    }

    @Override
    public String toString() {
        return "PersonnesAges: " + Arrays.toString(ages);
    }
}
