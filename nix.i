/** 
	Module : nix	
*/
%module nix

%pragma(java) jniclasscode=%{
    static {
        System.loadLibrary("nix_jni");
    }
%}

%{
#include <nix/Block.hpp>
#include <nix/DataArray.hpp>
#include <nix/Tag.hpp>
#include <nix/MultiTag.hpp>
#include <nix/Dimensions.hpp>
#include <nix/File.hpp>
#include <nix/Property.hpp>
#include <nix/Feature.hpp>
#include <nix/Section.hpp>
#include <nix/Source.hpp>
#include <nix/Value.hpp>
#include <nix/DataView.hpp>
#include <nix/DataType.hpp>
#include <nix/base/ImplContainer.hpp>
#include <nix/base/Entity.hpp>
#include <nix/base/NamedEntity.hpp>
#include <nix/base/EntityWithSources.hpp>
#include <nix/base/EntityWithMetadata.hpp>
#include <nix/base/IFile.hpp>
#include <nix/base/IBlock.hpp>
#include <nix/base/IDataArray.hpp>
#include <nix/base/IMultiTag.hpp>
#include <nix/base/IDimensions.hpp>
#include <nix/base/IProperty.hpp>
#include <nix/base/IFeature.hpp>
#include <nix/base/ISection.hpp>
#include <nix/base/ITag.hpp>
#include <nix/base/ISource.hpp>
#include <nix/util/util.hpp>
#include <nix/util/filter.hpp>
#include <nix/util/dataAccess.hpp>
#include <nix/DataType.hpp>

using namespace nix;

typedef unsigned long long int ndsize_t;
typedef long long int          ndssize_t;
%}


%include "std_string.i"
%include "typemaps.i"
%include "std_vector.i"

#define NIXAPI
#define NOEXCEPT

/*
	Ignores
*/
namespace nix {

	// Back-end constructors
	%ignore Block::Block(const std::shared_ptr<base::IBlock> &);
	%ignore Block::Block(std::shared_ptr<base::IBlock> &&);
	%ignore DataArray::DataArray(const std::shared_ptr<base::IDataArray> &);
	%ignore DataArray::DataArray(std::shared_ptr<base::IDataArray> &&);
	%ignore SampledDimension::SampledDimension(const std::shared_ptr<base::ISampledDimension> &);
	%ignore SampledDimension::SampledDimension(std::shared_ptr<base::ISampledDimension> &&);	
	%ignore SetDimension::SetDimension(const std::shared_ptr<base::ISetDimension> &);
	%ignore SetDimension::SetDimension(std::shared_ptr<base::ISetDimension> &&);
	%ignore RangeDimension::RangeDimension(const std::shared_ptr<base::IRangeDimension> &);
	%ignore RangeDimension::RangeDimension(std::shared_ptr<base::IRangeDimension> &&);
	%ignore Dimension::Dimension(const std::shared_ptr<base::IDimension> &);
	%ignore Dimension::Dimension(std::shared_ptr<base::IDimension> &&);
	%ignore File::File(const std::shared_ptr<base::IFile> &);
	%ignore File::File(std::shared_ptr<base::IFile> &&);
	%ignore Property::Property(const std::shared_ptr<base::IProperty> &);
	%ignore Property::Property(std::shared_ptr<base::IProperty> &&);
	%ignore Feature::Feature(const std::shared_ptr<base::IFeature> &);
	%ignore Feature::Feature(std::shared_ptr<base::IFeature> &&);
	%ignore Section::Section(const std::shared_ptr<base::ISection> &);
	%ignore Section::Section(std::shared_ptr<base::ISection> &&);
	%ignore Source::Source(const std::shared_ptr<base::ISource> &);
	%ignore Source::Source(std::shared_ptr<base::ISource> &&);

	// Operators
	%ignore Block::operator= ;	
	%ignore DataArray::operator= ;
	%ignore SampledDimension::operator= ;
	%ignore SampledDimension::operator[] ;
	%ignore SetDimension::operator= ;
	%ignore RangeDimension::operator= ;
	%ignore RangeDimension::operator[] ;
	%ignore Dimension::operator= ;
	%ignore File::operator= ;
	%ignore Property::operator= ;
	%ignore Feature::operator= ;
	%ignore Section::operator= ;
	%ignore Source::operator= ;
	%ignore Value::operator= ;
}

// Ignore operators
%ignore operator<< ;
%ignore operator== ;
%ignore operator!= ;

/*
	Templates
*/
namespace nix {

}

/*
	Extensions
*/
namespace nix {	
	%extend nix::DataView {
		DataView();
	}  
}



/*
	Build bindings for following files
*/

// Build bindings for enums FileMode and Implementation in IFile but ignore base IFile
%ignore nix::base::IFile;
%include <nix/base/IFile.hpp>

// Build bindings for enum DimensionType but ignore base IDimension, ISampledDimension, ISetDimension, IRangeDimension
%ignore nix::base::IDimension;
%ignore nix::base::ISampledDimension;
%ignore nix::base::ISetDimension;
%ignore nix::base::IRangeDimension;
%include <nix/base/IDimensions.hpp>

// Build bindings for enum LinkType but ignore base IFeature
%ignore nix::base::IFeature;
%include <nix/base/IFeature.hpp>

%include <nix/Block.hpp>
%include <nix/DataArray.hpp>
%include <nix/Dimensions.hpp>
%include <nix/File.hpp>
%include <nix/Property.hpp>
%include <nix/Feature.hpp>
%include <nix/Section.hpp>
%include <nix/Source.hpp>
%include <nix/Value.hpp>
