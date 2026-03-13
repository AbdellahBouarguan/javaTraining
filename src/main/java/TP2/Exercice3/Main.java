package TP2.Exercice3;

public class Main {
    public static void main(String[] args) {
        Adresse a1 = new Adresse("Rue Hassan II", "Rabat", "10000");
        Adresse a2 = new Adresse("Boulevard Zerktouni", "Casablanca", "20000");
        Adresse a3 = new Adresse("Rue de la Liberte", "Fes", "30000");

        Personne p1 = new Personne("Ahmed", 'M', new Adresse[]{a1, a2});
        Personne p2 = new Personne("Fatima", 'F', new Adresse[]{a2, a3});
        Personne p3 = new Personne("Youssef", 'M', new Adresse[]{a1});

        ListePersonnes lp = new ListePersonnes(new Personne[]{p1, p2, p3});

        Personne found = lp.findByNom("Fatima");
        if (found != null) {
            System.out.println("Personne trouvee: " + found.getNom() + ", Sexe: " + found.getSexe());
        } else {
            System.out.println("Personne non trouvee.");
        }

        System.out.println("Existe-t-il quelqu'un avec code postal 30000 ? " + lp.findByCodePostal("30000"));
        System.out.println("Existe-t-il quelqu'un avec code postal 40000 ? " + lp.findByCodePostal("40000"));

        System.out.println("Nombre de personnes a Rabat: " + lp.countPersonneVille("Rabat"));
        System.out.println("Nombre de personnes a Casablanca: " + lp.countPersonneVille("Casablanca"));

        lp.editPersonneNom("Ahmed", "Hamid");
        Personne oldP = lp.findByNom("Ahmed");
        Personne newP = lp.findByNom("Hamid");
        System.out.println("Recherche Ahmed apres modification: " + (oldP != null ? oldP.getNom() : "null"));
        System.out.println("Recherche Hamid apres modification: " + (newP != null ? newP.getNom() : "null"));

        lp.editPersonneVille("Fatima", "Marrakech");
        System.out.println("Villes des adresses de Fatima apres modification:");
        for (Adresse adr : p2.getAdresses()) {
            System.out.println("- " + adr.getVille());
        }
    }
}
