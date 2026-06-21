# Misconception corrected: `private` is per-class, not per-object

During Lesson 7, Jonas put `main` inside `Dog` and found `d.age = -100;` compiled
with no error — expecting the private wall to block it. The reason: `private` means
"accessible anywhere within the same class," so a `main` that lives inside `Dog`
has full access to any `Dog`'s private fields. The wall only appears from a
*different* class (demonstrated by moving the code to a separate `DogDemo.java`,
which then fails to compile with "age has private access in Dog").

**Evidence:** Reported the missing compile error; root cause was main-inside-the-class.

**Implications:** He now has the precise model (class-level, not object-level access),
and incidentally the idiom of splitting a class from a separate runner/demo class —
which sets up testing later. Lesson 7's "Do this now" was corrected to use a
separate `DogDemo.java`. Watch for the same per-class-vs-per-object subtlety when
teaching `protected`, inner classes, and `equals()` (which often reads another
object's private fields — legal precisely because it's the same class).
