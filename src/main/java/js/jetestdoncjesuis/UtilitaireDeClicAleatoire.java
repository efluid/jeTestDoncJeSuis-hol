package js.jetestdoncjesuis;

import java.util.Collection;

public class UtilitaireDeClicAleatoire {

  public void clicsAleatoires(Collection<Ecran> ecrans) {
    System.out.println("\n\nD�marrage des clicks al�atoires :");
    for (Ecran ecran : ecrans) {
      ecran.clicAleatoire();
    }
    System.out.println("Fin des clics al�atoires\n\n");
  }
}
