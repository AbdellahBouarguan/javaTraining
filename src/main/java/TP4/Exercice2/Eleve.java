package TP4.Exercice2;

import java.util.ArrayList;

public class Eleve implements Comparable<Eleve> {
    private String nom;
    private ArrayList<Integer> listeNotes;
    private double moyenne;

    public Eleve(String nom) {
        this.nom = nom;
        this.listeNotes = new ArrayList<>();
        this.moyenne = 0.0;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Integer> getListeNotes() {
        return listeNotes;
    }

    public void ajouterNote(int note) {
        if (note < 0) note = 0;
        if (note > 20) note = 20;
        
        double somme = moyenne * listeNotes.size();
        listeNotes.add(note);
        moyenne = (somme + note) / listeNotes.size();
    }

    @Override
    public String toString() {
        return nom + " (" + moyenne + ")";
    }

    @Override
    public int compareTo(Eleve autreEleve) {
        return Double.compare(this.moyenne, autreEleve.getMoyenne());
    }
}
