package js.jetestdoncjesuis;

import java.util.Collection;
import java.util.HashSet;

public class UtilitaireDeClic {

    private static Collection<Ecran> ecrans = new HashSet<Ecran>();

    static {
        init();
    }

    private static void init() {
        Ecran ecranAccueil = new Ecran("ecran d'accueil");
        ecranAccueil.addBouton("ecran d'accueil > premier �cran");
        ecranAccueil.addBouton("ecran d'accueil > deuxi�me �cran");

        Ecran premierEcran  = new Ecran("premier �cran");
        premierEcran.addBouton("premier �cran > consulter Toto");
        premierEcran.addBouton("premier �cran > consulter Titi");
        premierEcran.addBouton("premier �cran > consulter Tata");
        
        Ecran deuxiemeEcran  = new Ecran("deuxi�me �cran");
        deuxiemeEcran.addBouton("deuxi�me �cran > consulter tester c'est douter");
        deuxiemeEcran.addBouton("deuxi�me �cran > consulter tester c'est l'adopter");
        deuxiemeEcran.addBouton("deuxi�me �cran > consulter tester c'est ramer");
        
        ecrans.add(ecranAccueil);
        ecrans.add(premierEcran);
        ecrans.add(deuxiemeEcran);
    }

    public void clicsAleatoires() throws Exception {
        System.out.println("\n\nD�marrage des clics al�atoires :");
        for (Ecran ecran : ecrans) {
            ecran.clicAleatoire();
        }
        System.out.println("Fin des clics al�atoires\n\n");
    }
}
