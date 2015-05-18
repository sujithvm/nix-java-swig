/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class SetDimension {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SetDimension(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SetDimension obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nixJNI.delete_SetDimension(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SetDimension() {
    this(nixJNI.new_SetDimension__SWIG_0(), true);
  }

  public SetDimension(SetDimension other) {
    this(nixJNI.new_SetDimension__SWIG_1(SetDimension.getCPtr(other), other), true);
  }

  public long index() {
    return nixJNI.SetDimension_index(swigCPtr, this);
  }

  public DimensionType dimensionType() {
    return DimensionType.swigToEnum(nixJNI.SetDimension_dimensionType(swigCPtr, this));
  }

  public StringVector labels() {
    return new StringVector(nixJNI.SetDimension_labels__SWIG_0(swigCPtr, this), true);
  }

  public void labels(StringVector labels) {
    nixJNI.SetDimension_labels__SWIG_1(swigCPtr, this, StringVector.getCPtr(labels), labels);
  }

  public void removeLabels() {
    nixJNI.SetDimension_removeLabels(swigCPtr, this);
  }

}
