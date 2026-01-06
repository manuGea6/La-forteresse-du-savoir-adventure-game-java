package Modele;


import java.util.List;

// Classe représentant un maître de salle
class MaitreDeSalle extends PersonnageSecondaire {
    private DisqueDur disqueDur;
    private Salle salle;

    public MaitreDeSalle(String nom, List<Question> questions, DisqueDur disqueDur, Salle salle) {
        super(nom, questions);
        this.disqueDur = disqueDur;
        this.salle = salle;
        this.salle.setMaitreDeSalle(this);
    }

    public DisqueDur getDisqueDur() {
        return disqueDur;
    }
}

