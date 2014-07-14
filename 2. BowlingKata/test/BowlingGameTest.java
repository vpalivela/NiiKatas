import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {
    @Test
    public void shouldHaveScoreOfZeroIfThereAreNoFrames(){
        int expectedScore = 0;
        String frames = "";
        BowlingGame bowlingGame = new BowlingGame();

        assertEquals(expectedScore, bowlingGame.calculateScoreFromFrames(frames));
    }
}
