import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ResultRepeatedString {
    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        List<String> sList = Arrays.asList(s.split(""));
        long countRepet = n / s.length();
        int restos = (int) (n % s.length());
        String restosString = s.substring(0, restos);
        List<String> restosList = Arrays.asList(restosString.split(""));
        long count = 0;

            long aux = sList.stream().filter(e -> e.equals("a")).collect(Collectors.toList()).stream().count();
            aux = aux * countRepet;
            aux = aux + restosList.stream().filter(e -> e.equals("a")).collect(Collectors.toList()).stream().count();
            if (aux > count) {
                count = aux;
            }

        return count;
    }

}
