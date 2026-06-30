# Demonstrated: Advanced track integrated (Checkpoint B, Lesson 20)

Jonas passed the second checkpoint (Lessons 14–19). Part 1 (explain-it-yourself):
5/5 correct, only a vocabulary tighten needed (in try/catch he said "try/catch throws
an error" — clarified that the risky code throws and catch handles). Part 3 project:
built `Gradebook.java` integrating a `HashMap<String,Integer>`, two stream pipelines
(count passers, list passer names) with lambdas, generics, and a validating `addGrade`
wrapped in try/catch — output correct (Sophia added → size 7, "Bad" 120 rejected,
program continued). Even improved the exception message to include the offending name.

Build hurdle: step 4 — didn't know where statements go. Taught the rule (method defs at
class level; runnable statements inside a method body; throw inside the validating
method) and that addGrade needed the `put` after the guard. Resolved.

**Implications:** Foundations + Advanced language features are solid and integrated.
The recurring stumble is Java *program structure* — where code physically goes — more
than concepts. Keep stating placement explicitly. Next: debugging (rounds out the
Advanced bullet, no new tooling), then the shift toward build tools / XP practices.
