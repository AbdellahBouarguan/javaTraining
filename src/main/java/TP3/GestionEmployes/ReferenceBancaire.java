package TP3.GestionEmployes;

public class ReferenceBancaire {
    private int numeroClient;
    private String nomTitulaire;
    private String prenomTitulaire;
    private String nomBanque;

    public ReferenceBancaire(int numeroClient, String nomTitulaire, String prenomTitulaire, String nomBanque) {
        this.numeroClient = numeroClient;
        this.nomTitulaire = nomTitulaire;
        this.prenomTitulaire = prenomTitulaire;
        this.nomBanque = nomBanque;
    }

    public void afficher() {
        System.out.println("Banque: " + nomBanque + " (Client: " + numeroClient + ") Titulaire: " + nomTitulaire + " " + prenomTitulaire);
    }
}
