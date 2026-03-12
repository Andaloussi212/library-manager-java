import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Bibliotheque bibliotheque = new Bibliotheque();

    int choix;
    do  {
      System.out.println("==========MENU==========");
      System.out.println("1 - Ajouter un livre");
      System.out.println("2 - Lister les livres");
      System.out.println("3 - Rechercher un livre");
      System.out.println("4 - Supprimer un livre");
      System.out.println("0 - Quitter");

      choix = sc.nextInt();
      sc.nextLine();

      if (choix == 1) {
        System.out.println("Veuillez entrer le titre de votre livre");
        String titre = sc.nextLine();

        System.out.println("Veuillez entrer l'auteur de votre livre");
        String auteur = sc.nextLine();

        System.out.println("Veuillez la date de sortie de votre livre");
        int annee = sc.nextInt();

        sc.nextLine();

        int id = bibliotheque.prochainID;
        Livre nouveauLivre = new Livre(id, titre, auteur, annee);
        bibliotheque.ajouterLivre(nouveauLivre);

        System.out.println("Livre ajouté !");
      } else if (choix == 2) {
          bibliotheque.afficherLivres();
    } else if (choix == 3){
        System.out.println("Veuillez entrez l'ID du livre recherché");
        int id = sc.nextInt();
        bibliotheque.rechercherLivre(id);

      } else if (choix == 4) {
        System.out.println("Veuillez entrez l'ID du livre que vous voulez supprimer");
        int id = sc.nextInt();
        bibliotheque.supprimerLivre(id);


      } else if (choix != 0) {
    System.out.println("Choix invalide");
    }
    } while (choix != 0);

sc.close();
System.out.println("Au revoir !");
}
}
