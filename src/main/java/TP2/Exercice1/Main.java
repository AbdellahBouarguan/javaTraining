package TP2.Exercice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TroisPoint lesPoints;
        List<Point> points = new ArrayList<Point>();;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            Point p;
            double x , y;
            System.out.println("Entrer l'abscisse de point "+i+" :");
            x = scanner.nextDouble();
            System.out.println("Entrer l'ordonnee de point "+i+" :");
            y = scanner.nextDouble();
            p = new Point(x,y);
            points.add(p);
        }


        lesPoints = new TroisPoint(points.get(0),points.get(1),points.get(2));

        System.out.println(
                lesPoints.getPremier().toString()+"\n"+
                lesPoints.getDeuxieme().toString()+"\n"+
                lesPoints.getTroisieme().toString()
        );


        for (int i = 0; i <=1 ; i++) {
            for (int j = 1; j <=2; j++) {
                if (!((i == 1) && (j == 1))) {
                    System.out.println(
                            "Point Mileu entre Point " + (i + 1) + " et Point " + (j + 1) + " est :" + points.get(i).calculerMilieu(points.get(j))+"\n"+
                            "Distance entre Point " + (i + 1) + " et Point " + (j + 1) + " est :" + points.get(i).calculerDistance(points.get(j))
                    );
                }
            }
        }




    }
}
