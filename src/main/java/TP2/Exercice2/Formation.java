package TP2.Exercice2;

import java.util.Objects;

public class Formation {
    private String intitule;
    private int nbrJours;
    private Stagiaire[] stagaires;

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getNbrJours() {
        return nbrJours;
    }

    public void setNbrJours(int nbrJours) {
        this.nbrJours = nbrJours;
    }

    public Stagiaire[] getStagaires() {
        return stagaires;
    }

    public void setStagaires(Stagiaire[] stagaires) {
        this.stagaires = stagaires;
    }

    public Formation(String intitule, int nbrJours, Stagiaire[] stagaires) {
        this.intitule = intitule;
        this.nbrJours = nbrJours;
        this.stagaires = stagaires;
    }

    public float calculerMoyenneFormation(){
        float moyFormation = 0.0f;
        for (Stagiaire s: stagaires) {
            moyFormation+=s.calculerMoyenne();
        }
        return moyFormation/stagaires.length;
    }

    public int getIndexMax(){
        int index = 0;
        float pivot = stagaires[0].calculerMoyenne();
        for (int i = 0; i < stagaires.length; i++) {
            if(stagaires[i].calculerMoyenne()>=pivot)
                index = i;
        }
        return index;
    }

    public void afficherNomMax(){
        System.out.println("Stagiaire avec meilleure moyenne dans la formation est "+stagaires[getIndexMax()].getNom());
    }

    public void afficherMinMax(){
        System.out.println("Note minimale de stagiaire avec meilleure moyenne dans la formation est "+stagaires[getIndexMax()].trouverMin());
    }

    public void trouverMoyenneParNom(String nom){
        for (Stagiaire s: stagaires){
            if(Objects.equals(s.getNom(), nom)){
                System.out.println("La moyenne du stagiaire "+s.getNom()+" est "+s.calculerMoyenne());
            }
        }
    }


}
