import static java.lang.Character.getNumericValue;

public class BowlingGame {

    public int calculateScoreFromFrames(String frames) {
        final int SPAREFACTOR = 10;
        final int NEXTFRAME = 2;
        final char STRIKESCORE = 'X';
        final int MAXSCOREFORFRAME = 10;
        int finalSumForAllFrames = 0;
        boolean doubleFirstRollOfNextFrame = false;
        boolean doubleBothRollsForNextFrame = false;

        int originalSumForFrame;
        int finalSumForFrame;
        int firstRollScore;
        int secondRollScore;
        char firstRoll;
        char secondRoll;
        int index = 0;
        while(index < frames.length()){
            firstRoll = frames.charAt(index);
            secondRoll = frames.charAt(index + 1);
            if (firstRoll == STRIKESCORE || secondRoll == STRIKESCORE){
                finalSumForFrame = MAXSCOREFORFRAME;
                doubleBothRollsForNextFrame = true;
            }else{
                firstRollScore = getNumericValue(firstRoll);
                secondRollScore = getNumericValue(secondRoll);
                originalSumForFrame = firstRollScore + secondRollScore;
                finalSumForFrame = originalSumForFrame;
                if (doubleFirstRollOfNextFrame){
                    finalSumForFrame += firstRollScore;
                    doubleFirstRollOfNextFrame = false;
                }
                if(doubleBothRollsForNextFrame){
                    finalSumForFrame = 2 * originalSumForFrame;
                }
                if(originalSumForFrame == SPAREFACTOR){
                    doubleFirstRollOfNextFrame = true;
                }
                doubleBothRollsForNextFrame = false;
            }
            finalSumForAllFrames += finalSumForFrame;
            index += NEXTFRAME;
        }
        return finalSumForAllFrames;
    }
}
