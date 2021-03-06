/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.gnode.nix;

public class Source {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Source(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Source obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nixJNI.delete_Source(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Source() {
    this(nixJNI.new_Source__SWIG_0(), true);
  }

  public Source(Source other) {
    this(nixJNI.new_Source__SWIG_1(Source.getCPtr(other), other), true);
  }

  public boolean hasSource(String name_or_id) {
    return nixJNI.Source_hasSource__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean hasSource(Source source) {
    return nixJNI.Source_hasSource__SWIG_1(swigCPtr, this, Source.getCPtr(source), source);
  }

  public Source getSource(String name_or_id) {
    return new Source(nixJNI.Source_getSource__SWIG_0(swigCPtr, this, name_or_id), true);
  }

  public Source getSource(long index) {
    return new Source(nixJNI.Source_getSource__SWIG_1(swigCPtr, this, index), true);
  }

  public long sourceCount() {
    return nixJNI.Source_sourceCount(swigCPtr, this);
  }

  public SourceVector sources(SWIGTYPE_p_util__FilterT_nix__Source_t__type filter) {
    return new SourceVector(nixJNI.Source_sources__SWIG_0(swigCPtr, this, SWIGTYPE_p_util__FilterT_nix__Source_t__type.getCPtr(filter)), true);
  }

  public SourceVector sources() {
    return new SourceVector(nixJNI.Source_sources__SWIG_1(swigCPtr, this), true);
  }

  public SourceVector findSources(SWIGTYPE_p_util__FilterT_nix__Source_t__type filter, long max_depth) {
    return new SourceVector(nixJNI.Source_findSources__SWIG_0(swigCPtr, this, SWIGTYPE_p_util__FilterT_nix__Source_t__type.getCPtr(filter), max_depth), true);
  }

  public SourceVector findSources(SWIGTYPE_p_util__FilterT_nix__Source_t__type filter) {
    return new SourceVector(nixJNI.Source_findSources__SWIG_1(swigCPtr, this, SWIGTYPE_p_util__FilterT_nix__Source_t__type.getCPtr(filter)), true);
  }

  public SourceVector findSources() {
    return new SourceVector(nixJNI.Source_findSources__SWIG_2(swigCPtr, this), true);
  }

  public Source createSource(String name, String type) {
    return new Source(nixJNI.Source_createSource(swigCPtr, this, name, type), true);
  }

  public boolean deleteSource(String name_or_id) {
    return nixJNI.Source_deleteSource__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean deleteSource(Source source) {
    return nixJNI.Source_deleteSource__SWIG_1(swigCPtr, this, Source.getCPtr(source), source);
  }

}
