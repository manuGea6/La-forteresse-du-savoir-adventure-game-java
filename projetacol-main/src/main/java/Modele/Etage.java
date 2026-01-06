package Modele;

import java.util.List;

public class Etage {
    // Classe représentant un étage contenant plusieurs salles
        private int numero;
        private List<Salle> salles;

        public Etage(int numero, List<Salle> salles) {
            this.numero = numero;
            this.salles = salles;
        }
    }

