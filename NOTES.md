# Teaching Notes

Working notes and preferences for teaching Jonas.

## Background language: use Python, not JavaScript

- Jonas is **intermediate in Python**, beginner in JavaScript.
- When framing a new Java concept against something he knows, **always compare to Python**.
- Avoid JavaScript analogies — they don't land.
- Good comparison hooks: Python's dynamic typing vs Java's static typing, `python app.py` (interpret) vs `javac`/`java` (compile + run), Python's duck typing vs Java's interfaces, list/dict comprehensions vs Streams, `def` vs typed method signatures, indentation-blocks vs `{ }`.

## Style

- Learns by doing — keep lessons short, hands-on, end with a runnable task.
- Likes to **consolidate before advancing**. Effective review modes for him: explaining
  concepts back in his own words (his strongest — lead with it), mixed retrieval quizzes,
  and small integrative projects that recombine known patterns. Insert checkpoint/review
  lessons periodically, not just new-material lessons.
- **Direct, technical tone.** No emotional reassurance, no "you're not behind / no rush",
  no praise padding. When he's confused, explain the concept — don't comfort. Lead with
  the explanation or the next step. (Pace stays slow; tone is just plain.) See
  [[0011-communication-style-direct]].

## Tooling quirks
- Opening lessons via Bash `cmd.exe /c start "" "lessons\\..."` does NOT open the file in
  his environment. Use PowerShell `Start-Process "<path>"` instead, or just give him the
  clickable path and let him open it manually (he's fine doing that).

## Pace (IMPORTANT — corrected after Lesson 9)

- Lessons 7–9 went TOO FAST. One concept per turn with no consolidation overshot his
  zone of proximal development. He flagged "out of my depth."
- He'd been copying `public static void main` since Lesson 1 without understanding it —
  fluency without real understanding. Don't assume Java *structure/boilerplate* is
  understood just because the equivalent Python *concept* is.
- Rules: smaller steps; one tiny idea per lesson then a retrieval check then STOP;
  explain every piece of new syntax the first time; build in review/consolidation
  lessons; edit one file rather than spawning similarly-named new files; keep the
  workspace tidy; check in on pace explicitly (don't read "went well" as "go faster").
- See [[0010-pace-too-fast-consolidate]].

## Sequencing

- Wants a **dedicated Git lesson soon** (asked after Lesson 4). Plan: slot Git in
  as the next lesson, using his real workspace files as the thing to version. Then
  return to the OO thread (encapsulation) afterward.
- Pending OO thread: Lesson 5 was going to be encapsulation (`private` + getters);
  Git bumps in front of it.
- **GitHub is set up and working** over HTTPS — repo at github.com/JonasDockx/Learn_Java,
  successfully pushed. Auth handled by Git Credential Manager (no action needed).
- The `id_rsa` keys in `Documents/Programmeren/` are for a **Linux server, unrelated
  to GitHub** — do NOT propose reusing them for GitHub auth.

# Added a comment to see what changed in Git
