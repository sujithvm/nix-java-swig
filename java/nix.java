/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class nix {
  public static String link_type_to_string(LinkType ltype) {
    return nixJNI.link_type_to_string(ltype.swigValue());
  }

  public static void swap(Value a, Value b) {
    nixJNI.swap(Value.getCPtr(a), a, Value.getCPtr(b), b);
  }

}
