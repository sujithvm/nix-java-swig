/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class SampledDimension {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SampledDimension(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SampledDimension obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nixJNI.delete_SampledDimension(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SampledDimension() {
    this(nixJNI.new_SampledDimension__SWIG_0(), true);
  }

  public SampledDimension(SampledDimension other) {
    this(nixJNI.new_SampledDimension__SWIG_1(SampledDimension.getCPtr(other), other), true);
  }

  public long index() {
    return nixJNI.SampledDimension_index(swigCPtr, this);
  }

  public SWIGTYPE_p_DimensionType dimensionType() {
    return new SWIGTYPE_p_DimensionType(nixJNI.SampledDimension_dimensionType(swigCPtr, this), true);
  }

  public SWIGTYPE_p_boost__optionalT_std__string_t label() {
    return new SWIGTYPE_p_boost__optionalT_std__string_t(nixJNI.SampledDimension_label__SWIG_0(swigCPtr, this), true);
  }

  public void label(String label) {
    nixJNI.SampledDimension_label__SWIG_1(swigCPtr, this, label);
  }

  public void label(SWIGTYPE_p_none_t t) {
    nixJNI.SampledDimension_label__SWIG_2(swigCPtr, this, SWIGTYPE_p_none_t.getCPtr(t));
  }

  public SWIGTYPE_p_boost__optionalT_std__string_t unit() {
    return new SWIGTYPE_p_boost__optionalT_std__string_t(nixJNI.SampledDimension_unit__SWIG_0(swigCPtr, this), true);
  }

  public void unit(String unit) {
    nixJNI.SampledDimension_unit__SWIG_1(swigCPtr, this, unit);
  }

  public void unit(SWIGTYPE_p_none_t t) {
    nixJNI.SampledDimension_unit__SWIG_2(swigCPtr, this, SWIGTYPE_p_none_t.getCPtr(t));
  }

  public double samplingInterval() {
    return nixJNI.SampledDimension_samplingInterval__SWIG_0(swigCPtr, this);
  }

  public void samplingInterval(double interval) {
    nixJNI.SampledDimension_samplingInterval__SWIG_1(swigCPtr, this, interval);
  }

  public SWIGTYPE_p_boost__optionalT_double_t offset() {
    return new SWIGTYPE_p_boost__optionalT_double_t(nixJNI.SampledDimension_offset__SWIG_0(swigCPtr, this), true);
  }

  public void offset(double offset) {
    nixJNI.SampledDimension_offset__SWIG_1(swigCPtr, this, offset);
  }

  public void offset(SWIGTYPE_p_boost__none_t t) {
    nixJNI.SampledDimension_offset__SWIG_2(swigCPtr, this, SWIGTYPE_p_boost__none_t.getCPtr(t));
  }

  public long indexOf(double position) {
    return nixJNI.SampledDimension_indexOf(swigCPtr, this, position);
  }

  public double positionAt(long index) {
    return nixJNI.SampledDimension_positionAt(swigCPtr, this, index);
  }

  public SWIGTYPE_p_std__vectorT_double_t axis(long count, long startIndex) {
    return new SWIGTYPE_p_std__vectorT_double_t(nixJNI.SampledDimension_axis__SWIG_0(swigCPtr, this, count, startIndex), true);
  }

  public SWIGTYPE_p_std__vectorT_double_t axis(long count) {
    return new SWIGTYPE_p_std__vectorT_double_t(nixJNI.SampledDimension_axis__SWIG_1(swigCPtr, this, count), true);
  }

}
