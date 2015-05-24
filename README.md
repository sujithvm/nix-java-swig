# nix-java-swig

Travis master: [![Build Status](https://travis-ci.org/sujithvm/nix-java-swig.svg?branch=master)](https://travis-ci.org/sujithvm/nix-java-swig)

NIX Java bindings using SWIG

### Compilation

```
$ swig -java -c++ -package org.gnode.nix -outdir java/org/gnode/nix -I/usr/local/include nix.i 
$ g++ -std=c++11 -fPIC -c nix_wrap.cxx -I/usr/lib/jvm/java-7-oracle/include -I/usr/lib/jvm/java-7-oracle/include/linux 
$ g++ -shared -o libnix_jni.so nix_wrap.o -lnix 
```

And while running Java codes

```
$ java -Djava.library.path=<path to libnix_jni.so> <ClassName>
```


### Tests

```
$ cd test/
$ javac -cp .:"../libs/*":"../java" org/gnode/nix/TestFile.java
$ java -cp .:"../libs/*":"../java" -Djava.library.path=.. org.junit.runner.JUnitCore org.gnode.nix.TestFile

```
