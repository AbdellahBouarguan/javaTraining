package TP2.Exercice2;

public class Main {
    public static void main(String[] args) {
        Stagiaire s1,s2,s3;
        s1 = new Stagiaire("Mohammed", new float[]{12.3f, 14.5f, 15.f, 9.5f});
        s2 = new Stagiaire("Ali", new float[]{16.3f, 12.5f, 13.f, 9.9f});
        s3 = new Stagiaire("Abdessadek", new float[]{18.3f, 16.5f, 11.f, 10.5f});

        Formation f1;
        f1 = new Formation("Docker",12,new Stagiaire[]{s1,s2,s3});

        System.out.println("Le moyenne de formation est :"+ f1.calculerMoyenneFormation());


        f1.afficherNomMax();
        f1.afficherMinMax();
        f1.trouverMoyenneParNom("Mohammed");
        f1.trouverMoyenneParNom("Ali");
        f1.trouverMoyenneParNom("Abdessadek");

    }
}
