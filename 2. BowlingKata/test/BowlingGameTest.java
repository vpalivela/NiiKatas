import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {
    BowlingGame bowlingGame;

    @Before
    public void setUp(){
        bowlingGame = new BowlingGame();
    }

    @Test
    public void shouldHaveScoreOfZeroIfThereAreNoFrames(){
        int expectedScore = 0;
        String noFrames = "";

        assertEquals(expectedScore, bowlingGame.calculateScoreFromFrames(noFrames));
    }

    @Test
    public void shouldHaveScoreOfFiveForScoresTwoAndThree(){
        int expectedScore = 5;
        String oneFrame = "23";

        assertEquals(expectedScore, bowlingGame.calculateScoreFromFrames(oneFrame));
    }

    @Test
    public void shouldCalculateScoreForTenFramesBySummingDigitsInTheFrame(){
        String tenFrames = "31415390107133238009";
        int expectedScore = 63;

        assertEquals(expectedScore, bowlingGame.calculateScoreFromFrames(tenFrames));
    }

    @Test
    public void shouldDetectSpareInAFrameAndDoubleNextScore(){
        String twoFramesWithASpare = "3721";
        int expectedScore = 16;

        assertEquals (expectedScore, bowlingGame.calculateScoreFromFrames(twoFramesWithASpare));
    }
}
