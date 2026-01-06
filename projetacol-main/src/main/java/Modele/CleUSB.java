package Modele;

// Classe représentant une clé USB prente dans une salle vide salle
class CleUSB extends Objet {
    private String contenu;
    private Salle salleAssociee;

    public CleUSB(String nom, String contenu, Salle salleAssociee) {
        super(nom);
        this.contenu = contenu;
        this.salleAssociee = salleAssociee;
    }

    public String getContenu() {
        return contenu;
    }
    public Salle getSalleAssociee() {
        return salleAssociee;
    }
}

