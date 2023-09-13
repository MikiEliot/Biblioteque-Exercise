import java.util.Scanner;

public class Livre {

    public String titre;
    private String auteur;
    private String editeur;

    public Livre() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez renseigner le titre de livre : ");
        this.titre = scan.nextLine();

        System.out.println("Veuillez renseigner le nom d'auteur : ");
        this.auteur = scan.nextLine();

        System.out.println("Veuillez renseigner le nom d'éditeur : ");
        this.editeur = scan.nextLine();

        System.out.println("Vous avez enregister livre " + this.titre + " de l'auteur " + this.auteur + " publié par : " + this.editeur);

    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", editeur='" + editeur + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Livre livre = new Livre();
        System.out.println(livre.toString());
    }
}