package TP5.Exercice1;

public class MainTest {
    public static void main(String[] args) {
        GestionExamen gestion = new GestionExamen();

        try {
            ExamenFinal e1 = new ExamenFinal(1, 15.5, "Prof A", "Maths", 2023, "10:00");
            ExamenFinal e2 = new ExamenFinal(2, 12.0, "Prof B", "Physique", 2021, "14:00");
            ExamenFinal e3 = new ExamenFinal(3, 18.0, "Prof C", "Info", 2024, "08:00");
            ExamenRattrapage e4 = new ExamenRattrapage(4, 10.0, "Prof D", "Chimie", "ecrit");

            gestion.ajouterExamen(e1);
            gestion.ajouterExamen(e2);
            gestion.ajouterExamen(e3);
            gestion.ajouterExamen(e4);

            System.out.println("--- Liste Complete ---");
            gestion.afficherListe();

            gestion.trierFinauxParAnnee();

            ExamenFinal invalid = new ExamenFinal(5, 25.0, "Prof E", "Biologie", 2025, "09:00");
        } catch (NoteInvalide e) {
            System.err.println("Exception attrapee: " + e.getMessage());
        }
    }
}
