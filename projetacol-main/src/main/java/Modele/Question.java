package Modele;

import java.util.List;

// Classe représentant une question posée par un maître de salle ou un gardien
class Question {
    private String texte;
    private List<Proposition> propositions;
    private Proposition reponseCorrecte;

    public Question(String texte, List<Proposition> propositions, Proposition reponseCorrecte) {
        this.texte = texte;
        this.propositions = propositions;
        this.reponseCorrecte = reponseCorrecte;
    }

    public boolean verifierReponse(Proposition reponse) {
        return reponse.equals(reponseCorrecte);
    }
}
