package TP7.Exercice3;

import java.util.Arrays;

public class Ensemble<T extends Comparable<T>> implements Comparable<Ensemble<T>> {
    private T[] elements;
    private int taille;
    private int capaciteMax;

    @SuppressWarnings("unchecked")
    public Ensemble(int N) {
        this.capaciteMax = N;
        this.taille = 0;
        this.elements = (T[]) new Comparable[N];
    }

    public boolean contient(T e) {
        for (int i = 0; i < taille; i++) {
            if (elements[i].compareTo(e) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean ajouter(T e) throws CapaciteDepasseeException {
        if (contient(e)) {
            return false;
        }
        if (taille >= capaciteMax) {
            throw new CapaciteDepasseeException();
        }
        elements[taille++] = e;
        Arrays.sort(elements, 0, taille);
        return true;
    }

    public boolean retirer(T e) {
        int index = -1;
        for (int i = 0; i < taille; i++) {
            if (elements[i].compareTo(e) == 0) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }
        for (int i = index; i < taille - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[taille - 1] = null;
        taille--;
        return true;
    }

    public void union(Ensemble<T> autre) throws CapaciteDepasseeException {
        for (int i = 0; i < autre.taille; i++) {
            ajouter(autre.elements[i]);
        }
    }

    public void intersection(Ensemble<T> autre) {
        int i = 0;
        while (i < taille) {
            if (!autre.contient(elements[i])) {
                retirer(elements[i]);
            } else {
                i++;
            }
        }
    }

    public Ensemble<T> scinder() {
        int mid = taille / 2;
        Ensemble<T> nouvelEnsemble = new Ensemble<>(capaciteMax);
        for (int i = mid; i < taille; i++) {
            try {
                nouvelEnsemble.ajouter(elements[i]);
            } catch (CapaciteDepasseeException e) {}
            elements[i] = null;
        }
        taille = mid;
        return nouvelEnsemble;
    }

    @Override
    public int compareTo(Ensemble<T> autre) {
        return Integer.compare(this.taille, autre.taille);
    }

    public void afficher() {
        System.out.print("{ ");
        for (int i = 0; i < taille; i++) {
            System.out.print(elements[i] + (i < taille - 1 ? ", " : ""));
        }
        System.out.println(" }");
    }
}
