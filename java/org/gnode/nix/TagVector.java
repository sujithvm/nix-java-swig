/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.gnode.nix;

public class TagVector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected TagVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TagVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nixJNI.delete_TagVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TagVector() {
    this(nixJNI.new_TagVector__SWIG_0(), true);
  }

  public TagVector(long n) {
    this(nixJNI.new_TagVector__SWIG_1(n), true);
  }

  public long size() {
    return nixJNI.TagVector_size(swigCPtr, this);
  }

  public long capacity() {
    return nixJNI.TagVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    nixJNI.TagVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return nixJNI.TagVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    nixJNI.TagVector_clear(swigCPtr, this);
  }

  public void add(Tag x) {
    nixJNI.TagVector_add(swigCPtr, this, Tag.getCPtr(x), x);
  }

  public Tag get(int i) {
    return new Tag(nixJNI.TagVector_get(swigCPtr, this, i), false);
  }

  public void set(int i, Tag val) {
    nixJNI.TagVector_set(swigCPtr, this, i, Tag.getCPtr(val), val);
  }

}
