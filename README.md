# nix-java-swig
NIX Java bindings using SWIG

### Compilation

```
$ swig -java -c++ -outdir java -I/usr/local/include nix.i ;
$ g++ -std=c++11 -fPIC -c nix_wrap.cxx -I/usr/lib/jvm/java-7-oracle/include -I/usr/lib/jvm/java-7-oracle/include/linux 
$ g++ -shared -o libnix_jni.so nix_wrap.o -lnix 
```

And while running Java codes

```
$ java -Djava.library.path=/home/sujith/nix/swig <ClassName>
```
