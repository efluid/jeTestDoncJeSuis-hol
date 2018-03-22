package js.jetestdoncjesuis;

import java.util.*;

public class ContexteTest {

  public static Collection<Ecran> creerEcrans() {
    Ecran ecranAccueil = new Ecran("ecran d'accueil");
    ecranAccueil.addBouton("ecran d'accueil > premier �cran");
    ecranAccueil.addBouton("ecran d'accueil > deuxi�me �cran");

    Ecran premierEcran = new Ecran("premier �cran");
    premierEcran.addBouton("premier �cran > consulter Toto");
    premierEcran.addBouton("premier �cran > consulter Titi");
    premierEcran.addBouton("premier �cran > consulter Tata");

    Ecran deuxiemeEcran = new Ecran("deuxi�me �cran");
    deuxiemeEcran.addBouton("deuxi�me �cran > consulter tester c'est douter");
    deuxiemeEcran.addBouton("deuxi�me �cran > consulter tester c'est l'adopter");
    deuxiemeEcran.addBouton("deuxi�me �cran > consulter tester c'est ramer");

    Collection<Ecran> ecrans = new HashSet<Ecran>();
    ecrans.add(ecranAccueil);
    ecrans.add(premierEcran);
    ecrans.add(deuxiemeEcran);
    return ecrans;
  }
}
