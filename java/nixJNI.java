/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class nixJNI {

    static {
        System.loadLibrary("nix_jni");
    }

  public final static native int FileMode_ReadOnly_get();
  public final static native int Implementation_Hdf5_get();
  public final static native long new_Block__SWIG_0();
  public final static native long new_Block__SWIG_1(long jarg1, Block jarg1_);
  public final static native long new_Block__SWIG_2(long jarg1);
  public final static native boolean Block_hasSource__SWIG_0(long jarg1, Block jarg1_, String jarg2);
  public final static native boolean Block_hasSource__SWIG_1(long jarg1, Block jarg1_, long jarg2);
  public final static native long Block_getSource__SWIG_0(long jarg1, Block jarg1_, String jarg2);
  public final static native long Block_getSource__SWIG_1(long jarg1, Block jarg1_, long jarg2);
  public final static native long Block_sourceCount(long jarg1, Block jarg1_);
  public final static native long Block_sources__SWIG_0(long jarg1, Block jarg1_, long jarg2);
  public final static native long Block_sources__SWIG_1(long jarg1, Block jarg1_);
  public final static native long Block_findSources__SWIG_0(long jarg1, Block jarg1_, long jarg2, long jarg3);
  public final static native long Block_findSources__SWIG_1(long jarg1, Block jarg1_, long jarg2);
  public final static native long Block_findSources__SWIG_2(long jarg1, Block jarg1_);
  public final static native long Block_createSource(long jarg1, Block jarg1_, String jarg2, String jarg3);
  public final static native boolean Block_deleteSource__SWIG_0(long jarg1, Block jarg1_, String jarg2);
  public final static native boolean Block_deleteSource__SWIG_1(long jarg1, Block jarg1_, long jarg2);
  public final static native boolean Block_hasDataArray__SWIG_0(long jarg1, Block jarg1_, String jarg2);
  public final static native boolean Block_hasDataArray__SWIG_1(long jarg1, Block jarg1_, long jarg2);
  public final static native long Block_getDataArray__SWIG_0(long jarg1, Block jarg1_, String jarg2);
  public final static native long Block_getDataArray__SWIG_1(long jarg1, Block jarg1_, long jarg2);
  public final static native long Block_dataArrays__SWIG_0(long jarg1, Block jarg1_, long jarg2);
  public final static native long Block_dataArrays__SWIG_1(long jarg1, Block jarg1_);
  public final static native long Block_dataArrayCount(long jarg1, Block jarg1_);
  public final static native long Block_createDataArray(long jarg1, Block jarg1_, String jarg2, String jarg3, long jarg4, long jarg5);
  public final static native boolean Block_deleteDataArray__SWIG_0(long jarg1, Block jarg1_, String jarg2);
  public final static native boolean Block_deleteDataArray__SWIG_1(long jarg1, Block jarg1_, long jarg2);
  public final static native boolean Block_hasTag__SWIG_0(long jarg1, Block jarg1_, String jarg2);
  public final static native boolean Block_hasTag__SWIG_1(long jarg1, Block jarg1_, long jarg2);
  public final static native long Block_getTag__SWIG_0(long jarg1, Block jarg1_, String jarg2);
  public final static native long Block_getTag__SWIG_1(long jarg1, Block jarg1_, long jarg2);
  public final static native long Block_tags__SWIG_0(long jarg1, Block jarg1_, long jarg2);
  public final static native long Block_tags__SWIG_1(long jarg1, Block jarg1_);
  public final static native long Block_tagCount(long jarg1, Block jarg1_);
  public final static native long Block_createTag(long jarg1, Block jarg1_, String jarg2, String jarg3, long jarg4);
  public final static native boolean Block_deleteTag__SWIG_0(long jarg1, Block jarg1_, String jarg2);
  public final static native boolean Block_deleteTag__SWIG_1(long jarg1, Block jarg1_, long jarg2);
  public final static native boolean Block_hasMultiTag__SWIG_0(long jarg1, Block jarg1_, String jarg2);
  public final static native boolean Block_hasMultiTag__SWIG_1(long jarg1, Block jarg1_, long jarg2);
  public final static native long Block_getMultiTag__SWIG_0(long jarg1, Block jarg1_, String jarg2);
  public final static native long Block_getMultiTag__SWIG_1(long jarg1, Block jarg1_, long jarg2);
  public final static native long Block_multiTags__SWIG_0(long jarg1, Block jarg1_, long jarg2);
  public final static native long Block_multiTags__SWIG_1(long jarg1, Block jarg1_);
  public final static native long Block_multiTagCount(long jarg1, Block jarg1_);
  public final static native long Block_createMultiTag(long jarg1, Block jarg1_, String jarg2, String jarg3, long jarg4);
  public final static native boolean Block_deleteMultiTag__SWIG_0(long jarg1, Block jarg1_, String jarg2);
  public final static native boolean Block_deleteMultiTag__SWIG_1(long jarg1, Block jarg1_, long jarg2);
  public final static native void delete_Block(long jarg1);
  public final static native long new_DataArray__SWIG_0();
  public final static native long new_DataArray__SWIG_1(long jarg1, DataArray jarg1_);
  public final static native long new_DataArray__SWIG_2(long jarg1);
  public final static native long DataArray_label__SWIG_0(long jarg1, DataArray jarg1_);
  public final static native void DataArray_label__SWIG_1(long jarg1, DataArray jarg1_, String jarg2);
  public final static native void DataArray_label__SWIG_2(long jarg1, DataArray jarg1_, long jarg2);
  public final static native long DataArray_unit__SWIG_0(long jarg1, DataArray jarg1_);
  public final static native void DataArray_unit__SWIG_1(long jarg1, DataArray jarg1_, long jarg2);
  public final static native void DataArray_unit__SWIG_2(long jarg1, DataArray jarg1_, String jarg2);
  public final static native long DataArray_expansionOrigin__SWIG_0(long jarg1, DataArray jarg1_);
  public final static native void DataArray_expansionOrigin__SWIG_1(long jarg1, DataArray jarg1_, double jarg2);
  public final static native void DataArray_expansionOrigin__SWIG_2(long jarg1, DataArray jarg1_, long jarg2);
  public final static native void DataArray_polynomCoefficients__SWIG_0(long jarg1, DataArray jarg1_, long jarg2);
  public final static native long DataArray_polynomCoefficients__SWIG_1(long jarg1, DataArray jarg1_);
  public final static native void DataArray_polynomCoefficients__SWIG_2(long jarg1, DataArray jarg1_, long jarg2);
  public final static native long DataArray_dimensions__SWIG_0(long jarg1, DataArray jarg1_, long jarg2);
  public final static native long DataArray_dimensions__SWIG_1(long jarg1, DataArray jarg1_);
  public final static native long DataArray_dimensionCount(long jarg1, DataArray jarg1_);
  public final static native long DataArray_getDimension(long jarg1, DataArray jarg1_, long jarg2);
  public final static native long DataArray_appendSetDimension(long jarg1, DataArray jarg1_);
  public final static native long DataArray_appendRangeDimension(long jarg1, DataArray jarg1_, long jarg2);
  public final static native long DataArray_appendSampledDimension(long jarg1, DataArray jarg1_, double jarg2);
  public final static native long DataArray_createSetDimension(long jarg1, DataArray jarg1_, long jarg2);
  public final static native long DataArray_createRangeDimension(long jarg1, DataArray jarg1_, long jarg2, long jarg3);
  public final static native long DataArray_createSampledDimension(long jarg1, DataArray jarg1_, long jarg2, double jarg3);
  public final static native boolean DataArray_deleteDimension(long jarg1, DataArray jarg1_, long jarg2);
  public final static native void DataArray_getDataDirect(long jarg1, DataArray jarg1_, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native void DataArray_setDataDirect(long jarg1, DataArray jarg1_, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long DataArray_dataExtent__SWIG_0(long jarg1, DataArray jarg1_);
  public final static native void DataArray_dataExtent__SWIG_1(long jarg1, DataArray jarg1_, long jarg2);
  public final static native long DataArray_dataType(long jarg1, DataArray jarg1_);
  public final static native void DataArray_appendData(long jarg1, DataArray jarg1_, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native void delete_DataArray(long jarg1);
  public final static native long new_SampledDimension__SWIG_0();
  public final static native long new_SampledDimension__SWIG_1(long jarg1);
  public final static native long new_SampledDimension__SWIG_3(long jarg1, SampledDimension jarg1_);
  public final static native long SampledDimension_index(long jarg1, SampledDimension jarg1_);
  public final static native long SampledDimension_dimensionType(long jarg1, SampledDimension jarg1_);
  public final static native long SampledDimension_label__SWIG_0(long jarg1, SampledDimension jarg1_);
  public final static native void SampledDimension_label__SWIG_1(long jarg1, SampledDimension jarg1_, String jarg2);
  public final static native void SampledDimension_label__SWIG_2(long jarg1, SampledDimension jarg1_, long jarg2);
  public final static native long SampledDimension_unit__SWIG_0(long jarg1, SampledDimension jarg1_);
  public final static native void SampledDimension_unit__SWIG_1(long jarg1, SampledDimension jarg1_, String jarg2);
  public final static native void SampledDimension_unit__SWIG_2(long jarg1, SampledDimension jarg1_, long jarg2);
  public final static native double SampledDimension_samplingInterval__SWIG_0(long jarg1, SampledDimension jarg1_);
  public final static native void SampledDimension_samplingInterval__SWIG_1(long jarg1, SampledDimension jarg1_, double jarg2);
  public final static native long SampledDimension_offset__SWIG_0(long jarg1, SampledDimension jarg1_);
  public final static native void SampledDimension_offset__SWIG_1(long jarg1, SampledDimension jarg1_, double jarg2);
  public final static native void SampledDimension_offset__SWIG_2(long jarg1, SampledDimension jarg1_, long jarg2);
  public final static native long SampledDimension_indexOf(long jarg1, SampledDimension jarg1_, double jarg2);
  public final static native double SampledDimension_positionAt(long jarg1, SampledDimension jarg1_, long jarg2);
  public final static native long SampledDimension_axis__SWIG_0(long jarg1, SampledDimension jarg1_, long jarg2, long jarg3);
  public final static native long SampledDimension_axis__SWIG_1(long jarg1, SampledDimension jarg1_, long jarg2);
  public final static native void delete_SampledDimension(long jarg1);
  public final static native long new_SetDimension__SWIG_0();
  public final static native long new_SetDimension__SWIG_1(long jarg1);
  public final static native long new_SetDimension__SWIG_3(long jarg1, SetDimension jarg1_);
  public final static native long SetDimension_index(long jarg1, SetDimension jarg1_);
  public final static native long SetDimension_dimensionType(long jarg1, SetDimension jarg1_);
  public final static native long SetDimension_labels__SWIG_0(long jarg1, SetDimension jarg1_);
  public final static native void SetDimension_labels__SWIG_1(long jarg1, SetDimension jarg1_, long jarg2);
  public final static native void SetDimension_labels__SWIG_2(long jarg1, SetDimension jarg1_, long jarg2);
  public final static native void delete_SetDimension(long jarg1);
  public final static native long new_RangeDimension__SWIG_0();
  public final static native long new_RangeDimension__SWIG_1(long jarg1);
  public final static native long new_RangeDimension__SWIG_3(long jarg1, RangeDimension jarg1_);
  public final static native long RangeDimension_index(long jarg1, RangeDimension jarg1_);
  public final static native long RangeDimension_dimensionType(long jarg1, RangeDimension jarg1_);
  public final static native long RangeDimension_label__SWIG_0(long jarg1, RangeDimension jarg1_);
  public final static native void RangeDimension_label__SWIG_1(long jarg1, RangeDimension jarg1_, String jarg2);
  public final static native void RangeDimension_label__SWIG_2(long jarg1, RangeDimension jarg1_, long jarg2);
  public final static native long RangeDimension_unit__SWIG_0(long jarg1, RangeDimension jarg1_);
  public final static native void RangeDimension_unit__SWIG_1(long jarg1, RangeDimension jarg1_, String jarg2);
  public final static native void RangeDimension_unit__SWIG_2(long jarg1, RangeDimension jarg1_, long jarg2);
  public final static native long RangeDimension_ticks__SWIG_0(long jarg1, RangeDimension jarg1_);
  public final static native void RangeDimension_ticks__SWIG_1(long jarg1, RangeDimension jarg1_, long jarg2);
  public final static native double RangeDimension_tickAt(long jarg1, RangeDimension jarg1_, long jarg2);
  public final static native long RangeDimension_indexOf(long jarg1, RangeDimension jarg1_, double jarg2);
  public final static native long RangeDimension_axis__SWIG_0(long jarg1, RangeDimension jarg1_, long jarg2, long jarg3);
  public final static native long RangeDimension_axis__SWIG_1(long jarg1, RangeDimension jarg1_, long jarg2);
  public final static native void delete_RangeDimension(long jarg1);
  public final static native long new_Dimension__SWIG_0();
  public final static native long new_Dimension__SWIG_1(long jarg1);
  public final static native long new_Dimension__SWIG_3(long jarg1, Dimension jarg1_);
  public final static native long new_Dimension__SWIG_4(long jarg1, SampledDimension jarg1_);
  public final static native long new_Dimension__SWIG_5(long jarg1, RangeDimension jarg1_);
  public final static native long new_Dimension__SWIG_6(long jarg1, SetDimension jarg1_);
  public final static native long Dimension_index(long jarg1, Dimension jarg1_);
  public final static native long Dimension_dimensionType(long jarg1, Dimension jarg1_);
  public final static native long Dimension_asSetDimension(long jarg1, Dimension jarg1_);
  public final static native long Dimension_asSampledDimension(long jarg1, Dimension jarg1_);
  public final static native long Dimension_asRangeDimension(long jarg1, Dimension jarg1_);
  public final static native void delete_Dimension(long jarg1);
  public final static native long new_File__SWIG_0();
  public final static native long new_File__SWIG_1(long jarg1, File jarg1_);
  public final static native long new_File__SWIG_2(long jarg1);
  public final static native long File_open__SWIG_0(String jarg1, int jarg2, int jarg3);
  public final static native long File_open__SWIG_1(String jarg1, int jarg2);
  public final static native long File_open__SWIG_2(String jarg1);
  public final static native long File_blockCount(long jarg1, File jarg1_);
  public final static native boolean File_hasBlock__SWIG_0(long jarg1, File jarg1_, String jarg2);
  public final static native boolean File_hasBlock__SWIG_1(long jarg1, File jarg1_, long jarg2, Block jarg2_);
  public final static native long File_getBlock__SWIG_0(long jarg1, File jarg1_, String jarg2);
  public final static native long File_getBlock__SWIG_1(long jarg1, File jarg1_, long jarg2);
  public final static native long File_createBlock(long jarg1, File jarg1_, String jarg2, String jarg3);
  public final static native boolean File_deleteBlock__SWIG_0(long jarg1, File jarg1_, String jarg2);
  public final static native boolean File_deleteBlock__SWIG_1(long jarg1, File jarg1_, long jarg2, Block jarg2_);
  public final static native long File_blocks__SWIG_0(long jarg1, File jarg1_, long jarg2);
  public final static native long File_blocks__SWIG_1(long jarg1, File jarg1_);
  public final static native boolean File_hasSection__SWIG_0(long jarg1, File jarg1_, String jarg2);
  public final static native boolean File_hasSection__SWIG_1(long jarg1, File jarg1_, long jarg2);
  public final static native long File_getSection__SWIG_0(long jarg1, File jarg1_, String jarg2);
  public final static native long File_getSection__SWIG_1(long jarg1, File jarg1_, long jarg2);
  public final static native long File_sectionCount(long jarg1, File jarg1_);
  public final static native long File_sections__SWIG_0(long jarg1, File jarg1_, long jarg2);
  public final static native long File_sections__SWIG_1(long jarg1, File jarg1_);
  public final static native long File_findSections__SWIG_0(long jarg1, File jarg1_, long jarg2, long jarg3);
  public final static native long File_findSections__SWIG_1(long jarg1, File jarg1_, long jarg2);
  public final static native long File_findSections__SWIG_2(long jarg1, File jarg1_, long jarg2);
  public final static native long File_findSections__SWIG_3(long jarg1, File jarg1_);
  public final static native long File_createSection(long jarg1, File jarg1_, String jarg2, String jarg3);
  public final static native boolean File_deleteSection__SWIG_0(long jarg1, File jarg1_, String jarg2);
  public final static native boolean File_deleteSection__SWIG_1(long jarg1, File jarg1_, long jarg2);
  public final static native long File_version(long jarg1, File jarg1_);
  public final static native String File_format(long jarg1, File jarg1_);
  public final static native String File_location(long jarg1, File jarg1_);
  public final static native long File_createdAt(long jarg1, File jarg1_);
  public final static native long File_updatedAt(long jarg1, File jarg1_);
  public final static native void File_setUpdatedAt(long jarg1, File jarg1_);
  public final static native void File_forceUpdatedAt(long jarg1, File jarg1_);
  public final static native void File_setCreatedAt(long jarg1, File jarg1_);
  public final static native void File_forceCreatedAt(long jarg1, File jarg1_, long jarg2);
  public final static native void File_close(long jarg1, File jarg1_);
  public final static native boolean File_isOpen(long jarg1, File jarg1_);
  public final static native long File_validate(long jarg1, File jarg1_);
  public final static native void delete_File(long jarg1);
  public final static native long new_Property__SWIG_0();
  public final static native long new_Property__SWIG_1(long jarg1, Property jarg1_);
  public final static native long new_Property__SWIG_2(long jarg1);
  public final static native String Property_name(long jarg1, Property jarg1_);
  public final static native void Property_definition__SWIG_0(long jarg1, Property jarg1_, String jarg2);
  public final static native long Property_definition__SWIG_1(long jarg1, Property jarg1_);
  public final static native void Property_definition__SWIG_2(long jarg1, Property jarg1_, long jarg2);
  public final static native void Property_mapping__SWIG_0(long jarg1, Property jarg1_, String jarg2);
  public final static native long Property_mapping__SWIG_1(long jarg1, Property jarg1_);
  public final static native void Property_mapping__SWIG_2(long jarg1, Property jarg1_, long jarg2);
  public final static native long Property_dataType(long jarg1, Property jarg1_);
  public final static native void Property_unit__SWIG_0(long jarg1, Property jarg1_, String jarg2);
  public final static native long Property_unit__SWIG_1(long jarg1, Property jarg1_);
  public final static native void Property_unit__SWIG_2(long jarg1, Property jarg1_, long jarg2);
  public final static native void Property_deleteValues(long jarg1, Property jarg1_);
  public final static native long Property_valueCount(long jarg1, Property jarg1_);
  public final static native void Property_values__SWIG_0(long jarg1, Property jarg1_, long jarg2);
  public final static native long Property_values__SWIG_1(long jarg1, Property jarg1_);
  public final static native void Property_values__SWIG_2(long jarg1, Property jarg1_, long jarg2);
  public final static native int Property_compare(long jarg1, Property jarg1_, long jarg2, Property jarg2_);
  public final static native void delete_Property(long jarg1);
  public final static native long new_Feature__SWIG_0();
  public final static native long new_Feature__SWIG_1(long jarg1, Feature jarg1_);
  public final static native long new_Feature__SWIG_2(long jarg1);
  public final static native void Feature_linkType__SWIG_0(long jarg1, Feature jarg1_, long jarg2);
  public final static native long Feature_linkType__SWIG_1(long jarg1, Feature jarg1_);
  public final static native void Feature_data__SWIG_0(long jarg1, Feature jarg1_, String jarg2);
  public final static native void Feature_data__SWIG_1(long jarg1, Feature jarg1_, long jarg2, DataArray jarg2_);
  public final static native long Feature_data__SWIG_2(long jarg1, Feature jarg1_);
  public final static native void delete_Feature(long jarg1);
  public final static native String link_type_to_string(long jarg1);
  public final static native long new_Section__SWIG_0();
  public final static native long new_Section__SWIG_1(long jarg1);
  public final static native long new_Section__SWIG_2(long jarg1, Section jarg1_);
  public final static native long new_Section__SWIG_3(long jarg1);
  public final static native void Section_repository__SWIG_0(long jarg1, Section jarg1_, String jarg2);
  public final static native long Section_repository__SWIG_1(long jarg1, Section jarg1_);
  public final static native void Section_repository__SWIG_2(long jarg1, Section jarg1_, long jarg2);
  public final static native void Section_link__SWIG_0(long jarg1, Section jarg1_, String jarg2);
  public final static native void Section_link__SWIG_1(long jarg1, Section jarg1_, long jarg2, Section jarg2_);
  public final static native long Section_link__SWIG_2(long jarg1, Section jarg1_);
  public final static native void Section_link__SWIG_3(long jarg1, Section jarg1_, long jarg2);
  public final static native void Section_mapping__SWIG_0(long jarg1, Section jarg1_, String jarg2);
  public final static native long Section_mapping__SWIG_1(long jarg1, Section jarg1_);
  public final static native void Section_mapping__SWIG_2(long jarg1, Section jarg1_, long jarg2);
  public final static native long Section_parent(long jarg1, Section jarg1_);
  public final static native long Section_sectionCount(long jarg1, Section jarg1_);
  public final static native boolean Section_hasSection__SWIG_0(long jarg1, Section jarg1_, String jarg2);
  public final static native boolean Section_hasSection__SWIG_1(long jarg1, Section jarg1_, long jarg2, Section jarg2_);
  public final static native long Section_getSection__SWIG_0(long jarg1, Section jarg1_, String jarg2);
  public final static native long Section_getSection__SWIG_1(long jarg1, Section jarg1_, long jarg2);
  public final static native long Section_sections__SWIG_0(long jarg1, Section jarg1_, long jarg2);
  public final static native long Section_sections__SWIG_1(long jarg1, Section jarg1_);
  public final static native long Section_findSections__SWIG_0(long jarg1, Section jarg1_, long jarg2, long jarg3);
  public final static native long Section_findSections__SWIG_1(long jarg1, Section jarg1_, long jarg2);
  public final static native long Section_findSections__SWIG_2(long jarg1, Section jarg1_);
  public final static native long Section_findRelated__SWIG_0(long jarg1, Section jarg1_, long jarg2);
  public final static native long Section_findRelated__SWIG_1(long jarg1, Section jarg1_);
  public final static native long Section_createSection(long jarg1, Section jarg1_, String jarg2, String jarg3);
  public final static native boolean Section_deleteSection__SWIG_0(long jarg1, Section jarg1_, String jarg2);
  public final static native boolean Section_deleteSection__SWIG_1(long jarg1, Section jarg1_, long jarg2, Section jarg2_);
  public final static native long Section_propertyCount(long jarg1, Section jarg1_);
  public final static native boolean Section_hasProperty__SWIG_0(long jarg1, Section jarg1_, String jarg2);
  public final static native boolean Section_hasProperty__SWIG_1(long jarg1, Section jarg1_, long jarg2, Property jarg2_);
  public final static native long Section_getProperty__SWIG_0(long jarg1, Section jarg1_, String jarg2);
  public final static native long Section_getProperty__SWIG_1(long jarg1, Section jarg1_, long jarg2);
  public final static native long Section_properties__SWIG_0(long jarg1, Section jarg1_, long jarg2);
  public final static native long Section_properties__SWIG_1(long jarg1, Section jarg1_);
  public final static native long Section_inheritedProperties(long jarg1, Section jarg1_);
  public final static native long Section_createProperty__SWIG_0(long jarg1, Section jarg1_, String jarg2, long jarg3);
  public final static native long Section_createProperty__SWIG_1(long jarg1, Section jarg1_, String jarg2, long jarg3);
  public final static native long Section_createProperty__SWIG_2(long jarg1, Section jarg1_, String jarg2, long jarg3);
  public final static native boolean Section_deleteProperty__SWIG_0(long jarg1, Section jarg1_, String jarg2);
  public final static native boolean Section_deleteProperty__SWIG_1(long jarg1, Section jarg1_, long jarg2, Property jarg2_);
  public final static native void delete_Section(long jarg1);
  public final static native long new_Source__SWIG_0();
  public final static native long new_Source__SWIG_1(long jarg1, Source jarg1_);
  public final static native long new_Source__SWIG_2(long jarg1);
  public final static native boolean Source_hasSource__SWIG_0(long jarg1, Source jarg1_, String jarg2);
  public final static native boolean Source_hasSource__SWIG_1(long jarg1, Source jarg1_, long jarg2, Source jarg2_);
  public final static native long Source_getSource__SWIG_0(long jarg1, Source jarg1_, String jarg2);
  public final static native long Source_getSource__SWIG_1(long jarg1, Source jarg1_, long jarg2);
  public final static native long Source_sourceCount(long jarg1, Source jarg1_);
  public final static native long Source_sources__SWIG_0(long jarg1, Source jarg1_, long jarg2);
  public final static native long Source_sources__SWIG_1(long jarg1, Source jarg1_);
  public final static native long Source_findSources__SWIG_0(long jarg1, Source jarg1_, long jarg2, long jarg3);
  public final static native long Source_findSources__SWIG_1(long jarg1, Source jarg1_, long jarg2);
  public final static native long Source_findSources__SWIG_2(long jarg1, Source jarg1_);
  public final static native long Source_createSource(long jarg1, Source jarg1_, String jarg2, String jarg3);
  public final static native boolean Source_deleteSource__SWIG_0(long jarg1, Source jarg1_, String jarg2);
  public final static native boolean Source_deleteSource__SWIG_1(long jarg1, Source jarg1_, long jarg2, Source jarg2_);
  public final static native void delete_Source(long jarg1);
  public final static native void Value_uncertainty_set(long jarg1, Value jarg1_, double jarg2);
  public final static native double Value_uncertainty_get(long jarg1, Value jarg1_);
  public final static native void Value_reference_set(long jarg1, Value jarg1_, String jarg2);
  public final static native String Value_reference_get(long jarg1, Value jarg1_);
  public final static native void Value_filename_set(long jarg1, Value jarg1_, String jarg2);
  public final static native String Value_filename_get(long jarg1, Value jarg1_);
  public final static native void Value_encoder_set(long jarg1, Value jarg1_, String jarg2);
  public final static native String Value_encoder_get(long jarg1, Value jarg1_);
  public final static native void Value_checksum_set(long jarg1, Value jarg1_, String jarg2);
  public final static native String Value_checksum_get(long jarg1, Value jarg1_);
  public final static native long new_Value__SWIG_0();
  public final static native long new_Value__SWIG_1(String jarg1);
  public final static native long new_Value__SWIG_5(long jarg1, Value jarg1_);
  public final static native void delete_Value(long jarg1);
  public final static native void Value_set__SWIG_0(long jarg1, Value jarg1_, long jarg2);
  public final static native void Value_set__SWIG_1(long jarg1, Value jarg1_, boolean jarg2);
  public final static native void Value_set__SWIG_2(long jarg1, Value jarg1_, long jarg2);
  public final static native void Value_set__SWIG_3(long jarg1, Value jarg1_, long jarg2);
  public final static native void Value_set__SWIG_4(long jarg1, Value jarg1_, long jarg2);
  public final static native void Value_set__SWIG_5(long jarg1, Value jarg1_, long jarg2);
  public final static native void Value_set__SWIG_6(long jarg1, Value jarg1_, double jarg2);
  public final static native void Value_set__SWIG_7(long jarg1, Value jarg1_, String jarg2);
  public final static native void Value_get__SWIG_1(long jarg1, Value jarg1_, long jarg2);
  public final static native void Value_get__SWIG_2(long jarg1, Value jarg1_, long jarg2);
  public final static native void Value_get__SWIG_3(long jarg1, Value jarg1_, long jarg2);
  public final static native void Value_get__SWIG_4(long jarg1, Value jarg1_, long jarg2);
  public final static native void Value_get__SWIG_5(long jarg1, Value jarg1_, long jarg2);
  public final static native void Value_get__SWIG_6(long jarg1, Value jarg1_, long jarg2);
  public final static native void Value_get__SWIG_7(long jarg1, Value jarg1_, long jarg2);
  public final static native void Value_get__SWIG_8(long jarg1, Value jarg1_, long jarg2);
  public final static native long Value_type(long jarg1, Value jarg1_);
  public final static native void Value_swap(long jarg1, Value jarg1_, long jarg2, Value jarg2_);
  public final static native boolean Value_supports_type(long jarg1);
  public final static native void swap(long jarg1, Value jarg1_, long jarg2, Value jarg2_);
}
