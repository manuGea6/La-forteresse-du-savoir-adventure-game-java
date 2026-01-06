package Modele;

// Classe représentant un disque dur contenant la connaissance d'un maitre de salle
class DisqueDur extends Objet {
    private String donnees;

    public DisqueDur(String nom, String donnees) {
        super(nom);
        this.donnees = donnees;
    }

    public String getDonnees() {
        return donnees;
    }
}
