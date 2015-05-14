/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class File {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected File(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(File obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nixJNI.delete_File(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public File() {
    this(nixJNI.new_File__SWIG_0(), true);
  }

  public File(File other) {
    this(nixJNI.new_File__SWIG_1(File.getCPtr(other), other), true);
  }

  public static File open(String name, FileMode mode, Implementation impl) {
    return new File(nixJNI.File_open__SWIG_0(name, mode.swigValue(), impl.swigValue()), true);
  }

  public static File open(String name, FileMode mode) {
    return new File(nixJNI.File_open__SWIG_1(name, mode.swigValue()), true);
  }

  public static File open(String name) {
    return new File(nixJNI.File_open__SWIG_2(name), true);
  }

  public long blockCount() {
    return nixJNI.File_blockCount(swigCPtr, this);
  }

  public boolean hasBlock(String name_or_id) {
    return nixJNI.File_hasBlock__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean hasBlock(Block block) {
    return nixJNI.File_hasBlock__SWIG_1(swigCPtr, this, Block.getCPtr(block), block);
  }

  public Block getBlock(String name_or_id) {
    return new Block(nixJNI.File_getBlock__SWIG_0(swigCPtr, this, name_or_id), true);
  }

  public Block getBlock(long index) {
    return new Block(nixJNI.File_getBlock__SWIG_1(swigCPtr, this, index), true);
  }

  public Block createBlock(String name, String type) {
    return new Block(nixJNI.File_createBlock(swigCPtr, this, name, type), true);
  }

  public boolean deleteBlock(String name_or_id) {
    return nixJNI.File_deleteBlock__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean deleteBlock(Block block) {
    return nixJNI.File_deleteBlock__SWIG_1(swigCPtr, this, Block.getCPtr(block), block);
  }

  public SWIGTYPE_p_std__vectorT_nix__Block_t blocks(SWIGTYPE_p_util__FilterT_nix__Block_t__type filter) {
    return new SWIGTYPE_p_std__vectorT_nix__Block_t(nixJNI.File_blocks__SWIG_0(swigCPtr, this, SWIGTYPE_p_util__FilterT_nix__Block_t__type.getCPtr(filter)), true);
  }

  public SWIGTYPE_p_std__vectorT_nix__Block_t blocks() {
    return new SWIGTYPE_p_std__vectorT_nix__Block_t(nixJNI.File_blocks__SWIG_1(swigCPtr, this), true);
  }

  public boolean hasSection(String name_or_id) {
    return nixJNI.File_hasSection__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean hasSection(Section section) {
    return nixJNI.File_hasSection__SWIG_1(swigCPtr, this, Section.getCPtr(section), section);
  }

  public Section getSection(String name_or_id) {
    return new Section(nixJNI.File_getSection__SWIG_0(swigCPtr, this, name_or_id), true);
  }

  public Section getSection(long index) {
    return new Section(nixJNI.File_getSection__SWIG_1(swigCPtr, this, index), true);
  }

  public long sectionCount() {
    return nixJNI.File_sectionCount(swigCPtr, this);
  }

  public SWIGTYPE_p_std__vectorT_nix__Section_t sections(SWIGTYPE_p_util__FilterT_nix__Section_t__type filter) {
    return new SWIGTYPE_p_std__vectorT_nix__Section_t(nixJNI.File_sections__SWIG_0(swigCPtr, this, SWIGTYPE_p_util__FilterT_nix__Section_t__type.getCPtr(filter)), true);
  }

  public SWIGTYPE_p_std__vectorT_nix__Section_t sections() {
    return new SWIGTYPE_p_std__vectorT_nix__Section_t(nixJNI.File_sections__SWIG_1(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__vectorT_nix__Section_t findSections(SWIGTYPE_p_util__FilterT_nix__Section_t__type filter, long max_depth) {
    return new SWIGTYPE_p_std__vectorT_nix__Section_t(nixJNI.File_findSections__SWIG_0(swigCPtr, this, SWIGTYPE_p_util__FilterT_nix__Section_t__type.getCPtr(filter), max_depth), true);
  }

  public SWIGTYPE_p_std__vectorT_nix__Section_t findSections(SWIGTYPE_p_util__FilterT_nix__Section_t__type filter) {
    return new SWIGTYPE_p_std__vectorT_nix__Section_t(nixJNI.File_findSections__SWIG_1(swigCPtr, this, SWIGTYPE_p_util__FilterT_nix__Section_t__type.getCPtr(filter)), true);
  }

  public SWIGTYPE_p_std__vectorT_nix__Section_t findSections(long max_depth) {
    return new SWIGTYPE_p_std__vectorT_nix__Section_t(nixJNI.File_findSections__SWIG_2(swigCPtr, this, max_depth), true);
  }

  public SWIGTYPE_p_std__vectorT_nix__Section_t findSections() {
    return new SWIGTYPE_p_std__vectorT_nix__Section_t(nixJNI.File_findSections__SWIG_3(swigCPtr, this), true);
  }

  public Section createSection(String name, String type) {
    return new Section(nixJNI.File_createSection(swigCPtr, this, name, type), true);
  }

  public boolean deleteSection(String name_or_id) {
    return nixJNI.File_deleteSection__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean deleteSection(Section section) {
    return nixJNI.File_deleteSection__SWIG_1(swigCPtr, this, Section.getCPtr(section), section);
  }

  public SWIGTYPE_p_std__vectorT_int_t version() {
    return new SWIGTYPE_p_std__vectorT_int_t(nixJNI.File_version(swigCPtr, this), true);
  }

  public String format() {
    return nixJNI.File_format(swigCPtr, this);
  }

  public String location() {
    return nixJNI.File_location(swigCPtr, this);
  }

  public long createdAt() {
    return nixJNI.File_createdAt(swigCPtr, this);
  }

  public long updatedAt() {
    return nixJNI.File_updatedAt(swigCPtr, this);
  }

  public void setUpdatedAt() {
    nixJNI.File_setUpdatedAt(swigCPtr, this);
  }

  public void forceUpdatedAt() {
    nixJNI.File_forceUpdatedAt(swigCPtr, this);
  }

  public void setCreatedAt() {
    nixJNI.File_setCreatedAt(swigCPtr, this);
  }

  public void forceCreatedAt(long t) {
    nixJNI.File_forceCreatedAt(swigCPtr, this, t);
  }

  public void close() {
    nixJNI.File_close(swigCPtr, this);
  }

  public boolean isOpen() {
    return nixJNI.File_isOpen(swigCPtr, this);
  }

  public SWIGTYPE_p_valid__Result validate() {
    return new SWIGTYPE_p_valid__Result(nixJNI.File_validate(swigCPtr, this), true);
  }

}
