package algorithms.implicit8;

import algorithms.Globals;
import static java.lang.Math.*;

/**
 * Created by Anna on 26.11.16.
 */
public class irk8v {

  public static void algorithm() {
    double[] initialTimes = new double[2];
    initialTimes[0] = Globals.x0;
    initialTimes[1] = Globals.xn;

    int tdirBoolean;
    if (initialTimes.length == 2 && Globals.xn < Globals.x0) {
      tdirBoolean = 1;
    } else {
      tdirBoolean = 0;
    }

    InitializeVariables8 initializeVariables8 = new InitializeVariables8();
    double h = initializeVariables8.h;
    int tdir = 1 - 2 * tdirBoolean;
    // set_constants8
    // myFunction

    while (true) {
      int break1 = 0;
      double absh = abs(h);
    }
  }
}
