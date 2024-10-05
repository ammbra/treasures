# From native code gems to Java treasures

## Prerequisites

You need the following components to run the samples provided here:

* [JDK 22+](https://jdk.java.net/) installed on your machine.
* [jextract binaries](https://jdk.java.net/jextract/).
* Python installed for running the Python example.

## How to use the sample that  Python

1. Obtain Java bindings to Python by running in a terminal window:

```shell
# macOS and Linux compatible command
jextract --output src \                                                                  
    -l :/Library/Frameworks/Python.framework/Versions/3.11/lib/libpython3.11.dylib \
    -I $/Library/Frameworks/Python.framework/Versions/3.11/include/python3.11 \
    -t org.python \
    /Library/Frameworks/Python.framework/Versions/3.11/include/python3.11/Python.h
```

2. Run `PyDukerMaker.java` with the following command:

```shell
# macOS and Linux compatible command
java --enable-native-access=ALL-UNNAMED --enable-preview --source 23 src/PyDukeMaker.java
```

## How to use the sample concerning OpenGL 
