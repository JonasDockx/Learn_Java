# Java Glossary

Canonical language for this course. All lessons use these terms. Entries are
added only once Jonas has demonstrated he understands them.

## The toolchain

**Source**:
The human-readable `.java` file you write. Not what runs — it must be compiled first.
_Avoid_: code file, script

**Bytecode**:
The `.class` file `javac` produces from source. An intermediate the JVM executes — not human-readable, not native machine code.
_Avoid_: compiled code, binary

**JVM (Java Virtual Machine)**:
The program that executes bytecode. The reason the same `.class` file runs unchanged on any operating system ("write once, run anywhere").
_Avoid_: the runtime, the interpreter

**JDK (Java Development Kit)**:
The full install bundle — compiler, JVM, and tools. What you install to develop Java (vs a JRE, which only runs it).
_Avoid_: Java, the SDK

**javac**:
The compiler. Turns `.java` source into `.class` bytecode, rejecting code whose types don't check out.
_Avoid_: the builder

**java**:
The launcher. Starts the JVM and runs a compiled class's `main` method. Takes the class name, no `.class` extension.
_Avoid_: the runner

## Types & variables

**Static typing**:
Every variable has a type fixed at declaration that never changes; `javac` rejects code that violates those types before producing bytecode. (Python is dynamically typed — the value carries the type, not the variable.)
_Avoid_: strong typing, type safety

**Primitive**:
A simple built-in value type written lowercase: `int`, `double`, `boolean`, `char`, `long`. Holds the value directly, not an object.
_Avoid_: basic type, value type

**var**:
A keyword that lets the compiler infer a variable's type from its initial value. The type is still fixed and static — `var` only saves you writing it.
_Avoid_: dynamic type, any
