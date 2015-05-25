# nix-java-swig

Travis master: [![Build Status](https://travis-ci.org/sujithvm/nix-java-swig.svg?branch=master)](https://travis-ci.org/sujithvm/nix-java-swig)

Java bindings for NIX using SWIG

### Compilation

```
$ swig -java -c++ -package org.gnode.nix -outdir java/org/gnode/nix -I/usr/local/include nix.i 
$ g++ -std=c++11 -fPIC -c nix_wrap.cxx -I${JAVA_HOME}/include -I${JAVA_HOME}/include/linux
$ g++ -shared -o libnix_jni.so nix_wrap.o -L/usr/local/lib/ -Wl,-rpath,/usr/local/lib/ -lnix 
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

### Note

1. This project is still under development

### Important Links

  - [NIX library](https://github.com/G-Node/nix)
