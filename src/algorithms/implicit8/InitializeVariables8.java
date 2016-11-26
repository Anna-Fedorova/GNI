package algorithms.implicit8;

import algorithms.Globals;
import static java.lang.Math.abs;
import static java.lang.Math.log10;

/**
 * Created by Anna on 26.11.16.
 */
class InitializeVariables8 {
  private double strict = 12.1 + log10(Globals.tol); // todo: add 'if'
  double h = 6.2831853071795864770 / 1.e8;
  double h0 = abs(h);
  double err0 = 1;
  double[][] csy = new double[2][2];
  double[][] csz = new double[2][2];
  double[][] csyh = new double[2][2];
  int nsteps = 0;
  int fevals = 1;
  boolean changestep = true;
  int nchanges = 0;
  int direction = 0;
  int ttc = 0;
  boolean hmaxed = false;
}

//if (strict > 3) {
//    strict = 3;
//    } else if (strict < 1.1) {
//    strict = 1.1;
//    }
