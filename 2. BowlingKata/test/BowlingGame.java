import static java.lang.Character.getNumericValue;

public class BowlingGame {

    public int calculateScoreFromFrames(String frames) {
        int sum = 0;
        for (int index = 0; index < frames.length(); index++){
            char numberChar = frames.charAt(index);
            sum += getNumericValue(numberChar);
        }
        return sum;
    }
}
