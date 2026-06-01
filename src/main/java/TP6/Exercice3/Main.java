package TP6.Exercice3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Etudiant> estc = new ArrayList<>();
        estc.add(new Etudiant("Alaoui", "GI1", 2025, 17.7));
        estc.add(new Etudiant("Raissouni", "GI1", 2026, 12.8));
        estc.add(new Etudiant("Tahiri", "GI1", 2023, 15.3));
        estc.add(new Etudiant("Abidi", "GI2", 2024, 13.8));
        estc.add(new Etudiant("Merzouki", "GI2", 2023, 12.9));
        estc.add(new Etudiant("Ahmadi", "GI1", 2025, 12.23));

        System.out.println("--- Filtrage (GI1, 2025, Commence par A) ---");
        List<Predicate<Etudiant>> predicates = new ArrayList<>();
        predicates.add(e -> e.getPromotion() == 2025);
        predicates.add(e -> "GI1".equals(e.getFiliere()));
        predicates.add(e -> e.getNom().startsWith("A"));

        Predicate<Etudiant> condition = Util.andAll(predicates);
        Util.printFilter(estc, condition);

        System.out.println("\n--- Decrementation des moyennes ---");
        Util.applyAction(estc, e -> e.setMoyenne(e.getMoyenne() - 1));
        Util.applyAction(estc, System.out::println);

        System.out.println("\n--- Rachat des etudiants [11.75, 12[ ---");
        Util.processIf(estc, 
            e -> e.getMoyenne() >= 11.75 && e.getMoyenne() < 12, 
            e -> e.setMoyenne(12.0)
        );
        Util.applyAction(estc, System.out::println);

        System.out.println("\n--- Transformation ---");
        List<Etudiant> transformes = Util.transformAll(estc, e -> {
            String newNom = e.getNom().substring(0, 1).toUpperCase() + e.getNom().substring(1).toLowerCase();
            return new Etudiant(newNom, e.getFiliere(), e.getPromotion() + 1, e.getMoyenne());
        });
        Util.applyAction(transformes, System.out::println);
    }
}
