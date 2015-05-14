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

  public SetDimension(SWIGTYPE_p_std__shared_ptrT_nix__base__ISetDimension_t p_impl) {
    this(nixJNI.new_SetDimension__SWIG_1(SWIGTYPE_p_std__shared_ptrT_nix__base__ISetDimension_t.getCPtr(p_impl)), true);
  }

  public SetDimension(SetDimension other) {
    this(nixJNI.new_SetDimension__SWIG_3(SetDimension.getCPtr(other), other), true);
  }

  public long index() {
    return nixJNI.SetDimension_index(swigCPtr, this);
  }

  public SWIGTYPE_p_DimensionType dimensionType() {
    return new SWIGTYPE_p_DimensionType(nixJNI.SetDimension_dimensionType(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__vectorT_std__string_t labels() {
    return new SWIGTYPE_p_std__vectorT_std__string_t(nixJNI.SetDimension_labels__SWIG_0(swigCPtr, this), true);
  }

  public void labels(SWIGTYPE_p_std__vectorT_std__string_t labels) {
    nixJNI.SetDimension_labels__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__vectorT_std__string_t.getCPtr(labels));
  }

  public void labels(SWIGTYPE_p_boost__none_t t) {
    nixJNI.SetDimension_labels__SWIG_2(swigCPtr, this, SWIGTYPE_p_boost__none_t.getCPtr(t));
  }

}