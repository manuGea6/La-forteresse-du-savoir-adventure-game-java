package Modele;

import java.util.List;

// Classe représentant le personnage principal
class PersonnagePrincipal {
    private String nom;
    private int vies;
    private List<Objet> inventaire;

    public PersonnagePrincipal(String nom) {
        this.nom = nom;
        this.vies = 3;
    }

    public void perdreVie() {
        vies--;
    }

    public void gagnerVie() {
        if(vies<3) {
            vies++;
        }
    }


    public boolean estVivant() {
        return vies > 0;
    }
}
