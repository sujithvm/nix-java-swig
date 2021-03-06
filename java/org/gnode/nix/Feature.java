/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.gnode.nix;

public class Feature {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Feature(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Feature obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nixJNI.delete_Feature(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Feature() {
    this(nixJNI.new_Feature__SWIG_0(), true);
  }

  public Feature(Feature other) {
    this(nixJNI.new_Feature__SWIG_1(Feature.getCPtr(other), other), true);
  }

  public void linkType(LinkType type) {
    nixJNI.Feature_linkType__SWIG_0(swigCPtr, this, type.swigValue());
  }

  public LinkType linkType() {
    return LinkType.swigToEnum(nixJNI.Feature_linkType__SWIG_1(swigCPtr, this));
  }

  public void data(String name_or_id) {
    nixJNI.Feature_data__SWIG_0(swigCPtr, this, name_or_id);
  }

  public void data(DataArray data) {
    nixJNI.Feature_data__SWIG_1(swigCPtr, this, DataArray.getCPtr(data), data);
  }

  public DataArray data() {
    return new DataArray(nixJNI.Feature_data__SWIG_2(swigCPtr, this), true);
  }

}
