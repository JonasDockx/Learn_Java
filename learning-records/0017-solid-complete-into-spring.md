# Milestone: SOLID complete; entering Spring

Jonas worked through all five SOLID principles (Lessons 27–31): SRP, OCP, LSP, ISP,
DIP. Ended on Dependency Inversion with a correct hand-written constructor-injection
example (`DependencyInjection.java`: MessageSender interface, EmailSender, injected
NotificationService).

**Pattern observed across this block:** he grasps the *design concepts* well (his
prose answers on SRP/OCP/Liskov were sound) but repeatedly stumbles on Java *program
structure / syntax mechanics* when writing it himself — needed help with: where fields
go, `void` (came up 3+ times — the "method returns nothing, called for its effect"
framing finally landed), inner-vs-top-level classes (the `this cannot be referenced
from a static context` error), and filling in interface method bodies. Concepts solid,
mechanics still fragile. Keep stating structure explicitly and expect to coach the
"how do I write this" step on each hands-on.

**Implications:** DIP → Spring is the natural bridge (Spring automates the injection he
just did by hand). Next: scaffold a minimal Spring Boot project (`spring-demo/`, package
`com.jonas.demo`) demonstrating @Component/@Service + constructor injection with no
`new` in user code. This also introduces real *packages* for the first time (Spring
needs them; default package is discouraged in Boot). Keep lessons small; Spring is large.
