import java.util.Arrays;
import java.util.List;

public class ResultCountingValleys {
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        List<String> listPath = Arrays.asList(path.split(""));
        int countD = 0;
        int countU = 0;
        int countValley = 0;
        String firstStep = "";
        for (int i = 0; i < steps; i++) {
            if (countD == 0 && countU == 0) {
                firstStep = listPath.get(i);
            }
            if (listPath.get(i).equals("D")) {
                countD++;
            } else {
                countU++;
            }
            if (countD == countU) {
                if(firstStep.equals("D")){
                    countValley++;
                }
                firstStep = "";
                countD = 0;
                countU = 0;
            }
        }
        return countValley;
    }
}
