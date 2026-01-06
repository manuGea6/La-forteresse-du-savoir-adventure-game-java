package Modele;
import java.util.List;
// Classe représentant une salle
class Salle {
    private String nom;
    private List<Objet> objets;
    private MaitreDeSalle maitreDeSalle;
    private CleUSB cleUSB;

    public Salle(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public MaitreDeSalle getMaitreDeSalle() {
        return maitreDeSalle;
    }

    public void setMaitreDeSalle(MaitreDeSalle maitreDeSalle) {
        this.maitreDeSalle = maitreDeSalle;
    }

    public boolean estVide() {
        return maitreDeSalle == null;
    }

    public CleUSB getCleUSB() {
        return cleUSB;
    }

    public void setCleUSB(CleUSB cleUSB) {
        this.cleUSB = cleUSB;
    }
}




