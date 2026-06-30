# Project state: Maven installed; moved to real project structure (Lesson 22)

Jonas asked how JUnit/Maven/Gradle relate to his syllabus (they're the concrete tools
for the "build & dependency management" and "TDD" bullets). Chose **Maven**. Big shift:
from single-file `javac` to a real project.

**Setup done (durable):**
- Apache Maven 3.9.9 installed at `C:\Users\dockx\tools\apache-maven-3.9.9` (user-level
  download+unzip; no winget package existed). `bin` added to user PATH.
- `JAVA_HOME` set (user) to `C:\Program Files\Eclipse Adoptium\jdk-21.0.11.10-hotspot`.
- New terminals get `mvn`; terminals opened before the install do not.
- First Maven project scaffolded at `hello-maven/` (pom.xml with JUnit 5.10.2 + surefire
  3.2.5, `Calculator` + `CalculatorTest`). `mvn test` verified green (1 test passes,
  BUILD SUCCESS). Deps cached in `~/.m2`.

**Implications:** Lesson 22 = Maven structure/commands (done-ish). Next: Lesson 23 =
JUnit + TDD (red-green-refactor) — the real entry to the eXtreme-programming block.
Recurring need: state *where files/commands go* explicitly. Keep using the default
package for now to match his single-file mental model unless a lesson needs packages.
