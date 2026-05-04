package TP5.Exercice1;

public class ExamenFinal extends Examen implements Comparable<ExamenFinal> {
    private int annee;
    private String heurePassage;

    public ExamenFinal(int numeroEnregistrement, double note, String profResponsable, String matiere, int annee, String heurePassage) throws NoteInvalide {
        super(numeroEnregistrement, note, profResponsable, matiere);
        this.annee = annee;
        this.heurePassage = heurePassage;
    }

    public int getAnnee() {
        return annee;
    }

    @Override
    public void afficher() {
        System.out.println("Examen Final: " + matiere + ", Annee: " + annee + ", Note: " + note);
    }

    @Override
    public int compareTo(ExamenFinal autre) {
        return Integer.compare(this.annee, autre.annee);
    }
}
