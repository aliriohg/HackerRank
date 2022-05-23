import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ResultNewYearChaos {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        int totalBribes = 0;
        int expectedFirst = 1;
        int expectedSecond = 2;
        int expectedThird = 3;

        for ( int i = 0; i < q.size(); ++i) {
            if (q.get(i) == expectedFirst) {
                expectedFirst = expectedSecond;
                expectedSecond = expectedThird;
                ++expectedThird;
            } else if (q.get(i) == expectedSecond) {
                ++totalBribes;
                expectedSecond = expectedThird;
                ++expectedThird;
            } else if (q.get(i) == expectedThird) {
                totalBribes += 2;
                ++expectedThird;
            } else {
                System.out.println("Too chaotic");
                return;
            }
        }

        System.out.println(totalBribes);
    }

}
