# Insight: discovered the string pool via `==` returning true

While doing Lesson 3, Jonas wrote `name == "Jonas"` expecting `false` (per the rule
taught) but got `true`. This is the string-pool / literal-interning special case:
two string *literals* share one pooled object, so `==` (identity) is accidentally
true. Demonstrated with `StringEquality.java` that runtime-built and `new String`
values give `==` false while `.equals()` is always true.

**Evidence:** Reported the unexpected `true`, then saw the contrast in the demo
output (literal==literal true; built/new ==literal false; .equals always true).

**Implications:** He has informally met the **primitive vs reference type**
distinction ahead of schedule — primitives hold a value, objects hold a reference,
and `==` compares references. Lesson 4 (objects/classes/references) should lean on
this concrete memory: "remember why `==` lied about your name? Here's the model
underneath it." Candidate glossary terms once Lesson 4 lands: reference type,
object, string pool.
