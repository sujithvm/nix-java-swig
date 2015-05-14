/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class Property {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Property(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Property obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nixJNI.delete_Property(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Property() {
    this(nixJNI.new_Property__SWIG_0(), true);
  }

  public Property(Property other) {
    this(nixJNI.new_Property__SWIG_1(Property.getCPtr(other), other), true);
  }

  public String name() {
    return nixJNI.Property_name(swigCPtr, this);
  }

  public void definition(String definition) {
    nixJNI.Property_definition__SWIG_0(swigCPtr, this, definition);
  }

  public SWIGTYPE_p_boost__optionalT_std__string_t definition() {
    return new SWIGTYPE_p_boost__optionalT_std__string_t(nixJNI.Property_definition__SWIG_1(swigCPtr, this), true);
  }

  public void definition(SWIGTYPE_p_none_t t) {
    nixJNI.Property_definition__SWIG_2(swigCPtr, this, SWIGTYPE_p_none_t.getCPtr(t));
  }

  public void mapping(String mapping) {
    nixJNI.Property_mapping__SWIG_0(swigCPtr, this, mapping);
  }

  public SWIGTYPE_p_boost__optionalT_std__string_t mapping() {
    return new SWIGTYPE_p_boost__optionalT_std__string_t(nixJNI.Property_mapping__SWIG_1(swigCPtr, this), true);
  }

  public void mapping(SWIGTYPE_p_boost__none_t t) {
    nixJNI.Property_mapping__SWIG_2(swigCPtr, this, SWIGTYPE_p_boost__none_t.getCPtr(t));
  }

  public DataType dataType() {
    return DataType.swigToEnum(nixJNI.Property_dataType(swigCPtr, this));
  }

  public void unit(String unit) {
    nixJNI.Property_unit__SWIG_0(swigCPtr, this, unit);
  }

  public SWIGTYPE_p_boost__optionalT_std__string_t unit() {
    return new SWIGTYPE_p_boost__optionalT_std__string_t(nixJNI.Property_unit__SWIG_1(swigCPtr, this), true);
  }

  public void unit(SWIGTYPE_p_boost__none_t t) {
    nixJNI.Property_unit__SWIG_2(swigCPtr, this, SWIGTYPE_p_boost__none_t.getCPtr(t));
  }

  public void deleteValues() {
    nixJNI.Property_deleteValues(swigCPtr, this);
  }

  public long valueCount() {
    return nixJNI.Property_valueCount(swigCPtr, this);
  }

  public void values(SWIGTYPE_p_std__vectorT_Value_t values) {
    nixJNI.Property_values__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__vectorT_Value_t.getCPtr(values));
  }

  public SWIGTYPE_p_std__vectorT_Value_t values() {
    return new SWIGTYPE_p_std__vectorT_Value_t(nixJNI.Property_values__SWIG_1(swigCPtr, this), true);
  }

  public void values(SWIGTYPE_p_boost__none_t t) {
    nixJNI.Property_values__SWIG_2(swigCPtr, this, SWIGTYPE_p_boost__none_t.getCPtr(t));
  }

  public int compare(Property other) {
    return nixJNI.Property_compare(swigCPtr, this, Property.getCPtr(other), other);
  }

}
