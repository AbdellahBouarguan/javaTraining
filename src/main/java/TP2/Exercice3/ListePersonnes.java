package TP2.Exercice3;

import java.util.Objects;

public class ListePersonnes {
    private Personne[] personnes;

    public Personne[] getPersonnes() {
        return personnes;
    }

    public void setPersonnes(Personne[] personnes) {
        this.personnes = personnes;
    }

    public ListePersonnes(Personne[] personnes) {
        this.personnes = personnes;
    }

    public Personne findByNom(String s) {
        if (personnes != null) {
            for (Personne p : personnes) {
                if (p != null && Objects.equals(p.getNom(), s)) {
                    return p;
                }
            }
        }
        return null;
    }

    public boolean findByCodePostal(String cp) {
        if (personnes != null) {
            for (Personne p : personnes) {
                if (p != null && p.getAdresses() != null) {
                    for (Adresse adr : p.getAdresses()) {
                        if (adr != null && Objects.equals(adr.getCodePostal(), cp)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int countPersonneVille(String ville) {
        int count = 0;
        if (personnes != null) {
            for (Personne p : personnes) {
                if (p != null && p.getAdresses() != null) {
                    for (Adresse adr : p.getAdresses()) {
                        if (adr != null && Objects.equals(adr.getVille(), ville)) {
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }

    public void editPersonneNom(String oldNom, String newNom) {
        if (personnes != null) {
            for (Personne p : personnes) {
                if (p != null && Objects.equals(p.getNom(), oldNom)) {
                    p.setNom(newNom);
                }
            }
        }
    }

    public void editPersonneVille(String nom, String newVille) {
        if (personnes != null) {
            for (Personne p : personnes) {
                if (p != null && Objects.equals(p.getNom(), nom) && p.getAdresses() != null) {
                    for (Adresse adr : p.getAdresses()) {
                        if (adr != null) {
                            adr.setVille(newVille);
                        }
                    }
                }
            }
        }
    }
}
