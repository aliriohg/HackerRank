import java.util.*;
import java.util.stream.Collectors;

class ResultJumpingOnTheClouds {
    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     * jump 1 or 2
     */


    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int jumps = 0;
        for (int i = 1; i < c.size(); i++) {
            if (i + 1 < c.size() && c.get(i + 1).equals(0)) {
                jumps++;
                i++;
            } else if (c.get(i).equals(0)) {
                jumps++;
            }
        }
        return jumps;
    }
}

