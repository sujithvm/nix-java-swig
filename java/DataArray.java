/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class DataArray {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected DataArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DataArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nixJNI.delete_DataArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DataArray() {
    this(nixJNI.new_DataArray__SWIG_0(), true);
  }

  public DataArray(DataArray other) {
    this(nixJNI.new_DataArray__SWIG_1(DataArray.getCPtr(other), other), true);
  }

  public DataArray(SWIGTYPE_p_std__shared_ptrT_nix__base__IDataArray_t p_impl) {
    this(nixJNI.new_DataArray__SWIG_2(SWIGTYPE_p_std__shared_ptrT_nix__base__IDataArray_t.getCPtr(p_impl)), true);
  }

  public SWIGTYPE_p_boost__optionalT_std__string_t label() {
    return new SWIGTYPE_p_boost__optionalT_std__string_t(nixJNI.DataArray_label__SWIG_0(swigCPtr, this), true);
  }

  public void label(String label) {
    nixJNI.DataArray_label__SWIG_1(swigCPtr, this, label);
  }

  public void label(SWIGTYPE_p_none_t t) {
    nixJNI.DataArray_label__SWIG_2(swigCPtr, this, SWIGTYPE_p_none_t.getCPtr(t));
  }

  public SWIGTYPE_p_boost__optionalT_std__string_t unit() {
    return new SWIGTYPE_p_boost__optionalT_std__string_t(nixJNI.DataArray_unit__SWIG_0(swigCPtr, this), true);
  }

  public void unit(SWIGTYPE_p_none_t t) {
    nixJNI.DataArray_unit__SWIG_1(swigCPtr, this, SWIGTYPE_p_none_t.getCPtr(t));
  }

  public void unit(String unit) {
    nixJNI.DataArray_unit__SWIG_2(swigCPtr, this, unit);
  }

  public SWIGTYPE_p_boost__optionalT_double_t expansionOrigin() {
    return new SWIGTYPE_p_boost__optionalT_double_t(nixJNI.DataArray_expansionOrigin__SWIG_0(swigCPtr, this), true);
  }

  public void expansionOrigin(double expansion_origin) {
    nixJNI.DataArray_expansionOrigin__SWIG_1(swigCPtr, this, expansion_origin);
  }

  public void expansionOrigin(SWIGTYPE_p_none_t t) {
    nixJNI.DataArray_expansionOrigin__SWIG_2(swigCPtr, this, SWIGTYPE_p_none_t.getCPtr(t));
  }

  public void polynomCoefficients(SWIGTYPE_p_std__vectorT_double_t polynom_coefficients) {
    nixJNI.DataArray_polynomCoefficients__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__vectorT_double_t.getCPtr(polynom_coefficients));
  }

  public SWIGTYPE_p_std__vectorT_double_t polynomCoefficients() {
    return new SWIGTYPE_p_std__vectorT_double_t(nixJNI.DataArray_polynomCoefficients__SWIG_1(swigCPtr, this), true);
  }

  public void polynomCoefficients(SWIGTYPE_p_none_t t) {
    nixJNI.DataArray_polynomCoefficients__SWIG_2(swigCPtr, this, SWIGTYPE_p_none_t.getCPtr(t));
  }

  public SWIGTYPE_p_std__vectorT_Dimension_t dimensions(SWIGTYPE_p_util__FilterT_Dimension_t__type filter) {
    return new SWIGTYPE_p_std__vectorT_Dimension_t(nixJNI.DataArray_dimensions__SWIG_0(swigCPtr, this, SWIGTYPE_p_util__FilterT_Dimension_t__type.getCPtr(filter)), true);
  }

  public SWIGTYPE_p_std__vectorT_Dimension_t dimensions() {
    return new SWIGTYPE_p_std__vectorT_Dimension_t(nixJNI.DataArray_dimensions__SWIG_1(swigCPtr, this), true);
  }

  public long dimensionCount() {
    return nixJNI.DataArray_dimensionCount(swigCPtr, this);
  }

  public SWIGTYPE_p_Dimension getDimension(long id) {
    return new SWIGTYPE_p_Dimension(nixJNI.DataArray_getDimension(swigCPtr, this, id), true);
  }

  public SWIGTYPE_p_SetDimension appendSetDimension() {
    return new SWIGTYPE_p_SetDimension(nixJNI.DataArray_appendSetDimension(swigCPtr, this), true);
  }

  public SWIGTYPE_p_RangeDimension appendRangeDimension(SWIGTYPE_p_std__vectorT_double_t ticks) {
    return new SWIGTYPE_p_RangeDimension(nixJNI.DataArray_appendRangeDimension(swigCPtr, this, SWIGTYPE_p_std__vectorT_double_t.getCPtr(ticks)), true);
  }

  public SWIGTYPE_p_SampledDimension appendSampledDimension(double sampling_interval) {
    return new SWIGTYPE_p_SampledDimension(nixJNI.DataArray_appendSampledDimension(swigCPtr, this, sampling_interval), true);
  }

  public SWIGTYPE_p_SetDimension createSetDimension(long id) {
    return new SWIGTYPE_p_SetDimension(nixJNI.DataArray_createSetDimension(swigCPtr, this, id), true);
  }

  public SWIGTYPE_p_RangeDimension createRangeDimension(long id, SWIGTYPE_p_std__vectorT_double_t ticks) {
    return new SWIGTYPE_p_RangeDimension(nixJNI.DataArray_createRangeDimension(swigCPtr, this, id, SWIGTYPE_p_std__vectorT_double_t.getCPtr(ticks)), true);
  }

  public SWIGTYPE_p_SampledDimension createSampledDimension(long id, double sampling_interval) {
    return new SWIGTYPE_p_SampledDimension(nixJNI.DataArray_createSampledDimension(swigCPtr, this, id, sampling_interval), true);
  }

  public boolean deleteDimension(long id) {
    return nixJNI.DataArray_deleteDimension(swigCPtr, this, id);
  }

  public void getDataDirect(SWIGTYPE_p_DataType dtype, SWIGTYPE_p_void data, SWIGTYPE_p_NDSize count, SWIGTYPE_p_NDSize offset) {
    nixJNI.DataArray_getDataDirect(swigCPtr, this, SWIGTYPE_p_DataType.getCPtr(dtype), SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_NDSize.getCPtr(count), SWIGTYPE_p_NDSize.getCPtr(offset));
  }

  public void setDataDirect(SWIGTYPE_p_DataType dtype, SWIGTYPE_p_void data, SWIGTYPE_p_NDSize count, SWIGTYPE_p_NDSize offset) {
    nixJNI.DataArray_setDataDirect(swigCPtr, this, SWIGTYPE_p_DataType.getCPtr(dtype), SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_NDSize.getCPtr(count), SWIGTYPE_p_NDSize.getCPtr(offset));
  }

  public SWIGTYPE_p_NDSize dataExtent() {
    return new SWIGTYPE_p_NDSize(nixJNI.DataArray_dataExtent__SWIG_0(swigCPtr, this), true);
  }

  public void dataExtent(SWIGTYPE_p_NDSize extent) {
    nixJNI.DataArray_dataExtent__SWIG_1(swigCPtr, this, SWIGTYPE_p_NDSize.getCPtr(extent));
  }

  public SWIGTYPE_p_DataType dataType() {
    return new SWIGTYPE_p_DataType(nixJNI.DataArray_dataType(swigCPtr, this), true);
  }

  public void appendData(SWIGTYPE_p_DataType dtype, SWIGTYPE_p_void data, SWIGTYPE_p_NDSize count, long axis) {
    nixJNI.DataArray_appendData(swigCPtr, this, SWIGTYPE_p_DataType.getCPtr(dtype), SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_NDSize.getCPtr(count), axis);
  }

}