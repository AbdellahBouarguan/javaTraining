package TP3.GestionEmployes;

import java.util.ArrayList;
import java.util.List;

public class Personnel {
    private List<Employe> employes;

    public Personnel() {
        this.employes = new ArrayList<>();
    }

    public void embaucher(Employe e) {
        employes.add(e);
    }

    public void licencier(Employe e) {
        employes.remove(e);
    }

    public void licencierTous() {
        employes.clear();
    }

    public void afficherSalaires() {
        for (Employe e : employes) {
            System.out.println(e.nom + " " + e.prenom + " - Salaire: " + e.calculerSalaire());
        }
    }

    public double salaireMoyen() {
        if (employes.isEmpty()) return 0;
        double total = 0;
        for (Employe e : employes) {
            total += e.calculerSalaire();
        }
        return total / employes.size();
    }

    public boolean estDansListe(Employe e) {
        return employes.contains(e);
    }
}
