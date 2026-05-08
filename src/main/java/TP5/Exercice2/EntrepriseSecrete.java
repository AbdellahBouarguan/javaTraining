package TP5.Exercice2;

public class EntrepriseSecrete extends Entreprise {
    public EntrepriseSecrete(int nombreEmployes, int capital, String nom, String mission) {
        super(nombreEmployes, capital, nom, mission);
    }

    @Override
    public String mission() throws SecretMissionException {
        throw new SecretMissionException();
    }
}
