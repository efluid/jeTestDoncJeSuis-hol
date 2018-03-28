package js.jetestdoncjesuis.export;

import js.jetestdoncjesuis.calcultemps.ICalculDeTemps;

public interface IServiceDExportTempsExecution {

  /**
   * G�n�re un format de sortie avec les r�sultats de {@link ICalculDeTemps} au path indiqu� s'il existe.
   */
  public void genererFormatDeSortie(ICalculDeTemps calculDeTemps, String path);

}
