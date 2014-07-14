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

    @Test
    public void shouldHaveScoreOfFiveForScoresTwoAndThree(){
        int expectedScore = 5;
        String frames = "23";
        BowlingGame bowlingGame = new BowlingGame();

        assertEquals(expectedScore, bowlingGame.calculateScoreFromFrames(frames));
    }

    @Test
    public void shouldCalculateScoreForTenFramesBySummingDigitsInTheFrame(){
        String frames = "31415390107133238009";
        int expected = 63;
        BowlingGame bowlingGame = new BowlingGame();

        assertEquals(expected, bowlingGame.calculateScoreFromFrames(frames));
    }
}
