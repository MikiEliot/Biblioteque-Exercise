
public class Biblioteque {

    public static void main(String[] args) {


        Object[] biblioteque = new Object[3];

        for (int i=0; i<biblioteque.length;i++){
            biblioteque[i] = choixLivre();
        }

        affichage(biblioteque);
        System.out.println("nombre des livres est :" + biblioteque.length);
        supprimerLivre(biblioteque);
        affichage(biblioteque);
        rechercheEditeur(biblioteque);
        rechercheTitre(biblioteque);
    }
    public static Livre choixLivre(){
        return new Livre();
    }
    public static void rechercheEditeur(Object[] biblioteque) {
        System.out.println("Veuillez renseigner l'editeur : ");
        String editeur = Util.scan.nextLine();


        boolean found = false;

        for (int i = 0; i < biblioteque.length; i++) {
            if (biblioteque[i] instanceof Livre) {
                Livre livre = (Livre) biblioteque[i];
                if (editeur.equals(livre.getEditeur())) {
                    System.out.println("Livre trouvé : " + livre.getTitre());
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Aucun livre de cet éditeur trouvé.");
        }


    }
    public static void rechercheTitre(Object[] biblioteque) {
        System.out.println("Veuillez renseigner le titre : ");
        String titre = Util.scan.nextLine();


        boolean found = false;

        for (int i = 0; i < biblioteque.length; i++) {
            if (biblioteque[i] instanceof Livre) {
                Livre livre = (Livre) biblioteque[i];
                if (titre.equals(livre.getTitre())) {
                    System.out.println("Livre trouvé : " + livre.getTitre());
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Aucun livre à ce titre n'a pas été trouvé.");
        }


    }
    public static void supprimerLivre(Object[] biblioteque) {
        System.out.println("Veuillez renseigner le indice de livre à supprimer : ");
        int indice = Util.scan.nextInt();
        if (biblioteque[indice] instanceof Livre) {
            Livre livre = (Livre) biblioteque[indice];
            System.out.println(livre.titre + " sera supprimé");
        } else {
            System.out.println("Cet élément n'est pas un livre.");
        }

        biblioteque[indice] = null;


    }
    public static void affichage(Object[] biblioteque) {
        for (int i = 0; i < biblioteque.length; i++) {
            if (biblioteque[i] != null) {
                System.out.println(biblioteque[i]);
            }
        }
    }

}
