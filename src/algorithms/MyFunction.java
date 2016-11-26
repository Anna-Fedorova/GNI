package algorithms;

import algorithms.structures.CortezianCoordinates;
import static java.lang.Math.pow;

/**
 * Created by Anna on 26.11.16.
 */
public class MyFunction {
  public static CortezianCoordinates function(CortezianCoordinates Y) {
    double r3 = pow((Y.getCoordinate(0) * Y.getCoordinate(0)) + (Y.getCoordinate(1) * Y
        .getCoordinate(1)), (3 / 2));
    CortezianCoordinates F = new CortezianCoordinates(Y.vectorLength());
    for (int i = 0; i < F.vectorLength(); ++i) {
      F.setCoordinate((-Y.getCoordinate(i) / r3), i);
    }
    return F;
  }
}
