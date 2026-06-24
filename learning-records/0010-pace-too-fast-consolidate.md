# Feedback: pace overshot — consolidate, don't advance

After Lesson 9 (abstraction), Jonas said he was "out of my depth" and "we have gone
too far," and — critically — "I don't even know what `public static void main` means."
He has been copying the `main` boilerplate since Lesson 1 without understanding it:
fluency (copying) without storage strength (understanding).

**Why it matters:** The OO lessons (7–9) advanced one concept per turn with no
consolidation, and assumed Java *structure* (main, class/file layout, why a separate
test class) was understood because Python fundamentals were. That assumption was
wrong. Symptom: file-name sprawl (Animal vs AnimalAbstract) and an inability to start
the multi-part exercise.

**How to apply going forward:**
- STOP advancing the syllabus until footing is rebuilt. Next artifact is a *step back*:
  decode `public static void main(String[] args)` piece by piece (it doubles as a review
  of access modifiers, static/class-vs-object, return types, arrays).
- Smaller steps. One tiny idea per lesson, then a retrieval check, then STOP.
- Don't assume Java boilerplate is understood just because the Python concept is —
  explain every piece of syntax the first time it appears.
- Prefer editing ONE file over creating new similarly-named files. Keep the workspace
  small and tidy to reduce cognitive load.
- Check in on pace explicitly rather than assuming "went well" == "ready for more."
- Build in consolidation/review lessons that revisit, not just extend.

Supersedes the brisk-pace assumption in [[0001-prior-experience-and-starting-point]].
