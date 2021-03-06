/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.gnode.nix;

public class Section {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Section(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Section obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nixJNI.delete_Section(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Section() {
    this(nixJNI.new_Section__SWIG_0(), true);
  }

  public Section(Section other) {
    this(nixJNI.new_Section__SWIG_1(Section.getCPtr(other), other), true);
  }

  public void repository(String repository) {
    nixJNI.Section_repository__SWIG_0(swigCPtr, this, repository);
  }

  public OptionalString repository() {
    return new OptionalString(nixJNI.Section_repository__SWIG_1(swigCPtr, this), true);
  }

  public void removeRepository() {
    nixJNI.Section_removeRepository(swigCPtr, this);
  }

  public void link(String id) {
    nixJNI.Section_link__SWIG_0(swigCPtr, this, id);
  }

  public void link(Section link) {
    nixJNI.Section_link__SWIG_1(swigCPtr, this, Section.getCPtr(link), link);
  }

  public Section link() {
    return new Section(nixJNI.Section_link__SWIG_2(swigCPtr, this), true);
  }

  public void removeLink() {
    nixJNI.Section_removeLink(swigCPtr, this);
  }

  public void mapping(String mapping) {
    nixJNI.Section_mapping__SWIG_0(swigCPtr, this, mapping);
  }

  public OptionalString mapping() {
    return new OptionalString(nixJNI.Section_mapping__SWIG_1(swigCPtr, this), true);
  }

  public void removeMapping() {
    nixJNI.Section_removeMapping(swigCPtr, this);
  }

  public Section parent() {
    return new Section(nixJNI.Section_parent(swigCPtr, this), true);
  }

  public long sectionCount() {
    return nixJNI.Section_sectionCount(swigCPtr, this);
  }

  public boolean hasSection(String name_or_id) {
    return nixJNI.Section_hasSection__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean hasSection(Section section) {
    return nixJNI.Section_hasSection__SWIG_1(swigCPtr, this, Section.getCPtr(section), section);
  }

  public Section getSection(String name_or_id) {
    return new Section(nixJNI.Section_getSection__SWIG_0(swigCPtr, this, name_or_id), true);
  }

  public Section getSection(long index) {
    return new Section(nixJNI.Section_getSection__SWIG_1(swigCPtr, this, index), true);
  }

  public SectionVector sections(SWIGTYPE_p_util__FilterT_nix__Section_t__type filter) {
    return new SectionVector(nixJNI.Section_sections__SWIG_0(swigCPtr, this, SWIGTYPE_p_util__FilterT_nix__Section_t__type.getCPtr(filter)), true);
  }

  public SectionVector sections() {
    return new SectionVector(nixJNI.Section_sections__SWIG_1(swigCPtr, this), true);
  }

  public SectionVector findSections(SWIGTYPE_p_util__FilterT_nix__Section_t__type filter, long max_depth) {
    return new SectionVector(nixJNI.Section_findSections__SWIG_0(swigCPtr, this, SWIGTYPE_p_util__FilterT_nix__Section_t__type.getCPtr(filter), max_depth), true);
  }

  public SectionVector findSections(SWIGTYPE_p_util__FilterT_nix__Section_t__type filter) {
    return new SectionVector(nixJNI.Section_findSections__SWIG_1(swigCPtr, this, SWIGTYPE_p_util__FilterT_nix__Section_t__type.getCPtr(filter)), true);
  }

  public SectionVector findSections() {
    return new SectionVector(nixJNI.Section_findSections__SWIG_2(swigCPtr, this), true);
  }

  public SectionVector findRelated(SWIGTYPE_p_util__FilterT_nix__Section_t__type filter) {
    return new SectionVector(nixJNI.Section_findRelated__SWIG_0(swigCPtr, this, SWIGTYPE_p_util__FilterT_nix__Section_t__type.getCPtr(filter)), true);
  }

  public SectionVector findRelated() {
    return new SectionVector(nixJNI.Section_findRelated__SWIG_1(swigCPtr, this), true);
  }

  public Section createSection(String name, String type) {
    return new Section(nixJNI.Section_createSection(swigCPtr, this, name, type), true);
  }

  public boolean deleteSection(String name_or_id) {
    return nixJNI.Section_deleteSection__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean deleteSection(Section section) {
    return nixJNI.Section_deleteSection__SWIG_1(swigCPtr, this, Section.getCPtr(section), section);
  }

  public long propertyCount() {
    return nixJNI.Section_propertyCount(swigCPtr, this);
  }

  public boolean hasProperty(String name_or_id) {
    return nixJNI.Section_hasProperty__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean hasProperty(Property property) {
    return nixJNI.Section_hasProperty__SWIG_1(swigCPtr, this, Property.getCPtr(property), property);
  }

  public Property getProperty(String name_or_id) {
    return new Property(nixJNI.Section_getProperty__SWIG_0(swigCPtr, this, name_or_id), true);
  }

  public Property getProperty(long index) {
    return new Property(nixJNI.Section_getProperty__SWIG_1(swigCPtr, this, index), true);
  }

  public PropertyVector properties(SWIGTYPE_p_util__FilterT_nix__Property_t__type filter) {
    return new PropertyVector(nixJNI.Section_properties__SWIG_0(swigCPtr, this, SWIGTYPE_p_util__FilterT_nix__Property_t__type.getCPtr(filter)), true);
  }

  public PropertyVector properties() {
    return new PropertyVector(nixJNI.Section_properties__SWIG_1(swigCPtr, this), true);
  }

  public PropertyVector inheritedProperties() {
    return new PropertyVector(nixJNI.Section_inheritedProperties(swigCPtr, this), true);
  }

  public Property createProperty(String name, DataType dtype) {
    return new Property(nixJNI.Section_createProperty__SWIG_0(swigCPtr, this, name, dtype.swigValue()), true);
  }

  public Property createProperty(String name, Value value) {
    return new Property(nixJNI.Section_createProperty__SWIG_1(swigCPtr, this, name, Value.getCPtr(value), value), true);
  }

  public Property createProperty(String name, ValueVector values) {
    return new Property(nixJNI.Section_createProperty__SWIG_2(swigCPtr, this, name, ValueVector.getCPtr(values), values), true);
  }

  public boolean deleteProperty(String name_or_id) {
    return nixJNI.Section_deleteProperty__SWIG_0(swigCPtr, this, name_or_id);
  }

  public boolean deleteProperty(Property property) {
    return nixJNI.Section_deleteProperty__SWIG_1(swigCPtr, this, Property.getCPtr(property), property);
  }

}
