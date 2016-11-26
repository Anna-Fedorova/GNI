package algorithms.implicit8;

import algorithms.Globals;
import algorithms.structures.CortezianCoordinates;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

/**
 * Created by Anna on 26.11.16.
 */
public class irk8v {

  public static void algorithm() {
    CortezianCoordinates initialTimes = new CortezianCoordinates(2);
    initialTimes.setCoordinate(Globals.x0, 0);
    initialTimes.setCoordinate(Globals.xn, 1);

    int tdirBoolean;
    if (initialTimes.vectorLength() == 2 && Globals.xn < Globals.x0) {
      tdirBoolean = 1;
    } else {
      tdirBoolean = 0;
    }

    InitializeVariables8 initializeVariables8 = new InitializeVariables8();
    double h = initializeVariables8.h;
    int tdir = 1 - 2 * tdirBoolean;
    // set_constants8
    // myFunction

    boolean changeStep = true;
    boolean fevals = true;

    while (true) {
      int break1 = 0;
      double absh = abs(h);
      if (absh >= abs(Globals.xn - Globals.x0)) {
        absh = abs(Globals.xn - Globals.x0);
        break1 = 3;
      }
      int i = 0;
      while (true) {
        if (break1 == 2) {
          break1 = 1;
        }
        h = absh * tdir;
        if ((!changeStep) || (fevals == true)) {

        }
      }
    }
  }

  public static void predStep8(CortezianCoordinates Yi, CortezianCoordinates Zi, double h) {
    SetConstants8 setConstants8 = new SetConstants8();
    Globals globals = new Globals();
    CortezianCoordinates currentFofYi = globals.FofYi;
    CortezianCoordinates currentYimbet = globals.Yimbet;
    Zi.vectorProductToConst(setConstants8.initBit().getCoordinate(0));
    Zi.vectorProductToConst(h);
    currentFofYi.vectorProductToConst(pow(h,2)*pow(setConstants8.initBit().getCoordinate(0),2));
    currentFofYi.vectorProductToConst(1/2);
    Zi.vectorPlusVector(currentFofYi);
    Yi.vectorPlusVector(Zi);
    currentYimbet.vectorPlusVector(Yi);
  }
}
