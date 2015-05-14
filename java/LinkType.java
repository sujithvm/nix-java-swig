/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class LinkType {
  public final static LinkType Tagged = new LinkType("Tagged");
  public final static LinkType Untagged = new LinkType("Untagged");
  public final static LinkType Indexed = new LinkType("Indexed");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static LinkType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + LinkType.class + " with value " + swigValue);
  }

  private LinkType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private LinkType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private LinkType(String swigName, LinkType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static LinkType[] swigValues = { Tagged, Untagged, Indexed };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
