package TP7.Exercice2;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        Pair<Integer, Integer> p1 = new Pair<>(10, 20);
        System.out.println("Max: " + OperationPair.getMax(p1));
        System.out.println("Somme: " + OperationPair.somme(p1));

        List<Pair<String, Integer>> liste = new ArrayList<>();
        liste.add(new Pair<>("Z", 1));
        liste.add(new Pair<>("A", 5));
        liste.add(new Pair<>("A", 2));

        OperationPair.triListePair(liste);
        for (Pair<String, Integer> p : liste) {
            System.out.println(p.getFst() + " - " + p.getSnd());
        }

        List<Pair<Integer, Integer>> numList = new ArrayList<>();
        numList.add(new Pair<>(1, 2));
        numList.add(new Pair<>(3, 4));

        double[] tabV1 = OperationPair.collectionToTableauV1(numList);
        for (double d : tabV1) {
            System.out.println("TabV1: " + d);
        }

        List<Pair<Integer, Double>> numListV2 = new ArrayList<>();
        numListV2.add(new Pair<>(10, 5.5));
        double[] tabV2 = OperationPair.collectionToTableauV2(numListV2);
        for (double d : tabV2) {
            System.out.println("TabV2: " + d);
        }
    }
}
