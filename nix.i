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
	// File back-end constructors
	%ignore File::File(const std::shared_ptr<base::IFile> &);
	%ignore File::File(std::shared_ptr<base::IFile> &&);

	// Property back-end constructors
	%ignore Property::Property(const std::shared_ptr<base::IProperty> &);
	%ignore Property::Property(std::shared_ptr<base::IProperty> &&);

	// Feature back-end constructors
	%ignore Feature::Feature(const std::shared_ptr<base::IFeature> &);
	%ignore Feature::Feature(std::shared_ptr<base::IFeature> &&);

	// Section back-end constructors
	%ignore Section::Section(const std::shared_ptr<base::ISection> &);
	%ignore Section::Section(std::shared_ptr<base::ISection> &&);

	// Source back-end constructors
	%ignore Source::Source(const std::shared_ptr<base::ISource> &);
	%ignore Source::Source(std::shared_ptr<base::ISource> &&);
}

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

// Build bindings for FileMode and Implementation in IFile but ignore base IFile
%ignore nix::base::IFile;
%include <nix/base/IFile.hpp>

%include <nix/Block.hpp>
%include <nix/DataArray.hpp>
%include <nix/Dimensions.hpp>
%include <nix/File.hpp>
%include <nix/Property.hpp>
%include <nix/Feature.hpp>
%include <nix/Section.hpp>
%include <nix/Source.hpp>
%include <nix/Value.hpp>
