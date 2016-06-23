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

# Update IDL files
rm -rf ${rootdir}/plugins/idl.cf/idl/*
rm -rf ${rootdir}/plugins/idl.bulkio/idl/*
rm -rf ${rootdir}/plugins/idl.frontend/idl/*

cp -r ${cfdir}/src/idl/ossie ${rootdir}/plugins/idl.cf/idl
cp -r ${bulkiodir}/idl/ossie ${rootdir}/plugins/idl.bulkio/idl
mkdir -p ${rootdir}/plugins/idl.frontend/idl/redhawk/FRONTEND
cp -r ${frontenddir}/*.idl ${rootdir}/plugins/idl.frontend/idl/redhawk/FRONTEND

