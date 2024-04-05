<p align="center">
    <img src="screen/logo.png" alt="Logo du Projet" />
</p>

# Amélioration du projet : JUnit 4 

## Travail encadré par : Cyril FERLICOT

### Travail fait par :
- **ZIANI Meryem**

## Table des Matières
0. [Outils utilisés]
1. [Petites modifications]
2. [Moyennes modifications]
3. [Grandes modifications]
4. [Développement]
5. [Conclusion]

## Outils Utilisés
- SonarQube
- IntelliJ
- Plugin Metrics Reloaded

## Petites modification : 
### Renommage :
  
- Une classe :
  
  ***RepeatedTestCaseDecorator*** est plus descriptif que ***RepeatedTest***. Il suggère clairement que la classe est un décorateur pour les cas de test répétés, ce qui donne une meilleure idée de son objectif et de son rôle dans le code.
  
 Lien vers le commit :
[Lien vers le commit ](https://github.com/junit-team/junit4/commit/71000c03baa8f14325e4536aeb91bd2c7bff9c5b)

- Une variable :
  
  J'ai changé ***fTimesRepeat*** par ***repeatCount*** car elle est plus explicite et décrit directement le rôle de cette variable dans le contexte des tests répétés. Cela rend le code plus compréhensible pour les autres développeurs qui peuvent parcourir le code ultérieurement.
  
  Lien vers le commit :
   [Lien vers le commit ](https://github.com/junit-team/junit4/commit/f1b36e420ae9381b64fbe8d40eb4f241687a5644)

  - Une méthode :
 
  J'ai changé ***compactString*** par ***compactifyString*** car il est plus descriptif et exprime clairement l'action effectuée par la méthode. Il indique que la méthode transforme ou modifie la chaîne de caractères pour la rendre plus compacte.

  Lien vers le commit :
  [Lien vers le commit](https://github.com/junit-team/junit4/commit/532403049453c6d72515fbd6f994e1ab92d5f6fb)


