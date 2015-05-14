/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class Block {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Block(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Block obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nixJNI.delete_Block(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Block() {
    this(nixJNI.new_Block__SWIG_0(), true);
  }

  public Block(Block other) {
    this(nixJNI.new_Block__SWIG_1(Block.getCPtr(other), other), true);
  }

  public boolean hasSource(String name_or_id) {
    return nixJNI.Block_hasSource__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean hasSource(Source source) {
    return nixJNI.Block_hasSource__SWIG_1(swigCPtr, this, Source.getCPtr(source), source);
  }

  public Source getSource(String name_or_id) {
    return new Source(nixJNI.Block_getSource__SWIG_0(swigCPtr, this, name_or_id), true);
  }

  public Source getSource(long index) {
    return new Source(nixJNI.Block_getSource__SWIG_1(swigCPtr, this, index), true);
  }

  public long sourceCount() {
    return nixJNI.Block_sourceCount(swigCPtr, this);
  }

  public SourceVector sources(SWIGTYPE_p_util__FilterT_nix__Source_t__type filter) {
    return new SourceVector(nixJNI.Block_sources__SWIG_0(swigCPtr, this, SWIGTYPE_p_util__FilterT_nix__Source_t__type.getCPtr(filter)), true);
  }

  public SourceVector sources() {
    return new SourceVector(nixJNI.Block_sources__SWIG_1(swigCPtr, this), true);
  }

  public SourceVector findSources(SWIGTYPE_p_util__FilterT_nix__Source_t__type filter, long max_depth) {
    return new SourceVector(nixJNI.Block_findSources__SWIG_0(swigCPtr, this, SWIGTYPE_p_util__FilterT_nix__Source_t__type.getCPtr(filter), max_depth), true);
  }

  public SourceVector findSources(SWIGTYPE_p_util__FilterT_nix__Source_t__type filter) {
    return new SourceVector(nixJNI.Block_findSources__SWIG_1(swigCPtr, this, SWIGTYPE_p_util__FilterT_nix__Source_t__type.getCPtr(filter)), true);
  }

  public SourceVector findSources() {
    return new SourceVector(nixJNI.Block_findSources__SWIG_2(swigCPtr, this), true);
  }

  public Source createSource(String name, String type) {
    return new Source(nixJNI.Block_createSource(swigCPtr, this, name, type), true);
  }

  public boolean deleteSource(String name_or_id) {
    return nixJNI.Block_deleteSource__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean deleteSource(Source source) {
    return nixJNI.Block_deleteSource__SWIG_1(swigCPtr, this, Source.getCPtr(source), source);
  }

  public boolean hasDataArray(String name_or_id) {
    return nixJNI.Block_hasDataArray__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean hasDataArray(DataArray data_array) {
    return nixJNI.Block_hasDataArray__SWIG_1(swigCPtr, this, DataArray.getCPtr(data_array), data_array);
  }

  public DataArray getDataArray(String name_or_id) {
    return new DataArray(nixJNI.Block_getDataArray__SWIG_0(swigCPtr, this, name_or_id), true);
  }

  public DataArray getDataArray(long index) {
    return new DataArray(nixJNI.Block_getDataArray__SWIG_1(swigCPtr, this, index), true);
  }

  public DataArrayVector dataArrays(SWIGTYPE_p_util__AcceptAllT_nix__DataArray_t__type filter) {
    return new DataArrayVector(nixJNI.Block_dataArrays__SWIG_0(swigCPtr, this, SWIGTYPE_p_util__AcceptAllT_nix__DataArray_t__type.getCPtr(filter)), true);
  }

  public DataArrayVector dataArrays() {
    return new DataArrayVector(nixJNI.Block_dataArrays__SWIG_1(swigCPtr, this), true);
  }

  public long dataArrayCount() {
    return nixJNI.Block_dataArrayCount(swigCPtr, this);
  }

  public DataArray createDataArray(String name, String type, DataType data_type, SWIGTYPE_p_NDSize shape) {
    return new DataArray(nixJNI.Block_createDataArray(swigCPtr, this, name, type, data_type.swigValue(), SWIGTYPE_p_NDSize.getCPtr(shape)), true);
  }

  public boolean deleteDataArray(String name_or_id) {
    return nixJNI.Block_deleteDataArray__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean deleteDataArray(DataArray data_array) {
    return nixJNI.Block_deleteDataArray__SWIG_1(swigCPtr, this, DataArray.getCPtr(data_array), data_array);
  }

  public boolean hasTag(String name_or_id) {
    return nixJNI.Block_hasTag__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean hasTag(SWIGTYPE_p_Tag tag) {
    return nixJNI.Block_hasTag__SWIG_1(swigCPtr, this, SWIGTYPE_p_Tag.getCPtr(tag));
  }

  public SWIGTYPE_p_Tag getTag(String name_or_id) {
    return new SWIGTYPE_p_Tag(nixJNI.Block_getTag__SWIG_0(swigCPtr, this, name_or_id), true);
  }

  public SWIGTYPE_p_Tag getTag(long index) {
    return new SWIGTYPE_p_Tag(nixJNI.Block_getTag__SWIG_1(swigCPtr, this, index), true);
  }

  public SWIGTYPE_p_std__vectorT_Tag_t tags(SWIGTYPE_p_util__FilterT_Tag_t__type filter) {
    return new SWIGTYPE_p_std__vectorT_Tag_t(nixJNI.Block_tags__SWIG_0(swigCPtr, this, SWIGTYPE_p_util__FilterT_Tag_t__type.getCPtr(filter)), true);
  }

  public SWIGTYPE_p_std__vectorT_Tag_t tags() {
    return new SWIGTYPE_p_std__vectorT_Tag_t(nixJNI.Block_tags__SWIG_1(swigCPtr, this), true);
  }

  public long tagCount() {
    return nixJNI.Block_tagCount(swigCPtr, this);
  }

  public SWIGTYPE_p_Tag createTag(String name, String type, DoubleVector position) {
    return new SWIGTYPE_p_Tag(nixJNI.Block_createTag(swigCPtr, this, name, type, DoubleVector.getCPtr(position), position), true);
  }

  public boolean deleteTag(String name_or_id) {
    return nixJNI.Block_deleteTag__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean deleteTag(SWIGTYPE_p_Tag tag) {
    return nixJNI.Block_deleteTag__SWIG_1(swigCPtr, this, SWIGTYPE_p_Tag.getCPtr(tag));
  }

  public boolean hasMultiTag(String name_or_id) {
    return nixJNI.Block_hasMultiTag__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean hasMultiTag(SWIGTYPE_p_MultiTag multi_tag) {
    return nixJNI.Block_hasMultiTag__SWIG_1(swigCPtr, this, SWIGTYPE_p_MultiTag.getCPtr(multi_tag));
  }

  public SWIGTYPE_p_MultiTag getMultiTag(String name_or_id) {
    return new SWIGTYPE_p_MultiTag(nixJNI.Block_getMultiTag__SWIG_0(swigCPtr, this, name_or_id), true);
  }

  public SWIGTYPE_p_MultiTag getMultiTag(long index) {
    return new SWIGTYPE_p_MultiTag(nixJNI.Block_getMultiTag__SWIG_1(swigCPtr, this, index), true);
  }

  public SWIGTYPE_p_std__vectorT_MultiTag_t multiTags(SWIGTYPE_p_util__AcceptAllT_MultiTag_t__type filter) {
    return new SWIGTYPE_p_std__vectorT_MultiTag_t(nixJNI.Block_multiTags__SWIG_0(swigCPtr, this, SWIGTYPE_p_util__AcceptAllT_MultiTag_t__type.getCPtr(filter)), true);
  }

  public SWIGTYPE_p_std__vectorT_MultiTag_t multiTags() {
    return new SWIGTYPE_p_std__vectorT_MultiTag_t(nixJNI.Block_multiTags__SWIG_1(swigCPtr, this), true);
  }

  public long multiTagCount() {
    return nixJNI.Block_multiTagCount(swigCPtr, this);
  }

  public SWIGTYPE_p_MultiTag createMultiTag(String name, String type, DataArray positions) {
    return new SWIGTYPE_p_MultiTag(nixJNI.Block_createMultiTag(swigCPtr, this, name, type, DataArray.getCPtr(positions), positions), true);
  }

  public boolean deleteMultiTag(String name_or_id) {
    return nixJNI.Block_deleteMultiTag__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean deleteMultiTag(SWIGTYPE_p_MultiTag multi_tag) {
    return nixJNI.Block_deleteMultiTag__SWIG_1(swigCPtr, this, SWIGTYPE_p_MultiTag.getCPtr(multi_tag));
  }

}
