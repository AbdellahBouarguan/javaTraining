package TP3.Exercice7;

public abstract class Personnel extends Personne {
    protected String bureau;

    public Personnel(String nom, String prenom, String bureau) {
        super(nom, prenom);
        this.bureau = bureau;
    }

    public abstract double Calculer_Salaire();
}
