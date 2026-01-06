package Modele;

// Classe représentant une clé associée à une salle spécifique
class Cle extends Objet {
    private Salle salleAssociee;

    public Cle(String nom, Salle salleAssociee) {
        super(nom);
        this.salleAssociee = salleAssociee;
    }

    public Salle getSalleAssociee() {
        return salleAssociee;
    }
}
