/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.gnode.nix;

public class Tag {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Tag(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Tag obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nixJNI.delete_Tag(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Tag() {
    this(nixJNI.new_Tag__SWIG_0(), true);
  }

  public Tag(Tag other) {
    this(nixJNI.new_Tag__SWIG_1(Tag.getCPtr(other), other), true);
  }

  public StringVector units() {
    return new StringVector(nixJNI.Tag_units__SWIG_0(swigCPtr, this), true);
  }

  public void units(StringVector units) {
    nixJNI.Tag_units__SWIG_1(swigCPtr, this, StringVector.getCPtr(units), units);
  }

  public void removeUnits() {
    nixJNI.Tag_removeUnits(swigCPtr, this);
  }

  public DoubleVector position() {
    return new DoubleVector(nixJNI.Tag_position__SWIG_0(swigCPtr, this), true);
  }

  public void position(DoubleVector position) {
    nixJNI.Tag_position__SWIG_1(swigCPtr, this, DoubleVector.getCPtr(position), position);
  }

  public DoubleVector extent() {
    return new DoubleVector(nixJNI.Tag_extent__SWIG_0(swigCPtr, this), true);
  }

  public void extent(DoubleVector extent) {
    nixJNI.Tag_extent__SWIG_1(swigCPtr, this, DoubleVector.getCPtr(extent), extent);
  }

  public void removeExtent() {
    nixJNI.Tag_removeExtent(swigCPtr, this);
  }

  public boolean hasReference(String id) {
    return nixJNI.Tag_hasReference__SWIG_0(swigCPtr, this, id);
  }

  public boolean hasReference(DataArray reference) {
    return nixJNI.Tag_hasReference__SWIG_1(swigCPtr, this, DataArray.getCPtr(reference), reference);
  }

  public long referenceCount() {
    return nixJNI.Tag_referenceCount(swigCPtr, this);
  }

  public DataArray getReference(String id) {
    return new DataArray(nixJNI.Tag_getReference__SWIG_0(swigCPtr, this, id), true);
  }

  public DataArray getReference(long index) {
    return new DataArray(nixJNI.Tag_getReference__SWIG_1(swigCPtr, this, index), true);
  }

  public void addReference(DataArray reference) {
    nixJNI.Tag_addReference__SWIG_0(swigCPtr, this, DataArray.getCPtr(reference), reference);
  }

  public void addReference(String id) {
    nixJNI.Tag_addReference__SWIG_1(swigCPtr, this, id);
  }

  public boolean removeReference(DataArray reference) {
    return nixJNI.Tag_removeReference__SWIG_0(swigCPtr, this, DataArray.getCPtr(reference), reference);
  }

  public boolean removeReference(String id) {
    return nixJNI.Tag_removeReference__SWIG_1(swigCPtr, this, id);
  }

  public DataArrayVector references(SWIGTYPE_p_util__FilterT_nix__DataArray_t__type filter) {
    return new DataArrayVector(nixJNI.Tag_references__SWIG_0(swigCPtr, this, SWIGTYPE_p_util__FilterT_nix__DataArray_t__type.getCPtr(filter)), true);
  }

  public DataArrayVector references() {
    return new DataArrayVector(nixJNI.Tag_references__SWIG_1(swigCPtr, this), true);
  }

  public void references(DataArrayVector references) {
    nixJNI.Tag_references__SWIG_2(swigCPtr, this, DataArrayVector.getCPtr(references), references);
  }

  public boolean hasFeature(String id) {
    return nixJNI.Tag_hasFeature__SWIG_0(swigCPtr, this, id);
  }

  public boolean hasFeature(Feature feature) {
    return nixJNI.Tag_hasFeature__SWIG_1(swigCPtr, this, Feature.getCPtr(feature), feature);
  }

  public long featureCount() {
    return nixJNI.Tag_featureCount(swigCPtr, this);
  }

  public Feature getFeature(String id) {
    return new Feature(nixJNI.Tag_getFeature__SWIG_0(swigCPtr, this, id), true);
  }

  public Feature getFeature(long index) {
    return new Feature(nixJNI.Tag_getFeature__SWIG_1(swigCPtr, this, index), true);
  }

  public SWIGTYPE_p_std__vectorT_nix__Feature_t features(SWIGTYPE_p_util__FilterT_nix__Feature_t__type filter) {
    return new SWIGTYPE_p_std__vectorT_nix__Feature_t(nixJNI.Tag_features__SWIG_0(swigCPtr, this, SWIGTYPE_p_util__FilterT_nix__Feature_t__type.getCPtr(filter)), true);
  }

  public SWIGTYPE_p_std__vectorT_nix__Feature_t features() {
    return new SWIGTYPE_p_std__vectorT_nix__Feature_t(nixJNI.Tag_features__SWIG_1(swigCPtr, this), true);
  }

  public Feature createFeature(DataArray data, LinkType link_type) {
    return new Feature(nixJNI.Tag_createFeature__SWIG_0(swigCPtr, this, DataArray.getCPtr(data), data, link_type.swigValue()), true);
  }

  public Feature createFeature(String data_array_id, LinkType link_type) {
    return new Feature(nixJNI.Tag_createFeature__SWIG_1(swigCPtr, this, data_array_id, link_type.swigValue()), true);
  }

  public boolean deleteFeature(String id) {
    return nixJNI.Tag_deleteFeature__SWIG_0(swigCPtr, this, id);
  }

  public boolean deleteFeature(Feature feature) {
    return nixJNI.Tag_deleteFeature__SWIG_1(swigCPtr, this, Feature.getCPtr(feature), feature);
  }

}