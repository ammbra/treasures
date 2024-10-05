# From native code gems to Java treasures

## Prerequisites

You need the following components to run the samples provided here:

* [JDK 22+](https://jdk.java.net/) installed on your machine.
* [jextract binaries](https://jdk.java.net/jextract/).
* Python installed for running the Python example.

## How to use the sample with C code

1. Obtain Java bindings to C by running in a terminal window:

```shell
# macOS compatible command
export C_INCLUDE_PATH=/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/usr/include
jextract --output src -t org.unix -I $C_INCLUDE_PATH $C_INCLUDE_PATH/time.h

# Linux
export C_INCLUDE_PATH=/usr/include/
jextract --output src -t org.unix -I $C_INCLUDE_PATH $C_INCLUDE_PATH/time.h
```

2. Run `TimeTranslator.java` with the following command:
3. 
```shell
# macOS and Linux compatible command
java --enable-native-access=ALL-UNNAMED --enable-preview --source 23 src/TimeTranslator.java
```

## How to use the sample with Python code

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

## How to use the sample for OpenGL 

In order to run successfully, the  following commands need also the presence of _compile_flags.txt_.

1. Dump of all the symbols encountered in a header file:

```shell
# macOS and Linux compatible command
jextract --output src \
    -l :/System/Library/Frameworks/GLUT.framework/GLUT \
    -I /opt/homebrew/Cellar/freeglut \
    -I /opt/homebrew/Cellar/mesa \
    -I /opt/homebrew/Cellar/mesa-glu \
    -t org.freeglut \
    --dump-includes glut.symbols \
    /opt/homebrew/Cellar/freeglut/3.6.0/include/GL/freeglut.h
```

2. Obtain Java bindings to OpenGL by running the filtering file:

```shell
# macOS and Linux compatible command
jextract --output src \
    -l :/System/Library/Frameworks/GLUT.framework/GLUT \
    -I /opt/homebrew/Cellar/freeglut \
    -I /opt/homebrew/Cellar/mesa \
    -I /opt/homebrew/Cellar/mesa-glu \
    -t org.freeglut @glut.symbols \
    /opt/homebrew/Cellar/freeglut/3.6.0/include/GL/freeglut.h
```

3. Run `Teapot.java` with:

```shell
java -XstartOnFirstThread --enable-native-access=ALL-UNNAMED src/Teapot.java
```

When debugging an application is useful to inspect the parameters passed to a native call. Code generated by jextract supports tracing of native calls, meaning parameters passed to native calls can be printed on the standard output.

To enable the tracing support, just pass the `-Djextract.trace.downcalls=true` flag as a VM argument when launching your application:

```shell
# macOS and Linux compatible command
java -XstartOnFirstThread -Djextract.trace.downcalls=true --enable-native-access=ALL-UNNAMED src/Teapot.java
```

