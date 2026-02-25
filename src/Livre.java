public class Livre {
  private int id;
  private String titre;
  private String auteur;
  private int annee;

  public Livre(int identifiant, String t, String aut, int an) {
    this.id = identifiant;
    this.titre = t;
    this.auteur = aut;
    this.annee = an;
  }

  public int getId() {
    return this.id;
  }

  public String toString() {
    return "[" + this.id + "] " + this.titre + " - " + this.auteur + "(" + this.annee + ")" ;
  }
}
