/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class nix {
  public static long data_type_to_size(DataType dtype) {
    return nixJNI.data_type_to_size(dtype.swigValue());
  }

  public static String data_type_to_string(DataType dtype) {
    return nixJNI.data_type_to_string(dtype.swigValue());
  }

  public static DataType string_to_data_type(String dtype) {
    return DataType.swigToEnum(nixJNI.string_to_data_type(dtype));
  }

  public static String link_type_to_string(LinkType ltype) {
    return nixJNI.link_type_to_string(ltype.swigValue());
  }

  public static void swap(Value a, Value b) {
    nixJNI.swap(Value.getCPtr(a), a, Value.getCPtr(b), b);
  }

}
