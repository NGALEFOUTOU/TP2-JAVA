package biblio;

public class Livre {
    // Attribut(s)

    private String titre;
    private String nomAuteur;
    private int publicationYear;

    // Constructeur(s)

    public Livre(String titre, String nomAuteur, int publicationYear) {
        this.titre = titre;
        this.nomAuteur = nomAuteur;
        this.publicationYear = publicationYear;
    }

    // Getter(s)
    public String getTitre(){return titre;}
    public String getNomAuteur(){return nomAuteur;}
    public int getpublicationYear(){return publicationYear;}

    // Setter(s)

    public void setTitre(String titre){ this.titre = titre;}
    public void setNomAuteur(String nomAuteur){ this.nomAuteur = nomAuteur;}
    public void setpublicationYear(int publicationYear){ this.publicationYear =publicationYear;}

    // Méthode(s)
    public void afficherDetails() {
        System.out.println("Titre :" + titre);
        System.out.println("Auteur :" + nomAuteur);
        System.out.println("Anne de Publication :" +publicationYear);
    }

}




