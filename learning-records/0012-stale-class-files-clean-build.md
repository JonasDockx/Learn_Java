# Gotcha: stale .class files hide compile errors (clean build)

In Lesson 11, deleting `Car`'s `sound()` (and in fact the whole `Car` class) produced
NO compile error. Cause: a leftover `Car.class` from an earlier lesson was still in the
directory, and `javac`/`java` resolve class names against any `.class` on the classpath,
not just current source. So `new Car()` silently bound to the phantom `Car.class`.
Proven by deleting all `*.class` and recompiling the identical source — it then failed
with "cannot find symbol: class Car."

**Implications / how to apply:**
- When compilation behaves impossibly, suspect stale bytecode → clean build
  (`del *.class` / `rm *.class`, or `mvn clean` / `gradle clean` later).
- The workspace had accumulated many `.class` files from lesson to lesson; all deleted
  during this diagnosis (regenerable, gitignored).
- Reinforces why `.class` is gitignored and, later, why build tools manage a clean
  `target/`. Good concrete motivation for build tools when that lesson comes.
- Lesson 11 HTML patched with a "stale .class" callout.
