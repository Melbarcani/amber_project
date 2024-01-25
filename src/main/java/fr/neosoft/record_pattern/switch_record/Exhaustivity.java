package fr.neosoft.record_pattern.switch_record;

public class Exhaustivity {
    class Employe {
    }

    class Developpeur extends Employe {
    }

    class Gestionnaire extends Employe {
    }

    sealed interface Projet permits ProjetLogiciel, ProjetMarketing {
    }

    final class ProjetLogiciel implements Projet {
    }

    final class ProjetMarketing implements Projet {
    }

    record Pair<T>(T x, T y) {
    }

    Pair<Employe> pairEmploye;
    Pair<Projet> pairProjet;

    void dummyExample() {
// Cette instruction switch n'est pas exhaustive, car il n'y a pas de correspondance
// pour une paire contenant deux valeurs, toutes deux de type Employe:
        switch (pairEmploye) {                 // Erreur!
            case Pair<Employe>(Employe e, Developpeur d) -> System.out.println("something");
            case Pair<Employe>(Developpeur d, Employe e) -> System.out.println("something");
        }

// Ces deux instructions switch sont exhaustives, car l'interface Projet est scellée
// et donc les types ProjetLogiciel et ProjetMarketing couvrent toutes les instances possibles:
        switch (pairProjet) {
            case Pair<Projet>(Projet p, ProjetLogiciel pl) -> System.out.println("something");
            case Pair<Projet>(Projet p, ProjetMarketing pm) -> System.out.println("something");
        }

        switch (pairProjet) {
            case Pair<Projet>(ProjetLogiciel pl, Projet p) -> System.out.println("something");
            case Pair<Projet>(ProjetMarketing pm, ProjetLogiciel pl) -> System.out.println("something");
            case Pair<Projet>(ProjetMarketing pm1, ProjetMarketing pm2) -> System.out.println("something");
        }

// En revanche, cette instruction switch n'est pas exhaustive:
        switch (pairProjet) {                          // Erreur!
            case Pair<Projet>(ProjetLogiciel pl, ProjetMarketing pm) -> System.out.println("something");
            case Pair<Projet>(ProjetMarketing pm, ProjetLogiciel pl) -> System.out.println("something");
            case Pair<Projet>(Projet p, ProjetLogiciel pl) -> System.out.println("something");
        }
    }

    void dummyExample2() {
        // Ce switch n'est pas exhaustif, car il n'y a pas de cas pour une paire contenant deux valeurs de type Employe :
        switch (pairEmploye) {                 // Erreur !
            case Pair<Employe>(Employe e, Developpeur d) -> System.out.println("something");
            case Pair<Employe>(Developpeur d, Employe e) -> System.out.println("something");
        }

// Ces deux switchs sont exhaustifs, car l'interface Projet est scellée 
// et les types ProjetLogiciel et ProjetMarketing couvrent toutes les instances possibles :
        switch (pairProjet) {
            case Pair<Projet>(Projet p, ProjetLogiciel pl) -> System.out.println("something");
            case Pair<Projet>(Projet p, ProjetMarketing pm) -> System.out.println("something");
        }

        switch (pairProjet) {
            case Pair<Projet>(ProjetLogiciel pl, Projet p) -> System.out.println("something");
            case Pair<Projet>(ProjetMarketing pm, ProjetLogiciel pl) -> System.out.println("something");
            case Pair<Projet>(ProjetMarketing pm1, ProjetMarketing pm2) -> System.out.println("something");
        }

// En revanche, ce switch n'est pas exhaustif, 
// car il n'y a pas de cas pour une paire contenant deux valeurs de type ProjetMarketing :
        switch (pairProjet) {                          // Erreur !
            case Pair<Projet>(ProjetLogiciel pl, ProjetMarketing pm) -> System.out.println("something");
            case Pair<Projet>(ProjetMarketing pm, ProjetLogiciel pl) -> System.out.println("something");
            case Pair<Projet>(Projet p, ProjetLogiciel pl) -> System.out.println("something");
        }
    }
}
