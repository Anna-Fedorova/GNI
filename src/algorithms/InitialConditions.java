package algorithms;

import static java.lang.Math.sqrt;

/**
 * Created by Anna on 26.11.16.
 */
public class InitialConditions {

  // Initial position
  public static double Y1 = 1 - Globals.ecc;

  public static double Y2 = 0;

  // Initial velocity
  public static double Z1 = 0;

  public static double Z2 = sqrt((1 + Globals.ecc) / (1 - Globals.ecc));
}
