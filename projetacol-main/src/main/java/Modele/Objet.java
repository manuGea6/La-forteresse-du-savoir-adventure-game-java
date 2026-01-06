package Modele;

// Classe représentant un objet du jeu
abstract class Objet {
    protected String nom;

    public Objet(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
