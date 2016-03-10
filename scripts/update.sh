#!/bin/sh

# Command-line interpretation
usage() {
  echo "Usage:"
  echo "    update.sh [CF repo dir] [BULKIO repo dir] [FRONTEND repo dir]"
  exit 1
}

if [ $# -ne 3 ]; then
  usage
fi

cfdir=$1
shift
if [ ! -d $cfdir ]; then
  echo "Invalid CF directory"
  exit 1
fi

bulkiodir=$1
shift
if [ ! -d $bulkiodir ]; then
  echo "Invalid BULKIO directory"
  exit 1
fi

frontenddir=$1
shift
if [ ! -d $frontenddir ]; then
  echo "Invalid FRONTEND directory"
  exit 1
fi

# Verify relative location of script
rootdir=`dirname $0`/..
if [ ! -d ${rootdir}/plugins ] || [ ! -d ${rootdir}/features ]; then
  echo "Script has been relocated"
  exit 1
fi

# Update DTD files
rm ${rootdir}/plugins/mil.jpeojtrs.sca.dmd/dtd/domainmanagerconfiguration.dtd
rm ${rootdir}/plugins/mil.jpeojtrs.sca.sad/dtd/softwareassembly.dtd
rm ${rootdir}/plugins/mil.jpeojtrs.sca.profile/dtd/profile.dtd
rm ${rootdir}/plugins/mil.jpeojtrs.sca.scd/dtd/softwarecomponent.dtd
rm ${rootdir}/plugins/mil.jpeojtrs.sca.spd/dtd/softpkg.dtd
rm ${rootdir}/plugins/mil.jpeojtrs.sca.dcd/dtd/deviceconfiguration.dtd
rm ${rootdir}/plugins/mil.jpeojtrs.sca.dpd/dtd/devicepkg.dtd
rm ${rootdir}/plugins/mil.jpeojtrs.sca.prf/dtd/properties.dtd

cp ${cfdir}/src/xml/dtd/domainmanagerconfiguration.dtd ${rootdir}/plugins/mil.jpeojtrs.sca.dmd/dtd
cp ${cfdir}/src/xml/dtd/softwareassembly.dtd ${rootdir}/plugins/mil.jpeojtrs.sca.sad/dtd
cp ${cfdir}/src/xml/dtd/profile.dtd ${rootdir}/plugins/mil.jpeojtrs.sca.profile/dtd
cp ${cfdir}/src/xml/dtd/softwarecomponent.dtd ${rootdir}/plugins/mil.jpeojtrs.sca.scd/dtd
cp ${cfdir}/src/xml/dtd/softpkg.dtd ${rootdir}/plugins/mil.jpeojtrs.sca.spd/dtd
cp ${cfdir}/src/xml/dtd/deviceconfiguration.dtd ${rootdir}/plugins/mil.jpeojtrs.sca.dcd/dtd
cp ${cfdir}/src/xml/dtd/devicepkg.dtd ${rootdir}/plugins/mil.jpeojtrs.sca.dpd/dtd
cp ${cfdir}/src/xml/dtd/properties.dtd ${rootdir}/plugins/mil.jpeojtrs.sca.prf/dtd

# Update IDL files
rm -rf ${rootdir}/plugins/idl.cf/idl/*
rm -rf ${rootdir}/plugins/idl.bulkio/idl/*
rm -rf ${rootdir}/plugins/idl.frontend/idl/*

cp -r ${cfdir}/src/idl/ossie ${rootdir}/plugins/idl.cf/idl
cp -r ${bulkiodir}/idl/ossie ${rootdir}/plugins/idl.bulkio/idl
cp -r ${frontenddir}/idl/redhawk ${rootdir}/plugins/idl.frontend/idl

