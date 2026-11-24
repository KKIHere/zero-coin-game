   API: view() gives the calling class an Element; setScore(int) displays the
   supplied score; setCaption(String) changes the caption while retaining the
   displayed value. Existing new ScoreDisplay() calls still work, so this is a
   compatible improvement.

- Caption "Coins" set in setup: collected a coin.
  Expected: "Coins: 1". Observed: expectation correct.
- Caption changed inside the coin-collection block after setScore:
  Expected: "Coins: 1" (value kept). Observed:  expectation correct.ii
- Restored caption "Score": collected one coin.
  Expected: "Score: 1". Observed: expectation correct.
- Finished and restarted the game twice. Expected: display resets and
  works again. Observed: expectation correct.
- Arrows, each WASD key, W+D diagonal, Right+D same
  speed as Right, A+Right cancel, W+Down cancel, focus loss, Restart.
  Expected: opposite moves cancel when pressed together and everything else still works. Observed: expectation correct.