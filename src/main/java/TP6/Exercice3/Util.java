package TP6.Exercice3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Util {

    public static <T> Boolean andAll(List<Predicate<T>> pList, T obj) {
        for (Predicate<T> p : pList) {
            if (!p.test(obj)) {
                return false;
            }
        }
        return true;
    }

    public static <T> Predicate<T> andAll(List<Predicate<T>> pList) {
        return obj -> {
            for (Predicate<T> p : pList) {
                if (!p.test(obj)) {
                    return false;
                }
            }
            return true;
        };
    }

    public static void printFilter(List<Etudiant> students, Predicate<Etudiant> p) {
        for (Etudiant e : students) {
            if (p.test(e)) {
                System.out.println(e);
            }
        }
    }

    public static void applyAction(List<Etudiant> students, Consumer<Etudiant> action) {
        for (Etudiant e : students) {
            action.accept(e);
        }
    }

    public static void processIf(List<Etudiant> students, Predicate<Etudiant> p, Consumer<Etudiant> action) {
        for (Etudiant e : students) {
            if (p.test(e)) {
                action.accept(e);
            }
        }
    }

    public static List<Etudiant> transformAll(List<Etudiant> students, EtudiantTransformer transformer) {
        List<Etudiant> result = new ArrayList<>();
        for (Etudiant e : students) {
            result.add(transformer.transform(e));
        }
        return result;
    }
}
