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

using namespace nix;

%}


%include "std_string.i"
%include "std_vector.i"
%include "stdint.i"
%include "cpointer.i"
%include "typemaps.i"


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

	// ignore overloaded null constructor
	%ignore Section::Section(std::nullptr_t); 

	// ignore conflicting overloaded constructors
	%ignore Value::Value(char *); 
	%ignore Value::Value(Value &&); 

	// ignore none_t setter and getter
	%ignore Value::set(none_t);
	%ignore Value::get(none_t &) const;

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

namespace std {
	%template(IntVector)        vector<int>;
	%template(DoubleVector)     vector<double>;
	%template(StringVector)     vector<std::string>;

	%template(BlockVector)      vector<nix::Block>;
	%template(DataArrayVector)  vector<nix::DataArray>;
	%template(DimensionVector)  vector<nix::Dimension>;
	%template(PropertyVector)   vector<nix::Property>;
	%template(SectionVector)    vector<nix::Section>;
	%template(SourceVector)     vector<nix::Source>;
	%template(ValueVector)      vector<nix::Value>;
}

// wrap time_t to long
typedef long long time_t;

// wrap ndsize_t, ndssize_t to long
// Note : 
//       Actual definition : typedef unsigned long long int ndsize_t;
//       Used here         : typedef long long int ndsize_t;
//       Reason            : SWIG converts 'unsigned long long int' types to java.util.BigInteger
typedef long long int ndsize_t;
typedef long long int ndssize_t;

// for get functions of Value which passes by reference
%apply bool     & OUTPUT { bool     & out   };
%apply int32_t  & OUTPUT { int32_t  & value };
%apply uint32_t & OUTPUT { uint32_t & value };
%apply int64_t  & OUTPUT { int64_t  & value };
%apply uint64_t & OUTPUT { uint64_t & value };
%apply double   & OUTPUT { double   & value };
// fix required for std::string&
%apply std::string& OUTPUT { std::string & value };

// modifying functions that accept none_t argument
// using following typemap, argument is omitted and automatically filled out with boost::none via an assignment before the function gets called.
%typemap(in,numinputs=0) boost::none_t %{
    $1 = boost::none;
%}
%import <nix/None.hpp>
%rename (removeLabel)                nix::DataArray::label(const none_t);
%rename (removeUnit)                 nix::DataArray::unit(const none_t);
%rename (removeExpansionOrigin)      nix::DataArray::expansionOrigin(const none_t);
%rename (removePolynomCoefficients)  nix::DataArray::polynomCoefficients(const none_t);
%rename (removeLabel)                nix::RangeDimension::label(const none_t);
%rename (removeUnit)                 nix::RangeDimension::unit(const none_t);
%rename (removeLabel)                nix::SampledDimension::label(const none_t);
%rename (removeUnit)                 nix::SampledDimension::unit(const none_t);
%rename (removeOffset)               nix::SampledDimension::offset(const boost::none_t);
%rename (removeLabels)               nix::SetDimension::labels(const boost::none_t);
%rename (removeRepository)           nix::Section::repository(const boost::none_t);
%rename (removeLink)                 nix::Section::link(const boost::none_t);
%rename (removeMapping)              nix::Section::mapping(const boost::none_t);
%rename (removeDefinition)           nix::Property::definition(const none_t);
%rename (removeMapping)              nix::Property::mapping(const boost::none_t);
%rename (removeUnit)                 nix::Property::unit(const boost::none_t);
%rename (removeValues)               nix::Property::values(const boost::none_t);


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

%include <nix/DataType.hpp>
%include <nix/Dimensions.hpp>
%include <nix/Source.hpp>
%include <nix/DataArray.hpp>
%include <nix/Feature.hpp>
%include <nix/Value.hpp>
%include <nix/Property.hpp>
%include <nix/Section.hpp>
%include <nix/Block.hpp>
%include <nix/File.hpp>
