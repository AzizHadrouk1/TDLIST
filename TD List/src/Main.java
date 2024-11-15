public class Main {
    public static void main(String[] args) {
        GestionUniversity gestion = new GestionUniversity();

        // Création d'étudiants
        Etudiant e1 = new Etudiant(1, "Dupont", "Jean");
        Etudiant e2 = new Etudiant(2, "Martin", "Claire");
        Etudiant e3 = new Etudiant(3, "Durand", "Paul");

        // Ajout des étudiants
        gestion.ajouterEtudiant(e1);
        gestion.ajouterEtudiant(e2);
        gestion.ajouterEtudiant(e3);

        // Affichage des étudiants
        System.out.println("Liste des étudiants :");
        gestion.displayEtudiants();

        // Recherche d'un étudiant par nom
        System.out.println("\nRecherche par nom (Martin) : " + gestion.rechercherEtudiant("Martin"));

        // Recherche d'un étudiant par objet
        System.out.println("Recherche par objet (e1) : " + gestion.rechercherEtudiant(e1));

        // Suppression d'un étudiant
        gestion.supprimerEtudiant(e2);
        System.out.println("\nListe après suppression de Martin :");
        gestion.displayEtudiants();

        // Tri par ID
        gestion.trierEtudiantsParId();
        System.out.println("\nListe triée par ID :");
        gestion.displayEtudiants();

        // Tri par nom
        gestion.trierEtudiantsParNom();
        System.out.println("\nListe triée par nom :");
        gestion.displayEtudiants();
    }
}
