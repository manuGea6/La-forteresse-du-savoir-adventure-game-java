package Modele;

import java.util.List;

// Classe représentant un personnage secondaire (gardien ou maître de salle)
abstract class PersonnageSecondaire {
    protected String nom;
    protected List<Question> questions;

    public PersonnageSecondaire(String nom, List<Question> questions) {
        this.nom = nom;
        this.questions = questions;
    }

    public boolean poserQuestion(Proposition reponse, int index) {
        if (index >= 0 && index < questions.size()) {
            return questions.get(index).verifierReponse(reponse);
        }
        return false;
    }
}

