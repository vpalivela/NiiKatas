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
    public void shouldHaveScoreOfZeroIfFramesAreAllGutters(){
        int expectedScore = 0;
        String noFrames = "00000000000000000000";

        assertEquals(expectedScore, bowlingGame.calculateScoreFromFrames(noFrames));
    }

    @Test
    public void shouldHaveScoreOfFiveForScoresTwoAndThree(){
        int expectedScore = 5;
        String oneFrame = "23000000000000000000";

        assertEquals(expectedScore, bowlingGame.calculateScoreFromFrames(oneFrame));
    }

    @Test
    public void shouldCalculateScoreForTenFramesBySummingDigitsInTheFrame(){
        String tenFrames = "31415390107133238009";
        int expectedScore = 63;

        assertEquals(expectedScore, bowlingGame.calculateScoreFromFrames(tenFrames));
    }

    @Test
    public void shouldDetectSpareInAFrameAndDoubleNextRollsScore(){
        String twoFramesWithASpare = "37210000000000000000";
        int expectedScore = 15;

        assertEquals (expectedScore, bowlingGame.calculateScoreFromFrames(twoFramesWithASpare));
    }

    @Test
    public void shouldNotDoubleSubsequentRollsScoreIfFrameFollowingASpareIsNotASpare(){
        String twoFramesWithASpare = "37212300000000000000";
        int expectedScore = 20;

        assertEquals (expectedScore, bowlingGame.calculateScoreFromFrames(twoFramesWithASpare));
    }

    @Test
    public void shouldDetectStrikeInAFrameAndDoubleNextFramesScore(){
        String twoFramesWithASpare = "X-210000000000000000";
        int expectedScore = 16;

        assertEquals (expectedScore, bowlingGame.calculateScoreFromFrames(twoFramesWithASpare));
    }

    @Test
    public void shouldNotKeepDoublingSubsequentScoresIfFrameFollowingAStrikeIsNotAStrike(){
        String twoFramesWithASpare = "X-214200000000000000";
        int expectedScore = 22;

        assertEquals (expectedScore, bowlingGame.calculateScoreFromFrames(twoFramesWithASpare));
    }
}
