# Established: Java namespacing is the package, not the file

Jonas asked why `DogDemo` could use `Dog` with no import (Python requires importing
across files). Explained: Java's namespace unit is the **package** (a folder of
classes), not the file. Same-package classes see each other with no import; imports
are only for *other* packages. `java.lang` is auto-imported. `javac` resolves a
referenced class by name on the source path and compiles it on demand — hence the
"automatic" feel. He's using the default (unnamed) package.

**Evidence:** Noticed the difference himself and reasoned about it from his Python
mental model — a sign he's actively reconciling the two languages, not just copying.

**Implications:** Ready for `import` statements when we introduce `java.util`
(collections, Scanner) and, later, real named packages (`package com.…;`) and the
folder structure they imply. Candidate glossary terms once used in anger: package,
import, classpath.
