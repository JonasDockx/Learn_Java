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

## Object-oriented programming

**Encapsulation**:
Bundling data with the methods that guard it, and hiding the data behind `private` so it can only change through controlled, validating access. Enforced by the compiler.
_Avoid_: data hiding, information hiding

**Inheritance**:
A class taking on the fields and methods of a parent via `extends`, modelling an "is-a" relationship (a Dog is-a Animal).
_Avoid_: subclassing, deriving

**Polymorphism**:
Calling a method through a parent-typed reference and getting the actual object's version at runtime — so one piece of code works across every subtype.
_Avoid_: dynamic dispatch, late binding

**Override**:
A subclass replacing an inherited method with the same signature (marked `@Override`). Resolved at runtime by the object's real type.
_Avoid_: redefine

**Overload**:
Multiple methods in one class sharing a name but taking different parameters. Resolved at compile time by the arguments. (Not the same as override.)
_Avoid_: overriding

## Structure terms

**Body**:
The code inside a method's `{ }` — the steps it runs. A declaration ending in `;` with no `{ }` has no body.
_Avoid_: implementation block, contents

**Method signature**:
A method's identity: its name plus its parameter list. Says how to call it, not what it does.
_Avoid_: header, prototype

**State**:
The data an object currently holds — the values in its fields. An interface has no state.
_Avoid_: data, contents

**Implement**:
To write a method's body (provide the real code); and (`implements`) for a class to promise it provides every method of an interface.
_Avoid_: code up, fulfil

**Contract**:
A promise that certain methods exist, without specifying how they work. A concept; in Java an interface is a contract.
_Avoid_: agreement, spec

**Abstract class**:
A class that cannot be instantiated with `new`, existing only as a parent. May mix finished methods and abstract (body-less) methods that subclasses must implement.
_Avoid_: base class, virtual class

**Interface**:
A pure contract — only method signatures, no bodies and no state. A class `implements` it and must provide every method; a class can implement many.
_Avoid_: protocol, abstract class

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
