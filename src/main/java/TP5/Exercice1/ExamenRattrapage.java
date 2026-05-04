package TP5.Exercice1;

public class ExamenRattrapage extends Examen {
    private String forme;

    public ExamenRattrapage(int numeroEnregistrement, double note, String profResponsable, String matiere, String forme) throws NoteInvalide {
        super(numeroEnregistrement, note, profResponsable, matiere);
        this.forme = forme;
    }

    @Override
    public void afficher() {
        System.out.println("Examen Rattrapage: " + matiere + " (" + forme + "), Note: " + note);
    }
}
