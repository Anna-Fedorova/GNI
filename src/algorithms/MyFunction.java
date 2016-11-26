package algorithms;

import static java.lang.Math.pow;

/**
 * Created by Anna on 26.11.16.
 */
public class MyFunction {
  public static double[] function(double[] Y) {
    double r3 = pow((Y[0] * Y[0]) + (Y[1] * Y[1]), (3 / 2));
    double[] F = new double[Y.length];
    for (int i = 0; i < F.length; ++i) {
      F[i] = -Y[i] / r3;
    }
    return F;
  }
}
