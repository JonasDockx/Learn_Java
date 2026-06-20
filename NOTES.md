# Teaching Notes

Working notes and preferences for teaching Jonas.

## Background language: use Python, not JavaScript

- Jonas is **intermediate in Python**, beginner in JavaScript.
- When framing a new Java concept against something he knows, **always compare to Python**.
- Avoid JavaScript analogies — they don't land.
- Good comparison hooks: Python's dynamic typing vs Java's static typing, `python app.py` (interpret) vs `javac`/`java` (compile + run), Python's duck typing vs Java's interfaces, list/dict comprehensions vs Streams, `def` vs typed method signatures, indentation-blocks vs `{ }`.

## Style

- Learns by doing — keep lessons short, hands-on, end with a runnable task.

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
