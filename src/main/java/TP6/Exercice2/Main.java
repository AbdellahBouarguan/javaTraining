package TP6.Exercice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    static <T, R> List<R> transformer(List<T> liste, Function<? super T, ? extends R> fonction) {
        List<R> resultat = new ArrayList<>();
        for (T element : liste) {
            resultat.add(fonction.apply(element));
        }
        return resultat;
    }

    static <T> void afficherListe(List<T> liste, Consumer<? super T> action) {
        for (T element : liste) {
            action.accept(element);
        }
    }

    public static void main(String[] args) {
        Predicate<Integer> isPositifPair = n -> n >= 0 && n % 2 == 0;

        List<Integer> entiers = Arrays.asList(12, 7, -4, 20, 5, 18, -3, 11, 24);
        List<Integer> positifsPairs = entiers.stream()
                .filter(isPositifPair)
                .collect(Collectors.toList());
        System.out.println(positifsPairs);

        Function<String, Integer> stringLength = String::length;
        System.out.println(stringLength.apply("Java"));
        System.out.println(stringLength.apply("ENSATe"));
        System.out.println(stringLength.apply("Programmation"));

        List<String> mots = Arrays.asList("java", "lambda", "stream");
        List<Integer> longueurs = transformer(mots, s -> s.length());
        List<String> majuscules = transformer(mots, String::toUpperCase);

        System.out.println("Liste initiale :\n" + mots);
        System.out.println("Longueurs :\n" + longueurs);
        System.out.println("Majuscules :\n" + majuscules);

        Consumer<String> afficherMessage = s -> System.out.println("Message : " + s);
        afficherMessage.accept("Bonjour");

        afficherListe(entiers, n -> System.out.println("Entier: " + n));
        afficherListe(mots, afficherMessage);
    }
}
