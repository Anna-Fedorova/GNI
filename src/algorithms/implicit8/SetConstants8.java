package algorithms.implicit8;

import algorithms.structures.CortezianCoordinates;
import static java.lang.Math.sqrt;

/**
 * Created by Anna on 26.11.16.
 */
public class SetConstants8 {
  double alp3 = 0.142615758240322548157075497020440;

  double beta = 0.382527661964732346425501486979669;

  private CortezianCoordinates b = new CortezianCoordinates(4);

  private CortezianCoordinates c = new CortezianCoordinates(4);

  private CortezianCoordinates d = new CortezianCoordinates(4);

  private CortezianCoordinates e = new CortezianCoordinates(4);

  private CortezianCoordinates f = new CortezianCoordinates(4);

  private CortezianCoordinates g = new CortezianCoordinates(4);

  private CortezianCoordinates bet = new CortezianCoordinates(3);

  private CortezianCoordinates bit = new CortezianCoordinates(4);

  private CortezianCoordinates pconst = new CortezianCoordinates(14);

  private double alpha = sqrt(5) / 10;

  double halfmalp = .5 - alpha;

  double halfpalp = .5 + alpha;

  public CortezianCoordinates initB() {
    b.setCoordinate(2.123098531813520556436996831151111E-02, 0);
    b.setCoordinate(1.210234801519812776896336502182204E-02, 1);
    b.setCoordinate(3.812146821969728581691370345216924E-03, 2);
    b.setCoordinate(2.952118651136360475164196298811560E-02, 3);

    return b;
  }

  public CortezianCoordinates initC() {
    c.setCoordinate(7.777609731256537802319798237385266E-02, 0);
    c.setCoordinate(8.202169482197781114372122239489150E-03, 1);
    c.setCoordinate(-9.145048172716224921301341787028791E-04, 2);
    c.setCoordinate(0.146167588807248161675354394589336, 3);

    return c;
  }

  public CortezianCoordinates initD() {
    d.setCoordinate(8.202169482197781114372122239489360E-03, 0);
    d.setCoordinate(-1.355450844345280146404624115489727E-03, 1);
    d.setCoordinate(4.774758843275662764547236177283206E-04, 2);
    d.setCoordinate(6.564405994873831473716693030356481E-02, 3);

    return d;
  }

  public CortezianCoordinates initE() {
    e.setCoordinate(9.995025475166449392325869763893850E-02, 0);
    e.setCoordinate(4.452878318700190244056511583645021E-02, 1);
    e.setCoordinate(3.702592422564123647532639665272749E-03, 2);
    e.setCoordinate(0.144495707155760097206389774051854, 3);

    return e;
  }

  public CortezianCoordinates initF() {
    f.setCoordinate(-8.715404517127328554032816622569937E-04, 0);
    f.setCoordinate(5.734382455594718502891094104969435E-04, 1);
    f.setCoordinate(-2.814329890595601625482116752954182E-04, 2);
    f.setCoordinate(3.702592422564123647532639665272104E-03, 3);

    return f;
  }

  public CortezianCoordinates initG() {
    g.setCoordinate(1.895399565422127075325482558367592E-04, 0);
    g.setCoordinate(-1.895399565422127075325482558366994E-04, 1);
    g.setCoordinate(1.035977792058598707919134221274405E-04, 2);
    g.setCoordinate(-1.035977792058598707919134221271883E-04, 3);

    return g;
  }

  public CortezianCoordinates initBet() {
    bet.setCoordinate(3.333333333333333333333333333333333E-02, 0);
    bet.setCoordinate(0.189237478148923490158306404106012, 1);
    bet.setCoordinate(0.277429188517743176508360262560654, 2);

    return bet;
  }

  public CortezianCoordinates initBit() {
    bit.setCoordinate(.117472338035267653574498513019, 0);
    bit.setCoordinate(.357384241759677451842924502980, 1);
    bit.setCoordinate(.642615758240322548157075497020, 2);
    bit.setCoordinate(.882527661964732346425501486981, 3);

    return bit;
  }

  public CortezianCoordinates initPconst() {
    pconst.setCoordinate(-9.001150019285E-04, 0);
    pconst.setCoordinate(6.476186313100E-02, 1);
    pconst.setCoordinate(-0.275171144647, 2);
    pconst.setCoordinate(0.376501967851, 3);
    pconst.setCoordinate(0.105146683165, 4);
    pconst.setCoordinate(1.30815458491, 5);
    pconst.setCoordinate(-1.60698206902, 6);
    pconst.setCoordinate(0.476598836092, 7);
    pconst.setCoordinate(2.870615438782E-02, 8);
    pconst.setCoordinate(2.36666555405, 9);
    pconst.setCoordinate(-2.81635077107, 10);
    pconst.setCoordinate(1.04285172818, 11);
    pconst.setCoordinate(-0.168255756804, 12);
    pconst.setCoordinate(7.508924564484E-02, 13);

    return pconst;
  }
}
