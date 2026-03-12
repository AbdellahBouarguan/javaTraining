package TP2.Exercice2;

public class Stagiaire {
    private String nom;
    private float[] notes;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float[] getNotes() {
        return notes;
    }

    public void setNotes(float[] notes) {
        this.notes = notes;
    }

    public Stagiaire(String nom, float[] notes) {
        this.nom = nom;
        this.notes = notes;
    }

    public float calculerMoyenne(){
        float s = 0.0f;
        for (float n:notes) {
            s+=n;
        }
        return s/notes.length;
    }

    public float trouverMax(){
        float s = notes[0];
        for (float n:notes) {
            if (n>=s)
                s = n;
        }
        return s;
    }

    public float trouverMin(){
        float s = notes[0];
        for (float n:notes) {
            if (n<=s)
                s = n;
        }
        return s;
    }
}
