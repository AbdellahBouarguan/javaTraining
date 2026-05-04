package TP5.Exercice1;

public abstract class Examen {
    protected int numeroEnregistrement;
    protected double note;
    protected String profResponsable;
    protected String matiere;

    public Examen(int numeroEnregistrement, double note, String profResponsable, String matiere) throws NoteInvalide {
        if (note < 0 || note > 20) {
            throw new NoteInvalide();
        }
        this.numeroEnregistrement = numeroEnregistrement;
        this.note = note;
        this.profResponsable = profResponsable;
        this.matiere = matiere;
    }

    public abstract void afficher();
}
