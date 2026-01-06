# 🏰 La Forteresse du Savoir

## Présentation

**La Forteresse du Savoir** est un jeu d’aventure narratif développé en **Java avec JavaFX**.  
Le joueur explore une forteresse mystérieuse composée de plusieurs étages et salles thématiques,
remplies d’énigmes, de personnages gardiens et de défis intellectuels.

L’objectif est de progresser à travers les salles, d’acquérir des connaissances, de collecter
des objets clés et d’atteindre la **salle du trésor**, ultime récompense de l’aventure.

---

## 🧙 Concept du jeu

Le joueur incarne un explorateur entrant dans une forteresse où chaque salle représente un
domaine de connaissance.  
Certaines salles sont calmes et permettent de récupérer des objets, tandis que d’autres sont
surveillées par des maîtres de salle qui posent des énigmes pour bloquer la progression.

Chaque victoire rapproche le joueur du trésor final.

---

## 🎯 Objectifs du joueur

- Explorer les différentes salles du château
- Résoudre des énigmes à choix multiples
- Affronter des maîtres de salle pour obtenir des clés
- Passer d’un étage à un autre en affrontant des gardiens
- Gérer ses vies et son inventaire
- Résoudre des charades pour découvrir la bonne salle suivante
- Atteindre la salle du trésor et remporter la partie

---

## 🗺️ Monde et mécaniques de jeu

### 🏠 Les salles
- **Salles vides**  
  Contiennent des objets utiles : clés, vies supplémentaires, artefacts de connaissance.
- **Salles gardées**  
  Surveillées par un maître de salle qui pose une énigme.
  - Bonne réponse → progression et récompenses
  - Mauvaise réponse → perte d’une vie et nouvelle tentative

### 🧱 Les étages
- Le château est composé de plusieurs étages
- Les changements d’étage passent par des escaliers surveillés
- Chaque escalier est gardé par un **gardien d’étage** qui pose une question

### 🧩 Les charades
Après avoir gagné une clé, la salle suivante n’est pas révélée directement.  
Le joueur doit résoudre une charade pour identifier la bonne salle à explorer.

---

## ❤️ Gestion du joueur

- Le joueur commence avec un nombre limité de vies
- Une mauvaise réponse face à un maître fait perdre une vie
- Certaines salles permettent de récupérer des vies
- Si le nombre de vies tombe à zéro, la partie est perdue

---

## 🏆 Conditions de victoire et de défaite

### Victoire
- Atteindre la salle du trésor
- Réussir les épreuves finales
- Débloquer l’artefact ultime de connaissance

### Défaite
- Perdre toutes ses vies avant d’atteindre la salle finale

---

## 🧩 Architecture du jeu

Le jeu repose sur une architecture claire et modulaire :

- **Logique de jeu**  
  Gestion du joueur, des salles, des objets et des règles
- **Interface graphique**  
  Écrans interactifs, dialogues et affichage de l’état du joueur
- **Contrôle du jeu**  
  Gestion des choix du joueur, transitions et interactions

Cette organisation permet une évolution facile du jeu (nouvelles salles, énigmes, niveaux).

---

## 🗂️ Structure du projet

.
├── src/
│ ├── jeu/ # Logique principale du jeu
│ ├── personnages/ # Joueur, maîtres, gardiens
│ ├── salles/ # Salles, étages, forteresse
│ ├── objets/ # Clés, vies, artefacts
│ ├── ui/ # Interface JavaFX
│ └── utils/ # Chargement et outils
│
├── resources/
│ ├── data/ # Configuration du monde (JSON)
│ ├── images/ # Ressources graphiques
│ └── fxml/ # Fichiers JavaFX
│
├── pom.xml
└── README.md


---


## 🖼️ Captures d’écran du jeu
## 🖼️ Captures d’écran du jeu


<img src="projetacol-main/images/forteresse.jpg" width="90%" />

<img src="projetacol-main/images/img197.jpg" width="45%" />
<img src="projetacol-main/images/img201.jpg" width="45%" />

<img src="projetacol-main/images/img205.jpg" width="45%" />
<img src="projetacol-main/images/img209.jpg" width="45%" />

<img src="projetacol-main/images/img213.jpg" width="45%" />
<img src="projetacol-main/images/img217.jpg" width="45%" />

<img src="projetacol-main/images/img221.jpg" width="45%" />
<img src="projetacol-main/images/img225.jpg" width="45%" />

<img src="projetacol-main/images/img229.jpg" width="45%" />
<img src="projetacol-main/images/img234.jpg" width="45%" />

<img src="projetacol-main/images/img238.jpg" width="45%" />
<img src="projetacol-main/images/img242.jpg" width="45%" />

<img src="projetacol-main/images/img246.jpg" width="45%" />
<img src="projetacol-main/images/img250.jpg" width="45%" />

<img src="projetacol-main/images/img254.jpg" width="45%" />


## ⚙️ Lancer le jeu

### Prérequis
- Java 11 ou plus
- Maven
- JavaFX

### Exécution

```bash
mvn clean javafx:run

