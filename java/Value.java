/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class Value {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Value(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Value obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nixJNI.delete_Value(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUncertainty(double value) {
    nixJNI.Value_uncertainty_set(swigCPtr, this, value);
  }

  public double getUncertainty() {
    return nixJNI.Value_uncertainty_get(swigCPtr, this);
  }

  public void setReference(String value) {
    nixJNI.Value_reference_set(swigCPtr, this, value);
  }

  public String getReference() {
    return nixJNI.Value_reference_get(swigCPtr, this);
  }

  public void setFilename(String value) {
    nixJNI.Value_filename_set(swigCPtr, this, value);
  }

  public String getFilename() {
    return nixJNI.Value_filename_get(swigCPtr, this);
  }

  public void setEncoder(String value) {
    nixJNI.Value_encoder_set(swigCPtr, this, value);
  }

  public String getEncoder() {
    return nixJNI.Value_encoder_get(swigCPtr, this);
  }

  public void setChecksum(String value) {
    nixJNI.Value_checksum_set(swigCPtr, this, value);
  }

  public String getChecksum() {
    return nixJNI.Value_checksum_get(swigCPtr, this);
  }

  public Value() {
    this(nixJNI.new_Value__SWIG_0(), true);
  }

  public Value(String value) {
    this(nixJNI.new_Value__SWIG_1(value), true);
  }

  public Value(Value other) {
    this(nixJNI.new_Value__SWIG_4(Value.getCPtr(other), other), true);
  }

  public void set() {
    nixJNI.Value_set__SWIG_0(swigCPtr, this);
  }

  public void set(boolean value) {
    nixJNI.Value_set__SWIG_1(swigCPtr, this, value);
  }

  public void set(int value) {
    nixJNI.Value_set__SWIG_2(swigCPtr, this, value);
  }

  public void set(long value) {
    nixJNI.Value_set__SWIG_3(swigCPtr, this, value);
  }

  public void set(java.math.BigInteger value) {
    nixJNI.Value_set__SWIG_5(swigCPtr, this, value);
  }

  public void set(double value) {
    nixJNI.Value_set__SWIG_6(swigCPtr, this, value);
  }

  public void set(String value) {
    nixJNI.Value_set__SWIG_7(swigCPtr, this, value);
  }

  public void get(SWIGTYPE_p_boost__none_t tag) {
    nixJNI.Value_get__SWIG_1(swigCPtr, this, SWIGTYPE_p_boost__none_t.getCPtr(tag));
  }

  public void get(boolean[] out) {
    nixJNI.Value_get__SWIG_2(swigCPtr, this, out);
  }

  public void get(int[] value) {
    nixJNI.Value_get__SWIG_3(swigCPtr, this, value);
  }

  public void get(long[] value) {
    nixJNI.Value_get__SWIG_4(swigCPtr, this, value);
  }

  public void get(java.math.BigInteger[] value) {
    nixJNI.Value_get__SWIG_6(swigCPtr, this, value);
  }

  public void get(double[] value) {
    nixJNI.Value_get__SWIG_7(swigCPtr, this, value);
  }

  public void get(SWIGTYPE_p_std__string value) {
    nixJNI.Value_get__SWIG_8(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public DataType type() {
    return DataType.swigToEnum(nixJNI.Value_type(swigCPtr, this));
  }

  public void swap(Value other) {
    nixJNI.Value_swap(swigCPtr, this, Value.getCPtr(other), other);
  }

  public static boolean supports_type(DataType dtype) {
    return nixJNI.Value_supports_type(dtype.swigValue());
  }

}
