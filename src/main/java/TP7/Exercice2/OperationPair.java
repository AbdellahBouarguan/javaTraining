package TP7.Exercice2;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OperationPair {

    public static <U extends Comparable<U>> U getMax(Pair<U, U> p) {
        if (p.getFst().compareTo(p.getSnd()) >= 0) {
            return p.getFst();
        }
        return p.getSnd();
    }

    public static <U extends Comparable<U>, V extends Comparable<V>> void triListePair(List<Pair<U, V>> liste) {
        Collections.sort(liste, new Comparator<Pair<U, V>>() {
            @Override
            public int compare(Pair<U, V> p1, Pair<U, V> p2) {
                int cmp = p1.getFst().compareTo(p2.getFst());
                if (cmp != 0) {
                    return cmp;
                }
                return p1.getSnd().compareTo(p2.getSnd());
            }
        });
    }

    public static <U extends Number, V extends Number> double somme(Pair<U, V> p) {
        return p.getFst().doubleValue() + p.getSnd().doubleValue();
    }

    public static <U extends Number> double[] collectionToTableauV1(Collection<Pair<U, U>> liste) {
        double[] tab = new double[liste.size()];
        int i = 0;
        for (Pair<U, U> p : liste) {
            tab[i++] = p.getFst().doubleValue() + p.getSnd().doubleValue();
        }
        return tab;
    }

    public static <U extends Number, V extends Number> double[] collectionToTableauV2(Collection<Pair<U, V>> liste) {
        double[] tab = new double[liste.size()];
        int i = 0;
        for (Pair<U, V> p : liste) {
            tab[i++] = p.getFst().doubleValue() + p.getSnd().doubleValue();
        }
        return tab;
    }
}
