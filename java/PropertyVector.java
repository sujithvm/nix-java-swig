/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class PropertyVector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PropertyVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PropertyVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nixJNI.delete_PropertyVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PropertyVector() {
    this(nixJNI.new_PropertyVector__SWIG_0(), true);
  }

  public PropertyVector(long n) {
    this(nixJNI.new_PropertyVector__SWIG_1(n), true);
  }

  public long size() {
    return nixJNI.PropertyVector_size(swigCPtr, this);
  }

  public long capacity() {
    return nixJNI.PropertyVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    nixJNI.PropertyVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return nixJNI.PropertyVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    nixJNI.PropertyVector_clear(swigCPtr, this);
  }

  public void add(Property x) {
    nixJNI.PropertyVector_add(swigCPtr, this, Property.getCPtr(x), x);
  }

  public Property get(int i) {
    return new Property(nixJNI.PropertyVector_get(swigCPtr, this, i), false);
  }

  public void set(int i, Property val) {
    nixJNI.PropertyVector_set(swigCPtr, this, i, Property.getCPtr(val), val);
  }

}
