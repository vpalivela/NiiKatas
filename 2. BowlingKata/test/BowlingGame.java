import static java.lang.Character.getNumericValue;

public class BowlingGame {

    public int calculateScoreFromFrames(String frames) {
        final int SPAREFACTOR = 10;
        int finalSumForAllFrames = 0;
        boolean doubleFrameScore = false;

        int originalSumForFrame;
        int finalSumForFrame;
        int index = 0;
        while(index < frames.length()){
            originalSumForFrame = getNumericValue(frames.charAt(index)) + getNumericValue(frames.charAt(index + 1));
            finalSumForFrame = originalSumForFrame;
            if (doubleFrameScore){
                finalSumForFrame *=2;
            }
            if(originalSumForFrame == SPAREFACTOR){
                doubleFrameScore = true;
            }
            finalSumForAllFrames += finalSumForFrame;
            index +=2;
        }
        return finalSumForAllFrames;
    }
}
