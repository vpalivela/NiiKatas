import static java.lang.Character.getNumericValue;

public class BowlingGame {

    public int calculateScoreFromFrames(String frames) {
        int finalSumForFrames = 0;
        int originalSumForFrame;
        int finalSumForFrame;
        int index = 0;
        boolean doubleFrameScore = false;

        while(index < frames.length()){
            originalSumForFrame = getNumericValue(frames.charAt(index)) + getNumericValue(frames.charAt(index + 1));
            finalSumForFrame = originalSumForFrame;
            if (doubleFrameScore){
                finalSumForFrame *=2;
            }
            if(originalSumForFrame == 10){
                doubleFrameScore = true;
            }
            finalSumForFrames += finalSumForFrame;
            index +=2;
        }
        return finalSumForFrames;
    }
}
