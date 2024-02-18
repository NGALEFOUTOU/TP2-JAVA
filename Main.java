package biblio;

public class Main {
    public static void main(String[] args) {
        // Instance de la classe Bibliotheque

        Bibliotheque bibliotheque = new Bibliotheque();
        Livre livre1 = new Livre("colombiano", "wesley briton", 2000);
        Livre livre2 = new Livre("Le dessert", "Morgan halley", 2003);
        Livre livre3 = new Livre("Vestige", "Quant", 1925);

        // Ajout des livres

        bibliotheque.ajouterLivres(livre1);
        bibliotheque.ajouterLivres(livre2);
        bibliotheque.ajouterLivres(livre3);

        // Affiche les details de tous les livres

        bibliotheque.afficherLivres();

        // Recherche a partir du nom

        bibliotheque.rechercherLivreParAuteur("Quat");
    }
    }
