import static java.lang.Character.getNumericValue;

public class BowlingGame {

    public int calculateScoreFromFrames(String frames) {
        final int SPAREFACTOR = 10;
        int finalSumForAllFrames = 0;
        boolean doubleFirstRollOfNextFrame = false;

        int originalSumForFrame;
        int finalSumForFrame;
        int firstRollScore;
        int secondRollScore;
        int index = 0;
        while(index < frames.length()){
            firstRollScore = getNumericValue(frames.charAt(index));
            secondRollScore = getNumericValue(frames.charAt(index + 1));
            originalSumForFrame = firstRollScore + secondRollScore;
            finalSumForFrame = originalSumForFrame;
            if (doubleFirstRollOfNextFrame){
                finalSumForFrame += firstRollScore;
            }
            if(originalSumForFrame == SPAREFACTOR){
                doubleFirstRollOfNextFrame = true;
            }
            finalSumForAllFrames += finalSumForFrame;
            index +=2;
        }
        return finalSumForAllFrames;
    }
}
