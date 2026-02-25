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
    } else if (choix != 0) {
    System.out.println("Choix invalide");
    }
    } while (choix != 0);

sc.close();
System.out.println("Au revoir !");
}
}
