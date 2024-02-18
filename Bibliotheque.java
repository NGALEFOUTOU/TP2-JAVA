package biblio;
import java.util.ArrayList;


public class Bibliotheque {
    // Attributs

    private ArrayList<Livre> listeLivres;

    // Constructeur

    public Bibliotheque() {
        this.listeLivres = new ArrayList<>();
    }

    // Méthodes

    // Methode pour ajouter un livre
    public void ajouterLivres(Livre livre) {
        this.listeLivres.add(livre);
    }
    // Methode pour rechercher un livre
    public void rechercherLivreParAuteur(String nomAutor){
        boolean b = false;
        for(Livre livre : this.listeLivres){
            if(nomAutor.equals(livre.getNomAuteur())){

                livre.afficherDetails();
                b = true; // change l'etat du bool
            }
        }
        if(!b){
            System.out.println("Aucun livre de l'auteur " +nomAutor);
        }
    }

    // Methode pour afficher des livres
    public void afficherLivres(){
        if (listeLivres.isEmpty()){
            System.out.println("Desole la bibliotheque est vide.");
        } else {
            System.out.println("BIENVENUE DANS LA BIBLIOHEQUE !! JEAH !!  ");
                for (Livre livre : listeLivres) {
                    System.out.println("\nTitre : " + livre.getTitre() +
                            "\nNom de l'auteur : " + livre.getNomAuteur() +
                            "\nAnnee de publication : " + livre.getpublicationYear());

                }

        }
    }
}






