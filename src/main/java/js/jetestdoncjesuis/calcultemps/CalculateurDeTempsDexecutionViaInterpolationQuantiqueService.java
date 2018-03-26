package js.jetestdoncjesuis.calcultemps;

public class CalculateurDeTempsDexecutionViaInterpolationQuantiqueService implements ICalculateurDeTempsDexecutionService {

  public void lancerCalculTempsMethode(ICalculDeTemps calculDeTemps) {
    calculDeTemps.setTempsDebutExecution(System.currentTimeMillis());
  }

  public void arreterCalculTempsMethode(ICalculDeTemps calculDeTemps) {
    calculDeTemps.setTempsFinExecution(System.currentTimeMillis());
  }

  public long calculerTempsExecutionMethode(ICalculDeTemps calculDeTemps) {
    long tempsExecution = calculDeTemps.getTempsFinExecution() - calculDeTemps.getTempsDebutExecution();
    System.out.println("Temps d'�xecution de la m�thode : " + tempsExecution + "ms.");
    return tempsExecution;
  }

}