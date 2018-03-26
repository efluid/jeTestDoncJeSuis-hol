package js.jetestdoncjesuis.calcultemps;

/**
 * D�finit les services de calcul de temps d'ex�ction.
 */
public interface ICalculateurDeTempsDexecutionService {

  /**
   * Initie le calcul de temps pour une m�thode de test.
   */
  public void lancerCalculTempsMethode(ICalculDeTemps calculDeTemps);

  /**
   * Stoppe le calcul de temps d'une m�thode.
   */
  public void arreterCalculTempsMethode(ICalculDeTemps calculDeTemps);

  /**
   * Calcule et loggue le temps d'�xecution d'une m�thode.
   */
  public long calculerTempsExecutionMethode(ICalculDeTemps calculDeTemps);

}
