/* Reusable quiz widget for the Learn Java course.
   Usage: a .quiz element with data-answer (index of correct .opt button)
   and an optional data-explain on each button.

   <div class="quiz" data-answer="2">
     <div class="q">Question text?</div>
     <button class="opt" data-explain="why this is wrong">Option A</button>
     <button class="opt" data-explain="why this is wrong">Option B</button>
     <button class="opt" data-explain="why this is right">Option C</button>
     <div class="feedback"></div>
   </div>

   Immediate, automatic feedback = the tight loop that builds storage strength. */

document.addEventListener("click", function (e) {
  const btn = e.target.closest(".quiz .opt");
  if (!btn) return;

  const quiz = btn.closest(".quiz");
  if (quiz.dataset.done === "true") return; // answer once

  const opts = Array.from(quiz.querySelectorAll(".opt"));
  const chosen = opts.indexOf(btn);
  const answer = parseInt(quiz.dataset.answer, 10);
  const feedback = quiz.querySelector(".feedback");

  opts.forEach((o) => (o.disabled = true));
  quiz.dataset.done = "true";

  if (chosen === answer) {
    btn.classList.add("correct");
    feedback.textContent = "✓ Correct. " + (btn.dataset.explain || "");
    feedback.style.color = "var(--good)";
  } else {
    btn.classList.add("wrong");
    opts[answer].classList.add("correct");
    feedback.textContent = "✗ Not quite. " + (btn.dataset.explain || "") +
      " The answer is highlighted in green.";
    feedback.style.color = "var(--bad)";
  }
});
