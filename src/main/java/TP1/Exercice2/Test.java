package TP1.Exercice2;

public class Test {
    public static void main(String[] args) {
        Etudiant e1,e2,e3,e4,e5;
        e1 = new Etudiant("B13306833","BOUARGUAN","Abdellah","Tetoaun mhenech 2",9.66);
        e2 = new Etudiant("B13306830","BEN YACOUB","Nizar","Tetoaun mhenech 2",15.5);
        e3 = new Etudiant("B13306836","EL GAZOUANI","Marouan","Tetoaun mhenech 2",15.3);
        e4 = new Etudiant("B13306839","EL HORRE","Omar","Martil centre",15);
        e5 = new Etudiant("B13306831","ZOUBIRI","Salim","martil centre",15.35);

        Etudiant [] listTotalEtudiant = {e1,e2,e3,e4,e5};
        System.out.println("List Total des etudiants :");
        for (Etudiant e:listTotalEtudiant) {
            e.afficher();
        }
        System.out.println("///////////////////////////////////////////");


        Etudiant []ge1 = {e1,e2};
        Etudiant []ge2 = {e3,e5};

        GroupeEtudiant g1,g2;
        g1 = new GroupeEtudiant("GI","S6",ge1);
        g1.ajouterEtudiant(e4);
        g2 = new GroupeEtudiant("GI","S7",ge2);

        GroupeEtudiant [] lesDifferentGrp = {g1,g2};


        for (GroupeEtudiant g:lesDifferentGrp) {
            System.out.println("List des etudiants du groupe "+g.getNom()+ " de niveau "+ g.getNiveau() +" :");
            g.afficher();
            System.out.println("###########################################");
            System.out.println("List des etudiants du groupe  "+g.getNom()+ " de niveau "+ g.getNiveau() +" ayant moyenne >= 10 :");
            g.afficherSuperieurADix();
            System.out.println("###########################################");
            System.out.println("Le nombre des etudiant dans groupe "+g.getNom() +" de niveau "+ g.getNiveau() +" est : " + g.nbrEtdGrp());

            System.out.println("###########################################");
        }

        System.out.println("Le nombre totale des etudiant dans tous les groupes est : "+Etudiant.nbTotalEtudiant);
    }
}
