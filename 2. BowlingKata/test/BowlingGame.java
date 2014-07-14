import static java.lang.Character.getNumericValue;

public class BowlingGame {

    public int calculateScoreFromFrames(String frames) {
        final int SPAREFACTOR = 10;
        int finalSumForAllFrames = 0;
        boolean doubleFirstRollOfNextFrame = false;
        boolean doubleBothRollsForNextFrame = false;

        int originalSumForFrame;
        int finalSumForFrame;
        int firstRollScore;
        int secondRollScore;
        int index = 0;
        while(index < frames.length()){
            char firstRoll = frames.charAt(index);
            char secondRoll = frames.charAt(index + 1);
            if (firstRoll == 'X' || secondRoll == 'X'){
                finalSumForFrame = 10;
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
            index +=2;
        }
        return finalSumForAllFrames;
    }
}
