import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Livre> listeLivre = new ArrayList<>();

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

        int id = listeLivre.size() + 1;
        Livre nouveauLivre = new Livre(id, titre, auteur, annee);
        listeLivre.add(nouveauLivre);

        System.out.println("Livre ajouté !");
      } else if (choix == 2) {
        if (listeLivre.isEmpty()) {
          System.out.println("Il n'y a aucun livre dans la bibliothèque");
        } else {
          for (Livre livre2 : listeLivre) {
            System.out.println(livre2);
        }
      }
    } else if (choix == 3){
        boolean trouve = false;
        System.out.println("Veuillez entrez l'ID du livre recherché");
        int id = sc.nextInt();
        for (Livre livre3 : listeLivre) {
          if (livre3.getId() == id) {
            trouve = true;
            System.out.println(livre3);
            break;
          }
        }
        if (!trouve) {
          System.out.println("Erreur : Livre innexistant...");
        }

      } else if (choix == 4) {
        boolean trouve = false;
        System.out.println("Veuillez entrez l'ID du livre que vous voulez supprimer");
        int id = sc.nextInt();
        for (int i = 0; i < listeLivre.size(); i++) {
          Livre livre4 = listeLivre.get(i);
          if (livre4.getId() == id) {
            listeLivre.remove(i);
            System.out.println("Livre supprimé avec succès !");
            trouve = true;
            break;
          }
        }
        if (!trouve) {
          System.out.println("Erreur : Livre innexistant...");
        }


      } else if (choix != 0) {
    System.out.println("Choix invalide");
    }
    } while (choix != 0);

sc.close();
System.out.println("Au revoir !");
}
}
