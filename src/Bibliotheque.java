import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotheque {
    ArrayList<Livre> listeLivre;
    int prochainID;

    public Bibliotheque() {
        prochainID = 1;
        listeLivre = new ArrayList<>();
    }

    public int nbLivres() {
        return listeLivre.size();
    }

    public int prochainId() {
        int id = prochainID;
        prochainID++;
        return id;
    }

    public void afficherLivres() {
        if (listeLivre.isEmpty()) {
            System.out.println("Il n'y a aucun livre dans la bibliothèque");
            return;
        }
        for (Livre livre2 : listeLivre) {
                System.out.println(livre2);
            }
    }

    public void ajouterLivre(Livre L) {
        listeLivre.add(L);
    }

    public void rechercherLivre(int id) {
        boolean trouve = false;
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
    }

    public void supprimerLivre(int id) {
        boolean trouve = false;
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
    }
}


