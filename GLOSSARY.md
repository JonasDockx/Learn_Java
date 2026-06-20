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

## Git

**Repository**:
A folder Git is tracking — your files plus the full history of commits, stored in a hidden `.git/` directory. Created with `git init`.
_Avoid_: repo folder, project

**Commit**:
A sealed save point: a snapshot of the staged changes plus a message. Permanent and addressable in history.
_Avoid_: save, checkpoint

**Staging area**:
The set of changes selected (via `git add`) to go into the next commit. Sits between your live files and the repository.
_Avoid_: index, cache

**Branch**:
A movable pointer to a commit — an isolated line of work. Commits land on the current branch only; `main` sees them after a `merge`.
_Avoid_: fork, copy

**Remote**:
A linked copy of the repository hosted elsewhere (e.g. on GitHub), named `origin` by default. You `push` commits to it and `pull` commits from it.
_Avoid_: server, the cloud

**Pull request (PR)**:
A request on GitHub to merge one branch into another, providing the place where teammates review code before it joins `main`.
_Avoid_: merge request (that's GitLab's name), code review
