package TP1.Exercice2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupeEtudiant {
    private String nom, niveau;
    private Etudiant[] etudiants;
    private List<Etudiant> listEtudiants = new ArrayList<Etudiant>();

    public GroupeEtudiant() {
    }

    public GroupeEtudiant(String nom) {
        this.nom = nom;
    }

    public GroupeEtudiant(String nom, String niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    public GroupeEtudiant(String nom, String niveau, Etudiant[] etudiants) {
        this.nom = nom;
        this.niveau = niveau;
        this.etudiants = etudiants;

//        for (Etudiant e: etudiants) {
//            listEtudiants.add(e);
//        }

        listEtudiants.addAll(Arrays.asList(etudiants));
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public Etudiant[] getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Etudiant[] etudiants) {
        this.etudiants = etudiants;
    }

    public List<Etudiant> getListEtudiants() {
        return listEtudiants;
    }

    public void setListEtudiants(List<Etudiant> listEtudiants) {
        this.listEtudiants = listEtudiants;
    }

    public void ajouterEtudiant(Etudiant etudiant){
        Etudiant[] nouveauEtudiants = Arrays.copyOf(this.etudiants,this.etudiants.length+1);
        nouveauEtudiants[this.etudiants.length] = etudiant;
        this.etudiants = nouveauEtudiants;

    }

    public void ajouterEtudiantQ4(Etudiant etudiant){
        listEtudiants.add(etudiant);
    }

    public void afficher(){
        for(Etudiant e:etudiants ) {
            System.out.println(e.getCne()+"\t"+e.getNom()+"\t"+e.getPrenom());
        }
    }

    public void afficherQ4(){
        listEtudiants.forEach(e -> System.out.println(e.getCne()+"\t"+e.getNom()+"\t"+e.getPrenom()));
    }

    public void afficherSuperieurADix(){
        for(Etudiant e:etudiants ) {
            if(e.getMoyenne()>=10){
                System.out.println(e.getCne()+"\t"+e.getNom()+"\t"+e.getPrenom());
            }
        }
    }

    public void afficherSuperieurADixQ4(){
        listEtudiants.stream()
                .filter(e -> e.getMoyenne() >= 10 )
                .forEach(e -> System.out.println(e.getCne()+"\t"+e.getNom()+"\t"+e.getPrenom()));
    }

    public int nbrEtdGrp(){
        return etudiants.length;
    }

    public int nbrEtdGrpQ4(){
        return listEtudiants.size();
    }

}
