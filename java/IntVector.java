/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class IntVector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IntVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nixJNI.delete_IntVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntVector() {
    this(nixJNI.new_IntVector__SWIG_0(), true);
  }

  public IntVector(long n) {
    this(nixJNI.new_IntVector__SWIG_1(n), true);
  }

  public long size() {
    return nixJNI.IntVector_size(swigCPtr, this);
  }

  public long capacity() {
    return nixJNI.IntVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    nixJNI.IntVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return nixJNI.IntVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    nixJNI.IntVector_clear(swigCPtr, this);
  }

  public void add(int x) {
    nixJNI.IntVector_add(swigCPtr, this, x);
  }

  public int get(int i) {
    return nixJNI.IntVector_get(swigCPtr, this, i);
  }

  public void set(int i, int val) {
    nixJNI.IntVector_set(swigCPtr, this, i, val);
  }

}
