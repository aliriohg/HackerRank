import java.util.ArrayList;
import java.util.List;

public class ResultArraysLeftRotation {
    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */


    public static List<Integer> rotLeft(List<Integer> a, int d) {
        Integer aux;
        List<Integer> list = new ArrayList<>(a);

        for (int i = 0; i < d; i++) {
            aux = list.get(0);
            list.remove(0);
            list.add(aux);
        }
        return list;
    }
}
