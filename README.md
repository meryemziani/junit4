<p align="center">
    <img src="screen/logo.png" alt="Logo du Projet" />
</p>

# Amélioration du projet : JUnit 4 

## Travail encadré par : Cyril FERLICOT

### Travail fait par :
- **ZIANI Meryem**

## Table des Matières
0. [Outils utilisés](#outils_utilisés)
1. [Petites modifications](#petites_modifications)
2. [Moyennes modifications](#moyennes_modifications)
3. [Grandes modifications](#grandes_modifications)
4. [Développement](#développement)
5. [Conclusion](#conclusion)

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

### Changer le nombre de paramétre :

Dans **src/main/java/junit/framework/JUnit4TestAdapterCache.java** :

J'ai supprimé l'argument ***adapter*** de la méthode ***getNotifier*** car il n'était pas utilisé dans le contexte de cette méthode. En le retirant, j'ai simplifié l'interface de la méthode et rendu le code plus clair et plus facile à comprendre pour d'autres développeurs qui pourraient travailler sur ce code à l'avenir. La suppression de cet argument réduit également la complexité du code en éliminant une fonctionnalité inutilisée, ce qui contribue à maintenir une base de code propre et cohérente.

Lien vers le commit :
  [Lien vers le commit](https://github.com/junit-team/junit4/commit/532403049453c6d72515fbd6f994e1ab92d5f6fb)

### Supprimer des nombres magiques :

L'utilisation de constantes comme ***METHOD*** au lieu de valeurs littérales directes telles que ***"Method"*** aide à éviter les "nombres magiques". Un nombre magique est une valeur codée en dur qui peut sembler arbitraire et dénuée de contexte. En définissant METHOD comme une constante avec un nom significatif, nous attribuons une signification claire à cette valeur et la rendons réutilisable et facilement identifiable dans tout le code. En conséquence, cela rend le code plus lisible, plus compréhensible et plus facile à maintenir car si jamais le libellé "Method" doit être modifié, il ne nécessite qu'une modification de la constante METHOD, plutôt que de rechercher et modifier chaque occurrence de la chaîne directement dans le code.

Lien vers le commit :
  [Lien vers le commit](https://github.com/junit-team/junit4/commit/7c7f8224c7af79a4649f3b0da44902de0181bb41)

