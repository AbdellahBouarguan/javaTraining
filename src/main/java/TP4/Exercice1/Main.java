package TP4.Exercice1;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(0, 0, 10, 5);
        Carre c = new Carre(10, 10, 4);
        System.out.println("Surface Rectangle: " + r.surface());
        System.out.println("Surface Carre: " + c.surface());
        System.out.println("Distance: " + r.estDistantDe(c));
        r.deplacement(5, 5);
        r.affiche();

        EntierTriable et = new EntierTriable(new int[]{5, 2, 8, 1, 9});
        System.out.println("Avant tri: " + et);
        TriBulle.triBulles(et);
        System.out.println("Apres tri: " + et);

        DictionnaireTriable dt = new DictionnaireTriable(new String[]{"Zebra", "Apple", "Mango", "Banana"});
        System.out.println("Avant tri: " + dt);
        TriBulle.triBulles(dt);
        System.out.println("Apres tri: " + dt);

        PersonneTriable pt = new PersonneTriable(new int[]{45, 12, 34, 8, 29});
        System.out.println("Avant tri: " + pt);
        TriBulle.triBulles(pt);
        System.out.println("Apres tri: " + pt);
    }
}
