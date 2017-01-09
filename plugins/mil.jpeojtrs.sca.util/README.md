# Plugin mil.jpeojtrs.sca.util

A utility plugin.

## Complex numbers

The plugin provides a [JavaCC](https://javacc.java.net/) parser for complex numbers. The parser will validate their format and break them into components (see [src-jj](src-jj)). Classes are also provided to work with complex numbers in various formats (float, long, etc). Each provides the ability to convert between string and object format, as well as between CORBA `Any` and object format.

## Useful classes

* [AnyUtils](src/mil/jpeojtrs/sca/util/AnyUtils.java) - converts between native Java types and CORBA `Any`
* [CFErrorFormatter](src/mil/jpeojtrs/sca/util/CFErrorFormatter.java) - Formats CF CORBA exceptions for display
* [FeatureMapList](src/mil/jpeojtrs/sca/util/collections/FeatureMapList.java) - wraps an EMF `FeatureMap` to allow its contents to be cast as a specific type
