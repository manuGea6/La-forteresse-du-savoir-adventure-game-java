package Modele;

import java.util.List;

// Classe représentant un gardien d'étage
class GardienDEtage extends PersonnageSecondaire {
    public GardienDEtage(String nom, List<Question> questions) {
        super(nom, questions);
    }
}

