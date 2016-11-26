package algorithms.structures;

import java.util.List;

/**
 * Created by Anna on 26.11.16.
 */
public class CortezianCoordinates {
  private double[] coordinates;

  public CortezianCoordinates(int length) {
    this.coordinates = new double[length];
  }

  public void setCoordinates(final double[] coordinates) {
    this.coordinates = coordinates;
  }

  public void setCoordinate(final double coordinate, int position) {
    this.coordinates[position] = coordinate;
  }

  public double[] getCoordinates() {
    return coordinates;
  }

  public double getCoordinate(int position) {
    return coordinates[position];
  }

  public int vectorLength() {
    return coordinates.length;
  }

  public void vectorPlusConst(double constant) {
    for (int i = 0; i < coordinates.length; ++i) {
      coordinates[i] += constant;
    }
  }

  public void vectorProductToConst(double constant) {
    for (int i = 0; i < coordinates.length; ++i) {
      coordinates[i] *= constant;
    }
  }

  public void vectorPlusVector(CortezianCoordinates vector) {
    for (int i = 0; i < vector.vectorLength(); ++i) {
      coordinates[i] += vector.getCoordinate(i);
    }
  }

}
