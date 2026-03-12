package TP1.Exercice3;

import java.util.Scanner;

public class Mesure {
    public static int nbMesure,sommeMesure;


    public Mesure(int mesure) {
        if (Math.abs(mesure) <= 100) {
            nbMesure++;
            sommeMesure+=mesure;
        }
        else {
            System.out.println("mesure hors intervalle");
        }
    }

    public void afficherMoyenne(){
        if(nbMesure == 0){
            System.out.println("zero mesures");
        }else{
            double moyenne = (double)sommeMesure/nbMesure;
            System.out.println(
                    "Nombre des mesures est :"+nbMesure +
                    "\nMoyenne de tous les mesures est :"+ moyenne
            );
        }
    }

    public static void main(String[] args) {

        Mesure m1;

        Scanner scanner = new Scanner(System.in);

        int valeur;
        do {
            System.out.println("Entrer une mesure :");
            valeur = scanner.nextInt();
            m1 = new Mesure(valeur);
        }
        while (valeur != 0);

        m1.afficherMoyenne();

        scanner.close();

    }
}
