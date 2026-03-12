package org.example;

import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Employe e1,e2,e3;
        e1 = new Employe(1,1995,2018,"mohamed","Bouarguan",15000.05);
        e1.afficherEmploye();
        e1.augmentationDuSalaire();
        e1.afficherEmploye();

        e2 = new Employe(2,1995,2014,"Ali","Bouarguan",15000.05);
        e2.afficherEmploye();
        e2.augmentationDuSalaire();
        e2.afficherEmploye();

        e3 = new Employe(2,1995,2022,"Abdellah","Bouarguan",15000.05);
        e3.afficherEmploye();
        e3.augmentationDuSalaire();
        e3.afficherEmploye();
    }
}