package algorithms;

import algorithms.structures.CortezianCoordinates;
import static java.lang.Math.PI;

/**
 * Created by Anna on 26.11.16.
 */
public class Globals {
  // Up tolerance (classical tolerance for integration)
  public static double tol = 1.e-4;

  // Down tolerance for Error, Feval and cpu_time output tests
  public static double finaltol = 1.e-12;

  // Initial time
  public static double x0 = 0;

  // Machine precision for 64-bit system
  public static double uround = 1.e-30;

  // Absolute value of the MAXIMUM step
  public static double hmax = 0.5;

  // todo: what is the meaning of this variable?
  static int wint = 1;

  // Eccentricity
  static double ecc = 0.6;

  // Number of orbits
  private static int numorbs = 32;

  // Final time
  public static double xn = numorbs * 2 * PI;

  // todo: what is the meaning of this variable?
  public CortezianCoordinates FofYi = new CortezianCoordinates(2);
  public CortezianCoordinates Yimbet = new CortezianCoordinates(2);
}
